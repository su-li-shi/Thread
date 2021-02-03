package com.ren.proxy1;

import com.ren.proxy1.IUserDao;

public class UserDao implements IUserDao {
    @Override
    public void save() {
        System.out.println("------已经保存数据-------");
    }
}
