package com.atguigu.testdesignmodel;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

// 接口
interface Plane{
    public void fly(String distance);
}

// 被代理类

class F22 implements Plane{

    @Override
    public void fly(String distance) {
        System.out.println("F22 飞了"+distance+"公里了...");
    }
}
// 根据被代理类对象生成代理类
class ProxyFactory{

    public static Object getProxyInstance(Object obj){

        InvocationInstance instance = new InvocationInstance(obj);

        return Proxy.newProxyInstance(obj.getClass().getClassLoader(),obj.getClass().getInterfaces(),instance);
    }
}

// 调用被代理类的方法
class InvocationInstance implements InvocationHandler{

    private Object object;

    public InvocationInstance(Object object) {
        this.object = object;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("我顶你个肺!有伦用咩!!!");
        Object invoke = method.invoke(object, args);
        System.out.println("盲gemie,死铲!!!>>>大傻哥!!");
        return invoke;
    }
}


public class TestDynamicProxy1001 {

    public static void main(String[] args) {


        F22 f22 = new F22();

        Plane proxyInstance = (Plane) ProxyFactory.getProxyInstance(f22);

        proxyInstance.fly("十万八千里....");

        System.out.println("===============================");
        GC gc = new GC();
        AnimeFactory proxyInstance1 = (AnimeFactory) ProxyFactory.getProxyInstance(gc);

        proxyInstance1.createAnime();

    }

}
