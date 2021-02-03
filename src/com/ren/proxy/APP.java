package com.ren.proxy;

public class APP {
    public static void main(String[] args) {

        IUserDao userDao = new UserDao();
        IUserDao proxy = new UserDaoProxy(userDao);
        proxy.sava();
    }
}
