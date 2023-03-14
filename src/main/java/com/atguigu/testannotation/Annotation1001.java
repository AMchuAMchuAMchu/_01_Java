package com.atguigu.testannotation;

public class Annotation1001 {

    @Deprecated
    public void testPrint(){

        System.out.println(">>>");
        System.out.println(">>>");

    }

    @SuppressWarnings(value = {"all"})
    public void eat(){
        int o = 10/0;
        System.out.println("雪乃爱吃昆虫...");
    }

    @Override
    public String toString(){
        return  ("无情嘲讽...");
    }

}
