package com.ren.factory.abstract1.computer;

import com.ren.factory.abstract1.IComputerProduct;
import com.ren.factory.abstract1.factory.HuaWeiFactory;

/**
 * @author : renwenhao
 * @date : 10:37 2020/12/21
 */
public class HuaWeiComputer implements IComputerProduct {
    @Override
    public void start() {
        System.out.println("华为电脑开机");
    }

    @Override
    public void shutdown() {
        System.out.println("华为电脑关机");
    }

    @Override
    public void callup() {
        System.out.println("华为电脑呼叫");
    }

    @Override
    public void sendSMS() {
        System.out.println("华为电脑发消息");
    }
}
