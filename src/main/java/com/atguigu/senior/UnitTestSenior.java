package com.atguigu.senior;

import org.junit.Test;
import sun.security.util.Length;

import java.util.Arrays;
import java.util.Scanner;
import java.util.logging.Level;

public class UnitTestSenior {


//  实现trim方法
//    public static void main(String[] args) {
//
//        Scanner scanner = new Scanner(System.in);
//
//        String s = scanner.nextLine();
//
//        char[] chars = s.toCharArray();
//
//        int front_count = 0;
//
//        int end_count = 0;
//
//        for (int i = 0; i < chars.length; i++) {
//            if (chars[i] == 32) {
//                front_count++;
//            } else {
//                break;
//            }
//        }
//
//        for (int i = chars.length - 1; i >= 0; i--) {
//            if (chars[i] == 32) {
//                end_count++;
//            } else {
//                break;
//            }
//        }
//
//        char[] newStr = new char[chars.length - (front_count + end_count)];
//
//        newStr = Arrays.copyOfRange(chars,front_count,chars.length-(end_count));
//
//        System.out.println("chars::"+Arrays.toString(chars));
//        System.out.println("chars::"+chars.length);
//        System.out.println();
//        System.out.println("newStr::"+Arrays.toString(newStr));
//        System.out.println("newStr::"+newStr.length);
//
//        String s1 = Arrays.toString(chars);
//
//
//    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String line = scanner.nextLine();

        char[] chars = line.toCharArray();

        char [] newStr = new char[chars.length];

        for (int i = chars.length-1; i >= 0; i--) {
            newStr[chars.length-1-i] = chars[i];
        }

        System.out.println("原:"+ new String(chars));

        System.out.println("反:"+ new String(newStr));

    }


    @Test
    public void testTrimRealize() {
        int i = ' ';
        System.out.println(i);
        String s = "dwwww";

        s.trim();

    }


    @Test
    public void testStrChar() {

        Scanner scanner = new Scanner(System.in);

        String s = scanner.nextLine();

        char[] chars = s.toCharArray();

        for (int i = 0; i < chars.length; i++) {
            System.out.println("i::" + chars[i]);
        }

    }


    @Test
    public void testString() {
        String str1 = "尚硅谷";
        String str2 = "尚硅谷";
        String str3 = new String("尚硅谷");
        System.out.println(str1 == str2);//true
        System.out.println(str1 == str3);//false
        System.out.println(str1.equals(str3));//true
        str1 = "尚硅谷atguigu.com";
        String str4 = "atguigu.com";
        String str5 = "尚硅谷" + "atguigu.com";
        System.out.println(str1 == str5);//true

//        String str6 = (str2 + str4).intern();//true
        String str6 = (str2 + str4);//false

        System.out.println(str1 == str6);//false  ---->true
    }


}
