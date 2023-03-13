package com.atguigu.senior;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.junit.Test;

import java.util.Arrays;

public class TestString1001 {


    static Logger logger = Logger.getLogger(TestString1001.class);

    public static void main(String[] args) {
        BasicConfigurator.configure();
        logger.info(">>>果咩纳塞~~");
        logger.debug(">>>我的青春恋爱物语果然有问题...");
    }


    @Test
    public void testString1001(){

        String s1 = "AnimeYukino";

        String s2 = "AnimeYukinoAs";
        int i = 100;

//        byte[] bytes = s1.getBytes();
//
//        System.out.println(Arrays.toString(bytes));

        System.out.println("length:"+s1.length());//11
        String s = String.valueOf(i);
        System.out.println("valueOf:"+s);//100
        System.out.println("equals:"+s1.equals(s2));//false
        System.out.println("compareTo:"+s1.compareTo(s2));//-2
        System.out.println("startsWith:"+s1.startsWith("Anime"));//true
        System.out.println("endsWith:"+s1.endsWith("Yukino"));//true
        System.out.println("indexOf:"+s1.indexOf("Y"));//5
        System.out.println("lastIndexOf:"+s1.lastIndexOf("i"));//8
        System.out.println("toCharArray:"+ Arrays.toString(s1.toCharArray()));//数组
        System.out.println("charAt:"+s1.charAt(3));//m


    }


}
