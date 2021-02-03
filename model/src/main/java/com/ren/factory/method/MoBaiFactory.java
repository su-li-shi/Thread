package com.ren.factory.method;

/**
 * @author : renwenhao
 * @date : 9:46 2020/12/21
 */
public class MoBaiFactory implements CarFactory {
    @Override
    public Car getCar() {
        return new Mobai();
    }
}
