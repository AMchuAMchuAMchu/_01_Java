package com.atguigu.struct;

import org.junit.Test;

/**
 * Description ==> TODO
 * BelongsProject ==> _01_Java
 * BelongsPackage ==> com.atguigu.struct
 * Version ==> 1.0
 * CreateTime ==> 2023-03-04 14:09:16
 * Author ==> _02雪乃赤瞳楪祈校条祭_艾米丽可锦木千束木更七草荠_制作委员会_start
 */
public class TestBasicStruct {

    private static int i03;

    private final int I04 = 44;


    @Test
    public void testBasicCalc() {

//        1.0 算术运算
//        int num01 = 10 % 7;
//        int num02 = -10 % -7;
//        int num03 = -10 % 7;
//        int num04 = 10 % -7;
//        int num05 = 10 % -179;
//        int num06 = -10 % 79;
//
//        System.out.println("num01:"+num01);//3
//        System.out.println("num02:"+num02);//-3
//        System.out.println("num03:"+num03);//-3
//        System.out.println("num04:"+num04);//3
//        System.out.println("num05:"+num05);//10
//        System.out.println("num06:"+num06);//-10

//        2.0 比较运算符,没有什么需要注意的地方..就不讲了..

//        3.0 逻辑运算符

//        4.0 位运算
        int num21 = 5 & 7;//5
        int num22 = 5 | 7;//7
        int num23 = ~7;//-8
        int num24 = 5 ^ 7;//2
        int num25 = 7 >> 2;//1
        int num26 = 7 << 2;//28
        int num27 = 7 >>> 2;//1

        int num28 = -7 >>> 2;//1073741822
        int num29 = ~-7;//6
        int num30 = -7 << 2;//-28

        System.out.println("num21:" + num21);
        System.out.println("num22:" + num22);
        System.out.println("num23:" + num23);
        System.out.println("num24:" + num24);
        System.out.println("num25:" + num25);
        System.out.println("num26:" + num26);
        System.out.println("num27:" + num27);
        System.out.println();
        System.out.println("num28:" + num28);
        System.out.println("num29:" + num29);
        System.out.println("num30:" + num30);


    }


    @Test
    public void testBDTP1002() {

//        System.out.println("MIN:"+Integer.MIN_VALUE);
//        System.out.println("MAX:"+Integer.MAX_VALUE);

//        System.out.println("MAX:"+ (int) Character.MAX_VALUE);
//        System.out.println("MIN:"+ (int) Character.MIN_VALUE);
//        System.out.println(Integer.MAX_VALUE);

//        System.out.println(Integer.max(23, 34));

//        System.out.println(Integer.reverse(10));

//        System.out.println(Integer.sum(100, 99));
//        System.out.println(Integer.toHexString(100));
//        System.out.println(Integer.BYTES);

//        Integer.parseInt()

    }

    @Test
    public void testBasicDataTypePackage() {

        int i = '吴';

        System.out.println(i);

//        byte b01 = 127;
//
//        Integer i01 = 12;
//
//        Integer i02 = 10;
//        String s01 = "13";
//
//        String s = String.valueOf(i01);
//
//        Integer integer = Integer.valueOf(s01);
//
//        int compare = Integer.compare(i01, i02);
//
//        System.out.println("compare:"+compare);
//
//        Integer integer1 = Integer.getInteger(s01);

//        基本运算5种

    }


    @Test
    public void testEquals(){
        User1001 user1001 = new User1001(1001, "1001");
        User1001 user1002 = new User1001(1001, "1001");
        System.out.println(user1001.equals(user1002));
        System.out.println(user1001 == user1002);
        System.out.println(user1001 == user1001);
    }

    @Test
    public void testEquals02(){
        Person1001 person1001 = new Person1001("金毛", 2);
        Person1001 person1002 = new Person1001("金毛", 2);
        Dog1001 dog1001 = new Dog1001("金毛", 2);

        System.out.println(person1001.equals(dog1001));
        System.out.println(person1001.equals(person1002));
    }

}
