package com.ren.factory.abstract1.factory;

import com.ren.factory.abstract1.IComputerProduct;
import com.ren.factory.abstract1.IPhoneProduct;
import com.ren.factory.abstract1.IRouterProduct;
import com.ren.factory.abstract1.computer.XiaoMiComputer;
import com.ren.factory.abstract1.phone.XiaoMiPhone;
import com.ren.factory.abstract1.route.XiaoMiRoute;
import com.ren.factory.abstract1.abstract2.IProductFactory;

/**
 * @author : renwenhao
 * @date : 10:10 2020/12/21
 */
public class XiaoMiFactory implements IProductFactory {
    @Override
    public IPhoneProduct I_PHONE_PRODUCT() {
        return new XiaoMiPhone();
    }

    @Override
    public IRouterProduct I_ROUTER_PRODUCT() {
        return new XiaoMiRoute();
    }

    @Override
    public IComputerProduct I_COMPUTER_PRODUCT() {
        return new XiaoMiComputer();
    }
}
