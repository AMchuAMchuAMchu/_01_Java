package com.atguigu.testcollection;

import com.atguigu.basic.User;
import org.junit.Test;

import java.util.*;

/**
 * @author wuyq
 * @create 2023-03-14 18:25:56
 */
public class TestCollection1001 {




    @Test
    public void testSet(){

        User1003 user01 = new User1003("贝尔克朗尼", 14);
        User1003 user02 = new User1003("贝尔克朗尼", 14);
        User1003 user03 = new User1003("贝尔克朗尼", 14);

        HashSet<User1003> userSet = new HashSet<>();

        userSet.add(user01);
        userSet.add(user02);
        userSet.add(user03);

        userSet.forEach(System.out::println);

    }

    @Test
    public void testArrayList(){

        String [] animes = new String[]{"雪乃","楪祈","校条祭","赤瞳"};

        List<String> stringList = Arrays.asList(animes);

        stringList.forEach(System.out::println);

//        throw new RuntimeException("hehe 就这??");

    }


    @Test
    public void testIterator1001(){

        ArrayList<String> animeList = new ArrayList<>();

        animeList.add("雪乃");
        animeList.add("楪祈");
        animeList.add("昆虫比企谷");
        animeList.add("校条祭");
        animeList.add("赤瞳");

        Iterator<String> iterator = animeList.iterator();

        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        System.out.println("==============");
        Iterator<String> iterator02 = animeList.iterator();

        while (iterator02.hasNext()){
            String next = iterator02.next();
            if ("昆虫比企谷".equals(next)){
                iterator02.remove();
            }
        }

        System.out.println(animeList);
    }

    @Test
    public void testCollectionType1001(){

        ArrayList list = new ArrayList();


        list.add(new Integer(11));
        list.add(new String("雪乃"));
        list.add(new User1003());
        list.add(new Thread());

//        list.forEach(i->{
//            System.out.println(i.getClass());
//        });

        Iterator iterator = list.iterator();

        while (iterator.hasNext()){
            System.out.println(iterator.next().getClass());
        }

    }

}
