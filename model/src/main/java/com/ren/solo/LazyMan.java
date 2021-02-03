package com.ren.solo;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 *
 * @author : renwenhao
 * @date : 17:44 2020/12/18
 */
//懒汉式单例
public class LazyMan {

    private LazyMan(){
        System.out.println(Thread.currentThread().getName() + " OK");

    }
    private static volatile  LazyMan lazyMan = null;

    //双重检测锁模式的 懒汉式单例 DCL懒汉式
    public static LazyMan getInstance(){
        if(lazyMan == null){
            synchronized (LazyMan.class){
                if(lazyMan == null){
                    lazyMan = new LazyMan();
                }
            }
        }
        return lazyMan;
    }
    //    单线程没问题，多线程并发下有问题 如下
    public static void main(String[] args) throws Exception {
        LazyMan instance = LazyMan.getInstance();

        //用反射来破坏单例
        Constructor<LazyMan> declaredConstructor = LazyMan.class.getDeclaredConstructor(null);
        declaredConstructor.setAccessible(true);

        LazyMan instance1 = declaredConstructor.newInstance();

        System.out.println(instance);
        System.out.println(instance1);

    }
}
