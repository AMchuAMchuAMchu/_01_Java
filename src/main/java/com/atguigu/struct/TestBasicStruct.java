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
    public  void testBDTP1002(){

//        System.out.println("MIN:"+Integer.MIN_VALUE);
//        System.out.println("MAX:"+Integer.MAX_VALUE);

//        System.out.println("MAX:"+ (int) Character.MAX_VALUE);
//        System.out.println("MIN:"+ (int) Character.MIN_VALUE);


        System.out.println(Integer.MAX_VALUE);


//        Integer.parseInt()

    }

    @Test
    public void testBasicDataTypePackage(){

        byte b01 = 127;

        Integer i01 = 12;

        Integer i02 = 10;
        String s01 = "13";

        String s = String.valueOf(i01);

        Integer integer = Integer.valueOf(s01);

        int compare = Integer.compare(i01, i02);

        System.out.println("compare:"+compare);

        Integer integer1 = Integer.getInteger(s01);




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
