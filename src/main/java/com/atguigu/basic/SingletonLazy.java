package com.atguigu.basic;

public class SingletonLazy {

    static User user;

    public static User getUser(){
        if (user == null){
            return new User();
        }
        return user;
    }

}
