package com.atguigu.testannotation;

import org.junit.Test;

import java.util.concurrent.TimeUnit;

//@MyAnnotation1001
public class TestAnnotation1001 {

    public static void main(String[] args) throws InterruptedException {

        TimeUnit.SECONDS.sleep(2);

    }

    @MyAnnotation1001
    @Test
    public void test01(){
        Annotation1001 annotation1001 = new Annotation1001();
        annotation1001.testPrint();
        annotation1001.eat();
//        annotation1001.toString();
    }

}
