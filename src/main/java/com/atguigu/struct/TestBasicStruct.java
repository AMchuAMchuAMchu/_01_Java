package com.atguigu.struct;

import com.atguigu.basic.Circle1001;
import javafx.scene.shape.Circle;
import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.Collectors;

/**
 * Description ==> TODO
 * BelongsProject ==> _01_Java
 * BelongsPackage ==> com.atguigu.struct
 * Version ==> 1.0
 * CreateTime ==> 2023-03-04 14:09:16
 * Author ==> _02雪乃赤瞳楪祈校条祭_艾米丽可锦木千束木更七草荠_制作委员会_start
 */
public class TestBasicStruct {

    public TestBasicStruct() {
    }

    private static int i03;

    private final int I04 = 44;

    private int num1001;


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String next = scanner.next();
        int i = scanner.nextInt();
        System.out.println("next:" + next);
        System.out.println("i:" + i);

    }




    @Test
    public void testCalcArea(){

        Circle1001 circle1001 = new Circle1001();

        circle1001.setRadius(2);

        circle1001.calcArea(circle1001.getRadius());

    }



    @Test
    public void testVariableAndClass(){

        int num1002;

        System.out.println("成员变量num1001:"+num1001);

//        System.out.println("成员变量num1002:"+num1002);

    }




    @Test
    public void testPrimeNumber() {
        long start = System.currentTimeMillis();
        int count = 0;
        for (int i = 2; i <= 10000; i++) {
            boolean flag = true;
//            注意!!求平方根的时候记得加上<=而不是< ,因为的话会出现类似4这些特别的数...
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                count++;
//                System.out.println("第" + count + "个质数:" + i);
            }
        }
        long end = System.currentTimeMillis();

//        System.out.println("总共有" + count + "个质数;耗时:" + (end - start));//1.0版本,无优化: 139 142 140
//        System.out.println("总共有" + count + "个质数;耗时:" + (end - start));//2.0版本,优化break: 18 17 18
        System.out.println("总共有" + count + "个质数;耗时:" + (end - start));//3.0版本,优化平方根: 2 1 1

    }


    @Test
    public void testBitCalc() {
        int i = ~0;
        System.out.println(i);
    }


    @Test
    public void testDaffodil() {

        for (int i = 100; i < 1000; i++) {
            //157 467
            int num01 = i / 100;
            int num02 = (i / 10) % 10;
            int num03 = i % 10;
            if (num01 * num01 * num01 + num02 * num02 * num02 + num03 * num03 * num03 == i) {
                System.out.println("水仙花数为:" + i);
            }
        }

    }


    @Test
    public void testArrErr() {

//        int [] arr = {10,20};
        int[] arr = null;

//        System.out.println(arr[2]);

        System.out.println(arr[0]);

    }


    @Test
    public void testFindFromArr() {

        int[] arr = {12, 34, -7, 9, 47, -33, 89, 21, 56, 83, 0};
        boolean flag = true;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == -33) {
                System.out.println("索引值:" + i);
                flag = false;
                break;
            }
        }
        if (flag) {
            throw new RuntimeException("淦!!找不到!!!");
        }


    }


    @Test
    public void testCopyArray() {

        int[] arr = {12, 34, -7, 9, 47, -33, 89, 21, 56, 83, 0};

        System.out.println("原数组:" + Arrays.toString(arr));
        //直接用数组的工具类即可实现数组的复制
//        int[] ints = Arrays.copyOf(arr, arr.length);
//      原生的数组复制
        int[] ints = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            ints[i] = arr[i];
        }

        System.out.println("复数组:" + Arrays.toString(ints));

    }


    @Test
    public void testReverse() {

        int[] arr = {12, 34, -7, 9, 47, -33, 89, 21, 56, 83, 0};

        System.out.println("反转之前:" + Arrays.toString(arr));

        int[] arrR = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
//          这里的话就是原来数组的第一个数放到新数组的最后一个位置,原来数组的第二个数放到新数组的倒数第二个位置..
//          最后一位是arr.length - 1,但是的话因为是动态变化的所以的话这个数需要-i...
            arrR[arr.length - i - 1] = arr[i];
        }

        System.out.println("反转之后:" + Arrays.toString(arrR));


    }

    //day07
    @Test
    public void testBubble() {

        int[] arr = {12, 34, -7, 9, 47, -33, 89, 21, 56, 83, 0};

        System.out.println("排序之前:" + Arrays.toString(arr));

//          这里的外面那个循环的长度的话好像即使是偏大的话也是不影响结果的说,但是的话不能偏小,取得最好是arr的长度-1即可
//        for (int i = 0; i < arr.length + 100; i++) {
//        for (int i = 0; i < arr.length+10000; i++) {
//            为什么是arr.length - 1次呢?因为的话举个例子吧:加入有三个数,其实用冒泡排序比较的话只需要比较两次足矣...所以的话规律就是长度的次数减一

//      外面的那个大循环的话是因为冒泡排序的话遍历完了第一次之后还需要遍历,直到遍历到第一位的时候才算是确保可以完整的排序,
//      这个外部循环则是遍历的大循环的周期数目的
        for (int i = 0; i < arr.length - 1; i++) {
//          里面的小循环则是每一次遍历数组里面的每一个元素的,遍历完了之后再到外面的大循环重新开始遍历..
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] < arr[j + 1]) {
                    arr[j] = arr[j] ^ arr[j + 1];
                    arr[j + 1] = arr[j] ^ arr[j + 1];
                    arr[j] = arr[j] ^ arr[j + 1];
                }
            }
        }

        System.out.println("排序之后:" + Arrays.toString(arr));

    }


    @Test
    public void testArr() {

        String[] strArr = new String[5];
        int[] intArr = new int[5];
        boolean[] booArr = new boolean[5];

        System.out.println(Arrays.toString(strArr));
        System.out.println(Arrays.toString(intArr));
        System.out.println(Arrays.toString(booArr));

    }

    @Test
    public void testTraverse() {

        int[][] arr = new int[][]{{1, 2, 3}, {4, 5}, {6, 7, 8}};

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.println(arr[i][j]);
            }
        }


    }


    @Test
    public void testArrayInit() {

        String[] animeArray01 = {};
        String[] animeArray04 = new String[]{};
        String[] animeArray02 = new String[10];
        String[] animeArray03 = new String[]{"全职猎人", "来自深渊", "约定的梦幻岛"};

        String[][] hehe = new String[10][10];
        String[][] hehe01 = new String[][]{new String[1]};
        String[][] heha = {};

        System.out.println(Arrays.toString(animeArray01));
        System.out.println(Arrays.toString(animeArray02));
        System.out.println(Arrays.toString(animeArray03));

    }


    @Test
    public void testDotted() {

        for (int i = 6; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }


    }

    @Test
    public void testWanShu() {
        for (int i = 2; i <= 1000; i++) {
            int sum = 0;
            for (int j = 1; j < i; j++) {
                if (i % j == 0) {
                    sum += j;
                }
//                这里的话是记得到最后再开始算总数的说,不然的话会出现一些约束之和的却会超过i的情况...
                if (j == (i - 1)) {
                    if (sum == i) {
                        System.out.println("完数:" + i);
                        break;
                    }
                }
            }
        }
    }


    @Test
    public void testOdd() {
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 2 != 0) {
                System.out.println("奇数:" + i);
                sum += i;
            }
        }
        System.out.println("sum:" + sum);
    }


    @Test
    public void testSwap() {
        int num01 = 10;
        int num02 = 20;
//        int num03;
//        1.0
//        num03 = num01;
//        num01 = num02;
//        num02 = num03;
//        2.0
//        num01 = num01 ^ num02;
//        num02 = num01 ^ num02;
//        num01 = num01 ^ num02;
//        3.0
//        num01 = num01 +num02;
//        num02 = num01 - num02;
//        num01 = num01-num02;


        System.out.println(num01);
        System.out.println(num02);

        Byte num = 10;
        switch (num) {
            case 1:
                System.out.println("ooo" + num);
                break;
        }
    }


    @Test
    public void testMaxInThree() {

        int num01 = 170;
        int num02 = 900;
        int num03 = 8700;

//        int max = num01 > num02?(num01 > num03?num01:num03):(num02 > num03?num02:num03);

        if (num01 > num02) {
            if (num01 > num03) {
                System.out.println(num01);
            } else {
                System.out.println(num03);
            }
        } else {
            if (num02 > num03) {
                System.out.println(num02);
            } else {
                System.out.println(num03);
            }
        }

//        System.out.println(max);


    }


    @Test
    public void testAndAnd() {

//        boolean b01 = true;
//
//        int i = 10;
//
//        if ((++i == 10) && (b01 = false)) {
//        }
//        System.out.println(b01);
        boolean x = true;
        boolean y = false;
        short z = 40;
        if ((z++ == 40) && (y = true)) {
            z++;
        }
        if ((x = false) || (++z == 43)) {
            z++;
        }
        System.out.println("z = " + z);

    }


    @Test
    public void testBooleanAndFloat() {

//        float f01 = 100.0f;
//        System.out.println(Boolean.TRUE);
//        System.out.println(Float.MAX_VALUE);

        int i01 = 200;
        byte b01 = (byte) i01;

        System.out.println(b01);

    }


    @Test
    public void testTernaryOperation() {


        int 雪乃 = 11;

        int u66u = 11;

        int i = new Random().nextInt(10);
        System.out.println(i);
        System.out.println(i % 2 == 0 ? "雪乃" : "楪祈");

    }


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
    public void testEquals() {
        User1001 user1001 = new User1001(1001, "1001");
        User1001 user1002 = new User1001(1001, "1001");
        System.out.println(user1001.equals(user1002));
        System.out.println(user1001 == user1002);
        System.out.println(user1001 == user1001);
    }

    @Test
    public void testEquals02() {
        Person1001 person1001 = new Person1001("金毛", 2);
        Person1001 person1002 = new Person1001("金毛", 2);
        Dog1001 dog1001 = new Dog1001("金毛", 2);

        System.out.println(person1001.equals(dog1001));
        System.out.println(person1001.equals(person1002));
    }

}
