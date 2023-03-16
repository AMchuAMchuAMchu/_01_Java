package com.atguigu.testgeneric;


import java.util.ArrayList;
import java.util.List;

public class DefineGenericMethod1001{


    public static void addString(List<? super Object> list){

        list.add(new Object());
        list.add(new String("C.C"));



    }



    public <GG> List<GG> transferToList(GG [] arr){
        ArrayList<GG> ggs = new ArrayList<>();
        for (GG gg : arr) {
            ggs.add(gg);
        }
        return ggs;
    }

    public static <G> void printAnime(G g){
        System.out.println("吃懵你!!顶你个肺!!>>"+g);
    }

    public <E> void test1001(E arr){
        System.out.println(arr.getClass());
        System.out.println(arr);
    }


}
