package com.atguigu.basic;

public class SingletonHungry {

    static User user = new User();

    public static User getUser(){
        return user;
    }



}
