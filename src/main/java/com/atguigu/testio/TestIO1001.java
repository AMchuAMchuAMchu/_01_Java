package com.atguigu.testio;

import org.apache.commons.io.IOUtils;
import org.junit.Test;

import java.io.*;
import java.net.URL;

public class TestIO1001 {




    @Test
    public void testIOUtils(){

        try {
            IOUtils.copy(new FileInputStream("D:\\seldom\\rd\\Java_review\\_01_Java\\src\\main\\java\\com\\atguigu\\assets\\egoist.mp4"),new FileOutputStream("D:\\seldom\\rd\\Java_review\\_01_Java\\src\\main\\java\\com\\atguigu\\assets\\egoist_copy.mp4"));
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
        }

    }


    @Test
    public void testCopyFile1001(){

        BufferedInputStream bis = null;
        BufferedOutputStream bos = null;
        try {
            bis = new BufferedInputStream(new FileInputStream("D:\\seldom\\rd\\Java_review\\_01_Java\\src\\main\\java\\com\\atguigu\\assets\\_17_约定的梦幻岛op.mp4"));

            bos = new BufferedOutputStream(new FileOutputStream("D:\\seldom\\rd\\Java_review\\_01_Java\\src\\main\\java\\com\\atguigu\\assets\\_17_约定的梦幻岛op_copy.mp4"));

            byte [] bytes = new byte[1024];

            int len;

            while ((len=bis.read(bytes))!=-1){
                bos.write(bytes,0,len);
            }


            bos.flush();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (bis!=null)
                bis.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if (bos!=null)
                bos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }





    }

    @Test
    public void testWrite1001() throws IOException {

        FileOutputStream fos = new FileOutputStream("D:\\seldom\\rd\\Java_review\\_01_Java\\src\\main\\java\\com\\atguigu\\assets\\anime_w.txt",true);

        String s = "雪乃,楪祈,校条祭,常守朱";

        byte[] bytes = s.getBytes();

        fos.write(bytes);

        fos.close();

    }


    @Test
    public void testFileReader1001() throws IOException {


        FileInputStream fis = new FileInputStream("D:\\seldom\\rd\\Java_review\\_01_Java\\src\\main\\java\\com\\atguigu\\assets\\anime.txt");

        byte [] bytes = new byte[1024];

        int len;

        while ((len=fis.read(bytes))!=-1){
            System.out.println(new String(bytes,0,len));
        }

        fis.close();


    }

}
