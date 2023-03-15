package com.atguigu.testgeneric;

import org.junit.Test;

public class TestGeneric1001 {

    @Test
    public void testGeneric1001(){

        DefineGenericClass1001<Thread> threadDefineGenericClass1001 = new DefineGenericClass1001<>("你好野",666,new Thread("T1"));

        System.out.println(threadDefineGenericClass1001);
    }

}
