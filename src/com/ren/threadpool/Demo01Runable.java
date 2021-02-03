package com.ren.threadpool;

public class Demo01Runable {
    public static void main(String[] args) {
        //创建Runable的实现类
        RunnableImpl run = new RunnableImpl();
        //创建Thread类对象，构造方法中传递 Runable的实现类
        Thread th = new Thread(run);
        //调用start方法开启新线程，执行run方法
        th.start();

        //简化代码，使用匿名内部类，实现多线程程序
        Runnable run1 = new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName() + "创建了一个新的线程");
            }
        };
        new Thread(run1).start();

        //继续简化
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName() + "创建了一个新的线程");
            }
        }).start();

        //使用Lambda表达式，实现多线程
        new Thread(()->{
            System.out.println(Thread.currentThread().getName() + "创建了一个新的线程");
        }).start();

        //再优化
        new Thread(()-> System.out.println(Thread.currentThread().getName() + "创建了一个新的线程")
        ).start();
    }
}
