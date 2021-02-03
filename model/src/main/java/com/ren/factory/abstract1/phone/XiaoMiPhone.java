package com.ren.factory.abstract1.phone;

import com.ren.factory.abstract1.IPhoneProduct;

/**
 * @author : renwenhao
 * @date : 9:59 2020/12/21
 */
public class XiaoMiPhone implements IPhoneProduct {
    @Override
    public void start() {
        System.out.println("小米开机！！！！");
    }

    @Override
    public void shutdown() {
        System.out.println("小米关机！！！！");
    }

    @Override
    public void callup() {
        System.out.println("小米打电话~~~~");
    }

    @Override
    public void sendSMS() {
        System.out.println("小米发消息~~~~~");
    }
}
