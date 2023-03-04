package com.atguigu.struct;

import java.util.Objects;

/**
 * Description ==> TODO
 * BelongsProject ==> _01_Java
 * BelongsPackage ==> com.atguigu.struct
 * Version ==> 1.0
 * CreateTime ==> 2023-03-04 13:57:28
 * Author ==> _02雪乃赤瞳楪祈校条祭_艾米丽可锦木千束木更七草荠_制作委员会_start
 */
public class User1001 {

    private Integer i01;

    private String s01;

    public User1001() {

    }

    public User1001(Integer i01, String s01) {
        this.i01 = i01;
        this.s01 = s01;
    }

    public Integer getI01() {
        return i01;
    }

    public void setI01(Integer i01) {
        this.i01 = i01;
    }

    public String getS01() {
        return s01;
    }

    public void getS01(String s01) {
        this.s01 = s01;
    }

    public String toString() {
        return this.i01 + "+" + this.s01;
    }


    public boolean equals1001(Object o) {

        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User1001 user1001 = (User1001) o;
        return Objects.equals(i01, user1001.i01) && Objects.equals(s01, ((User1001) o).s01);
    }

    @Override
    public boolean equals(Object o) {
//      首先比较的是内存地址,内存地址都相等那肯定相等...
        if (this == o) return true;
//      如果是null的话那肯定不等的说,还有的话是如果父类也不一样的话那肯定也不等的说,这种绝对错误的方式也是直接返回即可
//      不需要话费额外的计算机开销多做判断
        if (o == null || getClass() != o.getClass()) return false;
//      强转为同类型的类然后比较内容是否一致即可
        User1001 user1001 = (User1001) o;
//      之前都还没想到可以这样用的说...真的6😅😅😅
        return Objects.equals(i01, user1001.i01) && Objects.equals(s01, user1001.s01);
    }

    @Override
    public int hashCode() {
        return Objects.hash(i01, s01);
    }
}
