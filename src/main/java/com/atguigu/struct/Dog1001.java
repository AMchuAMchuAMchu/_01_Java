package com.atguigu.struct;

import java.util.Objects;

/**
 * Description ==> TODO
 * BelongsProject ==> _01_Java
 * BelongsPackage ==> com.atguigu.struct
 * Version ==> 1.0
 * CreateTime ==> 2023-03-04 14:54:22
 * Author ==> _02雪乃赤瞳楪祈校条祭_艾米丽可锦木千束木更七草荠_制作委员会_start
 */
public class Dog1001 {

    private String name;

    private Integer age;

    public Dog1001(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dog1001 dog1001 = (Dog1001) o;
        return Objects.equals(name, dog1001.name) && Objects.equals(age, dog1001.age);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}
