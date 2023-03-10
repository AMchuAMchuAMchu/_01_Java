package com.atguigu.basic;

public class Animal1002 {

    private final String COLOR = "黄色" ;

    public final void call(){
        System.out.println("动物会叫...");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name = "我是Animal1002";

    public void excrete(){
        System.out.println("Animal都会排泄...");
    }

}
