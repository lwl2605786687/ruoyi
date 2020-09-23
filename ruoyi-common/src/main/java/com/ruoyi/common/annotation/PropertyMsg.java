package com.ruoyi.common.annotation;

import java.lang.annotation.*;

/**
 * @author LWL
 * @create 2020-07-06 9:34
 * 自定义注解类
 */
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Inherited
public @interface PropertyMsg {
    String enumStr() default "";
    String value() default "";
}
