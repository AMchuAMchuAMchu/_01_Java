package com.atguigu.senior;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.junit.Test;

import java.util.Arrays;

public class TestString1001 {


    static Logger logger = Logger.getLogger(TestString1001.class);

    public static void main(String[] args) {
//        BasicConfigurator.configure();
//        logger.info(">>>果咩纳塞~~");
//        logger.debug(">>>我的青春恋爱物语果然有问题...");

        String s1 = "hello";

        String s2 = "world";

        String s3 = "hello" + "world";

        String s4 = s1 + "world";

        String s5 = s1 + s2;

        String s6 = (s1 + s2).intern();

        System.out.println(">>>>>");
        System.out.println("s3 == s4:"+(s3 == s4));//false
        System.out.println("s3 == s5:"+(s3 == s5));//false
        System.out.println("s4 == s5:"+(s4 == s5));//false
        System.out.println("s3 == s6:"+(s3 == s6));//true

    }

    @Test
    public void testS102P() {

//        String s1 = "雪乃";
//
//        String s2 = "雪乃";
//
//        System.out.println(s1==s2);

        String s1 = "hello";

        String s2 = "world";

        String s3 = "hello" + "world";

        String s4 = s1 + "world";

        String s5 = s1 + s2;

        String s6 = (s1 + s2).intern();

        System.out.println("s3==s4:" + s3 == s4);
        System.out.println("s3==s5:" + s3 == s5);
        System.out.println("s4==s5:" + s4 == s5);
        System.out.println("s3==s6:" + s3 == s6);


    }

    @Test
    public void testString1001() {

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
