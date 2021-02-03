package com.ren.factory.abstract1.abstract2;

import com.ren.factory.abstract1.IComputerProduct;
import com.ren.factory.abstract1.IPhoneProduct;
import com.ren.factory.abstract1.IRouterProduct;

/**
 * @author : renwenhao
 * @date : 10:06 2020/12/21
 */
//抽象产品工厂
public interface IProductFactory {

    //生长手机的工厂
    IPhoneProduct I_PHONE_PRODUCT();

    //生产路由器的工厂
    IRouterProduct I_ROUTER_PRODUCT();

    //生产电脑的工厂
    IComputerProduct I_COMPUTER_PRODUCT();

}
