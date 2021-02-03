package com.ren.factory;

/**
 * @author : renwenhao
 * @date : 11:45 2020/12/19
 */
public class Consumer {
    public static void main(String[] args) {
        //接口，所有实现类！！相当于工厂
        // WuLin car = new WuLin();
        // TeSiLa car1 = new TeSiLa();

        //使用工厂创建
        Car car = CarFactory.getCar("五菱");
        Car car1 = CarFactory.getCar("特斯拉");

        car.name();
        car1.name();

    }
}
