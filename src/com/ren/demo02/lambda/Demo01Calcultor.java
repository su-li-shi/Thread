package com.ren.demo02.lambda;

public class Demo01Calcultor {
    public static void main(String[] args) {
        // invokeCalc(120, 130, new Calculator() {
        //     @Override
        //     public int cal(int a, int b) {
        //         return a+b;
        //     }
        // });

        // 匿名内部类  lambda表达式
        // invokeCalc(120,130,(int a, int b)->{
        //     return a+b;
        // });

        //再优化
        invokeCalc(120,130,(a, b)-> a+b
        );
    }

    public static void invokeCalc(int a,int b,Calculator c){
        int sum = c.cal(a,b);
        System.out.println(sum);

    }
}
