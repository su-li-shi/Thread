package com.ren.factory.abstract1.route;

import com.ren.factory.abstract1.IRouterProduct;

/**
 * @author : renwenhao
 * @date : 10:01 2020/12/21
 */
public class XiaoMiRoute implements IRouterProduct {
    @Override
    public void start() {
        System.out.println("打开小米路由器");
    }

    @Override
    public void shutdown() {
        System.out.println("关闭小米路由器");
    }

    @Override
    public void openWifi() {
        System.out.println("打开小米路由器无线");
    }

    @Override
    public void setParam() {
        System.out.println("配置小米路由器参数");
    }
}
