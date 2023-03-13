package com.atguigu.senior;

import org.junit.Test;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class TestDateTime1001 {

    @Test
    public void testDateTime(){

        LocalDateTime now = LocalDateTime.now();

        String format = DateTimeFormatter.ofPattern("yyyy年MM月dd日 HH:mm:ss").format(now);

        System.out.println(format);

    }





}
