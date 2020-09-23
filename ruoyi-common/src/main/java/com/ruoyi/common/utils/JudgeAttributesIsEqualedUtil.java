package com.ruoyi.common.utils;

import java.lang.reflect.Field;

/**
 * @author LWL
 * @create 2020-07-06 9:41
 */
public class JudgeAttributesIsEqualedUtil<T> {
    public static <T> String contrastObj(Object oldBean, Object newBean) {
        // 创建字符串拼接对象
        StringBuilder str = new StringBuilder();
        // 转换为传入的泛型T
        T pojo1 = (T) oldBean;
        T pojo2 = (T) newBean;
        // 通过反射获取类的Class对象
        Class clazz = pojo1.getClass();
        Class clazz1 = pojo2.getClass();
        // 获取类型及字段属性
        Field[] fields = clazz1.getDeclaredFields();
        return ToGetAttributeNameUtil.toGetAttributeName(fields, pojo1, pojo2, str,clazz,clazz1);
    }
}
