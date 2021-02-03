package com.ren.factory.abstract1.client;

import com.ren.factory.abstract1.IComputerProduct;
import com.ren.factory.abstract1.factory.HuaWeiFactory;
import com.ren.factory.abstract1.IPhoneProduct;
import com.ren.factory.abstract1.IRouterProduct;
import com.ren.factory.abstract1.factory.XiaoMiFactory;

/**
 * @author : renwenhao
 * @date : 10:13 2020/12/21
 */
public class Client {

    public static void main(String[] args) {
        System.out.println("=========小米系列产品============");

        XiaoMiFactory xiaoMiFactory = new XiaoMiFactory();
        IPhoneProduct xiaomi = xiaoMiFactory.I_PHONE_PRODUCT();


        xiaomi.start();
        xiaomi.callup();
        xiaomi.sendSMS();
        xiaomi.shutdown();

        IRouterProduct xiaomiRoute = xiaoMiFactory.I_ROUTER_PRODUCT();

        xiaomiRoute.start();
        xiaomiRoute.openWifi();
        xiaomiRoute.setParam();
        xiaomiRoute.shutdown();

        IComputerProduct xiaomiComputer = xiaoMiFactory.I_COMPUTER_PRODUCT();

        xiaomiComputer.start();
        xiaomiComputer.callup();
        xiaomiComputer.sendSMS();
        xiaomiComputer.shutdown();

        System.out.println("==========华为系列产品==========");

        HuaWeiFactory huaWeiFactory = new HuaWeiFactory();
        IPhoneProduct huawei = huaWeiFactory.I_PHONE_PRODUCT();

        huawei.start();
        huawei.callup();
        huawei.sendSMS();
        huawei.shutdown();

        IRouterProduct huaweiRoute = huaWeiFactory.I_ROUTER_PRODUCT();

        huaweiRoute.start();
        huaweiRoute.openWifi();
        huaweiRoute.setParam();
        huaweiRoute.shutdown();

        IComputerProduct huaweiComputer = huaWeiFactory.I_COMPUTER_PRODUCT();

        huaweiComputer.start();
        huaweiComputer.callup();
        huaweiComputer.sendSMS();
        huaweiComputer.shutdown();



    }
}
