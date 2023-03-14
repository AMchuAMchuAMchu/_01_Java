package com.atguigu.senior;

public class TestCompareTo1001 implements Comparable{


    private String name;
    private int age;

    public TestCompareTo1001(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public TestCompareTo1001() {
    }

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
    public int compareTo(Object o) {
        if (o instanceof TestCompareTo1001){
            TestCompareTo1001 t = (TestCompareTo1001) o;
            if (this.age > t.age){
                return 1;
            }else if (this.age < t.age){
                return -1;
            }
            return 0;
        }
        throw new RuntimeException("果咩纳塞~~输入的类型不一致!!!!");
    }
}
