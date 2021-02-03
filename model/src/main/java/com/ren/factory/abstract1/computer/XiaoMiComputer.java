package com.ren.factory.abstract1.computer;

import com.ren.factory.abstract1.IComputerProduct;

/**
 * @author : renwenhao
 * @date : 10:38 2020/12/21
 */
public class XiaoMiComputer implements IComputerProduct {
    @Override
    public void start() {
        System.out.println("小米电脑开机");
    }

    @Override
    public void shutdown() {
        System.out.println("小米电脑关机");
    }

    @Override
    public void callup() {
        System.out.println("小米电脑呼叫");
    }

    @Override
    public void sendSMS() {
        System.out.println("小米电脑发消息");
    }
}
