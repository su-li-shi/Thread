package com.ren.proxy1;

/**
 * 测试类
 * @author : renwenhao
 * @date : 15:59 2020/12/18
 */
public class App {
    public static void main(String[] args) {
        //目标对象
        IUserDao target = new UserDao();
        //原始类型
        System.out.println(target.getClass());

        //给目标对象，创建代理对象
        IUserDao proxy =(IUserDao) new ProxyFactory(target).getProxyInstance();
        //内存中动态代理生成的代理对象
        System.out.println(proxy.getClass());

        //执行方法
        proxy.save();
    }
}
