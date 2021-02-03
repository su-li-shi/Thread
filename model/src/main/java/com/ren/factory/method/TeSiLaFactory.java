package com.ren.factory.method;

/**
 * @author : renwenhao
 * @date : 9:40 2020/12/21
 */
public class TeSiLaFactory implements CarFactory {
    @Override
    public Car getCar() {
        return new TeSiLa();
    }
}
