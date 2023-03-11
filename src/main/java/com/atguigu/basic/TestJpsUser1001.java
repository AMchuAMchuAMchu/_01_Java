package com.atguigu.basic;

import java.util.concurrent.TimeUnit;

public class TestJpsUser1001 {

    public static void main(String[] args) {

        while (true){
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Hello!EGOIST chelly...");
        }


    }

}
