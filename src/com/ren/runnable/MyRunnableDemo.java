package com.ren.runnable;

public class MyRunnableDemo{
    public static void main(String[] args) {
        Myrunnable my = new Myrunnable();

        Thread t1 = new Thread(my);
        Thread t2 = new Thread(my);

        t1.start();
        t2.start();
    }

}
