package com.ren.factory.abstract1.route;

import com.ren.factory.abstract1.IRouterProduct;

/**
 * @author : renwenhao
 * @date : 10:04 2020/12/21
 */
public class HuaWeiRoute implements IRouterProduct {
    @Override
    public void start() {
        System.out.println("打开华为路由器");
    }

    @Override
    public void shutdown() {
        System.out.println("关闭华为路由器");
    }

    @Override
    public void openWifi() {
        System.out.println("打开华为路由器无线");
    }

    @Override
    public void setParam() {
        System.out.println("配置华为路由器参数");
    }
}
