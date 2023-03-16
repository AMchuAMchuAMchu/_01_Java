package com.atguigu.testreflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Testreflect {

    private String name;
    private int age;

    public Testreflect(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Testreflect{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public Testreflect() {
    }

    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {


        Class<Testreflect> testreflectClass = Testreflect.class;

        Constructor<Testreflect> declaredConstructor = testreflectClass.getDeclaredConstructor(String.class, int.class);

        declaredConstructor.setAccessible(true);

        Testreflect instance = declaredConstructor.newInstance("雪乃", 17);

        System.out.println(instance);


    }

}
