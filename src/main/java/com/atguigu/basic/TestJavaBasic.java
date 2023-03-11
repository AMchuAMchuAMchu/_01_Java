package com.atguigu.basic;

import com.atguigu.struct.Person1001;
import org.junit.Test;

public class TestJavaBasic {

//  看到day09了
    public static void main(String[] args) {

        Son1001 son1001 = new Son1001();

        son1001.showInfo();

    }



    @Test
    public void testInnerClass(){

        Person1002.Head head = new Person1002.Head();

        Person1002 person1002 = new Person1002();

        Person1002.Foot foot1 = person1002.new Foot();

    }


//  看到day15
    @Test
    public void testFinal1001(){

        Dog1002 dog1002 = new Dog1002();

        dog1002.call();

    }

    @Test
    public void testType1002(){

       Integer i = 1314;

       String s  = "1314";

       int num01 = 1314;

//       i = num01;

//       num01 = i;

//        String s1 = String.valueOf(i);

//        Integer integer = Integer.valueOf(s);







    }


    @Test
    public void testExtends1001(){

        Animal1001 animal1001 = new Dog1001();

        animal1001.eat();

        Dog1001 dog1001 = new Dog1001();

        System.out.println(dog1001.getName());

        System.out.println("======================");

        Animal1002 dog1002 = new Dog1002();

        Dog1002 dog10021 = (Dog1002) new Animal1002();

        dog10021.excrete();

//        System.out.println(dog1002.getName());
//
//        dog1002.excrete();

    }

    @Test
    public  void testFatherSon1001(){

        Son1001 son1001 = new Son1001();

//        System.out.println(son1001.getName());

//        System.out.println(Arrays.toString(son1001.getClass().getDeclaredFields()));


    }

}
