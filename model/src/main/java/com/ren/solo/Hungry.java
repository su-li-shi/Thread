package com.ren.solo;

/**
 * 饿汉式单例
 * @author : renwenhao
 * @date : 17:25 2020/12/18
 */
//饿汉式单例
public class Hungry {

    private Hungry(){

    }
    //    直接上来就new，static 万一用不到，浪费内存
    private final static Hungry hungry = new Hungry();

    public static Hungry getInstance(){
        return hungry;
    }
}
