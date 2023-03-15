package com.atguigu.testgeneric;

public class DefineGenericClass1001<T> {

    String name;
    int age;
    T anime;

    public DefineGenericClass1001(String name, int age, T anime) {
        this.name = name;
        this.age = age;
        this.anime = anime;
    }

    public DefineGenericClass1001() {
    }

    @Override
    public String toString() {
        return "DefineGenericClass1001{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", anime=" + anime +
                '}';
    }
}
