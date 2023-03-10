package com.atguigu.basic;

import javax.sound.midi.Soundbank;

public class Circle1001 {

    private int radius;

    public void setRadius(int radius){
        this.radius = radius;
    }

    public int getRadius(){
        return radius;
    }

    public void calcArea(int radius){
        System.out.println("面积:"+Math.PI*radius*radius);
    }


}
