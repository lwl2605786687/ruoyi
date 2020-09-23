package com.ruoyi.common.utils;


import com.ruoyi.common.annotation.PropertyMsg;

import java.beans.PropertyDescriptor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

;
//import com.sun.deploy.util.StringUtils;

/**
 * @author LWL
 * @create 2020-07-06 9:42
 */
public class ToGetAttributeNameUtil {
    public static<T>  String toGetAttributeName(Field[] fields, T pojo1, T pojo2, StringBuilder str, Class clazz, Class clazz1){
        for(Field x : fields){
            //如果两个对象没有一个进行注解标注
            if(x.isAnnotationPresent(PropertyMsg.class)) {
                try {
                    PropertyDescriptor pd = new PropertyDescriptor(x.getName(), clazz);
                    PropertyDescriptor pd1 = new PropertyDescriptor(x.getName(), clazz1);
                    // 获取对应属性值
                    Method getMethod = pd.getReadMethod();
                    Object o1 = getMethod.invoke(pojo1);
                    Method getMethod1 = pd1.getReadMethod();
                    Object o2 = getMethod1.invoke(pojo2);
                    if (o1 == null && o2 == null) {
                        continue;
                    }
                    if (o1 == null){
                        o1="";
                    }
                    if (o2 == null){
                        o2="";
                    }
                    if (!o1.toString().equals(o2.toString())) {
                        if (StringUtils.isNotBlank(x.getAnnotation(PropertyMsg.class).enumStr())) {
                            Map<String, String> stringStringMap = Arrays.stream(x.getAnnotation(PropertyMsg.class).enumStr().split("\\|"))
                                    .map(s -> {
                                        //如果注解开头枚举为空则赋值"" 应对叠单标记等问题
                                        String[] split = s.split(",");
                                        if(split.length == 1){
                                            String[] s1 = new String[2];
                                            s1[0] = "";
                                            s1[1] = split[0];
                                            return s1;
                                        }
                                        return split;
                                    })
                                    .collect(Collectors.toMap(b -> b[0].trim(), b -> b[1].trim()));
                            o1 = stringStringMap.get(o1.toString());
                            o2 = stringStringMap.get(o2.toString());
                        }
                        str.append( x.getAnnotation(PropertyMsg.class).value() + ":" + " 由 \"" + o1 + "\"改为\"" + o2 + "\";");
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }

        return str.toString();
    }
}
