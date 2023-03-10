package com.atguigu.basic;

public class Dog1002 extends Animal1002{

    private String name = "我是狗..";

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    public void excrete(){
        System.out.println("狗也会排泄..");
    }

}
