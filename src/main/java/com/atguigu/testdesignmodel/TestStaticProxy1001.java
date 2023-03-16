package com.atguigu.testdesignmodel;



// 公用接口
interface AnimeFactory{
    public void createAnime();
}

//被代理类
class GC implements AnimeFactory{

    @Override
    public void createAnime() {
        System.out.println("罪恶王冠....");
        System.out.println("楪祈....");
        System.out.println("校条祭....");
    }
}

//代理类
class AnimeProxy implements AnimeFactory{

    private AnimeFactory animeFactory;

    public AnimeProxy(AnimeFactory animeFactory) {
        this.animeFactory = animeFactory;
    }

    @Override
    public void createAnime() {
        System.out.println("动画企划...");
        animeFactory.createAnime();
        System.out.println("动画摄影...上映");
    }
}



public class TestStaticProxy1001 {
    public static void main(String[] args) {

        GC gc = new GC();

        AnimeProxy animeProxy = new AnimeProxy(gc);

        animeProxy.createAnime();

    }
}
