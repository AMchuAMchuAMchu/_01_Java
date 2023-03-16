package com.atguigu.testgeneric;

public class DefineGenericClass1001<T> {

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public T getAnime() {
        return anime;
    }

    public void setAnime(T anime) {
        this.anime = anime;
    }

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
