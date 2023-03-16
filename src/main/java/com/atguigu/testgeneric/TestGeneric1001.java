package com.atguigu.testgeneric;

import org.junit.Test;

import java.util.List;

public class TestGeneric1001 {




    @Test
    public void testGenericMethod1001(){

//        int i = null;

        DefineGenericMethod1001 method1001 = new DefineGenericMethod1001();
//
//        method1001.printAnime(new String("大傻哥..."));
//
//        method1001.test1001(new String("雪乃"));

        List<String> stringList = method1001.transferToList(new String[]{"雪乃", "楪祈", "赤瞳"});

        stringList.forEach(System.out::println);

    }

    @Test
    public void testGeneric1001(){

        DefineGenericClass1001<Thread> threadDefineGenericClass1001 = new DefineGenericClass1001<>("你好野",666,new Thread("T1"));



        System.out.println(threadDefineGenericClass1001);
    }

}
