package com.ren.solo;

/**
 * @author : renwenhao
 * @date : 10:32 2020/12/19
 */
public class LazyHolder {

    private LazyHolder(){
        System.out.println(Thread.currentThread().getName() + " OK");
    }
    //使用内部类来实现懒加载
    private static class Holder{
        //创建单例对象
        private static final LazyHolder INSTANCE = new LazyHolder();

    }

    //获取对象
    public static final LazyHolder getInstance(){
        return Holder.INSTANCE;
    }

    //    单线程没问题，多线程并发下有问题 如下
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            new Thread(()->{
                LazyHolder.getInstance();
            }).start();
        }
    }
}
