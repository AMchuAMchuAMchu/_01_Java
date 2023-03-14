package com.atguigu.testannotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

/**
 * @author wuyq
 * @create 2023-03-14 17:48:17
 */
@Target(value = ElementType.METHOD)
public @interface MyAnnotation1001 {

    String value() default "hello";

}
