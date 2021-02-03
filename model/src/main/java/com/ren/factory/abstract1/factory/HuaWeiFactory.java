package com.ren.factory.abstract1.factory;

import com.ren.factory.abstract1.IComputerProduct;
import com.ren.factory.abstract1.computer.HuaWeiComputer;
import com.ren.factory.abstract1.phone.HuaWeiPhone;
import com.ren.factory.abstract1.route.HuaWeiRoute;
import com.ren.factory.abstract1.IPhoneProduct;
import com.ren.factory.abstract1.IRouterProduct;
import com.ren.factory.abstract1.abstract2.IProductFactory;

/**
 * @author : renwenhao
 * @date : 10:11 2020/12/21
 */
public class HuaWeiFactory implements IProductFactory {
    @Override
    public IPhoneProduct I_PHONE_PRODUCT() {
        return new HuaWeiPhone();
    }

    @Override
    public IRouterProduct I_ROUTER_PRODUCT() {
        return new HuaWeiRoute() ;
    }

    @Override
    public IComputerProduct I_COMPUTER_PRODUCT() {
        return new HuaWeiComputer();
    }
}
