package com.ren.threadpool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolDemo {
    public static void main(String[] args) {
        ExecutorService ex = Executors.newFixedThreadPool(2);
        ex.submit(new RunnableImpl());
        ex.submit(new RunnableImpl());
        ex.submit(new RunnableImpl());
    }
}
