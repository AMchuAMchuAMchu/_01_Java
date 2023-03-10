package com.atguigu.basic;

public class Dog1001 implements Animal1001{

    private String name = "我是狗..";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void eat(){
        System.out.println("狗爱吃骨头..");
    }

}
