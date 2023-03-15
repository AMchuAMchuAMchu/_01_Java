package com.atguigu.testcollection;

import java.util.Objects;

/**
 * @author wuyq
 * @create 2023-03-14 18:28:12
 */
public class User1003 {

    public User1003() {
    }

    public User1003(String name, int age) {
        this.name = name;
        this.age = age;
    }

    private String name;
    private int age;

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

    @Override
    public String toString() {
        return "User1003{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User1003 user1003 = (User1003) o;
        return age == user1003.age && Objects.equals(name, user1003.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}
