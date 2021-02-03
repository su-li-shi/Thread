package com.ren.factory.abstract1.phone;

import com.ren.factory.abstract1.IPhoneProduct;

/**
 * @author : renwenhao
 * @date : 9:57 2020/12/21
 */
public class HuaWeiPhone implements IPhoneProduct {
    @Override
    public void start() {
        System.out.println("华为开机！！！！");
    }

    @Override
    public void shutdown() {
        System.out.println("华为关机！！！！");
    }

    @Override
    public void callup() {
        System.out.println("华为打电话~~~~");
    }

    @Override
    public void sendSMS() {
        System.out.println("华为发消息~~~~~");
    }
}
