package com.atguigu.senior;

import java.util.concurrent.TimeUnit;

public class SaleTickets1001 {

    static int ticket = 100;


    public static void main(String[] args) {

        SaleTickets1001 saleTickets1001 = new SaleTickets1001();

//        new Thread(saleTickets1001::salesTickets,"T1").start();
//        new Thread(saleTickets1001::salesTickets,"T2").start();
//        new Thread(saleTickets1001::salesTickets,"T3").start();
//

        Thread thread = new Thread(saleTickets1001::printA, "TA");

        thread.start();

        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName()+"::main");
            if (i == 5){
//                try {
//                    thread.join();
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
            }
        }


    }

    public void printA(){
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName()+"::A");
        }
    }

    public void salesTickets(){

        while (true){
            if (ticket > 0){
                try {
                    TimeUnit.MILLISECONDS.sleep(20);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName()+"::售出"+ticket--);
            }else {
                return;
            }
        }

    }


}
