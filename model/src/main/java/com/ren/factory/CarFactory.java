package com.ren.factory;

/**
 * @author : renwenhao
 * @date : 11:51 2020/12/19
 */

//静态工厂模式
//简单工厂模式
public class CarFactory {
    public static Car getCar(String car){
        if(car.equals("五菱")){
            return new WuLin();
        }else if(car.equals("特斯拉")){
            return new TeSiLa();
        }else {
            return null;
        }
    }
}
