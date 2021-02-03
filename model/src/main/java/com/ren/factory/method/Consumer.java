package com.ren.factory.method;

import com.ren.factory.CarFactory;

/**
 * @author : renwenhao
 * @date : 11:45 2020/12/19
 */
public class Consumer {
    public static void main(String[] args) {
        Car car1 = new TeSiLaFactory().getCar();
        Car car2 = new WuLinFactory().getCar();

        car1.name();
        car2.name();

        Car car3 = new MoBaiFactory().getCar();
        car3.name();
    }
}
