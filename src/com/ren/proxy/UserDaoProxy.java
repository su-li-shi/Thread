package com.ren.proxy;

public class UserDaoProxy implements IUserDao {
    //接受保存目标对象
     private IUserDao userDao;

    public UserDaoProxy(IUserDao userDao){
        this.userDao = userDao;
    }

    @Override
    public void sava() {
        System.out.println("开始事务");
        userDao.sava();
        System.out.println("提交事务");
    }
}
