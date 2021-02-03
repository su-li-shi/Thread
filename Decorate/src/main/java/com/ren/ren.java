package com.ren;

/**
 * @author : renwenhao
 * @date : 17:45 2020/12/23
 */
public class ren {

    public static void main(String[] args) {
        //创建出最原始的实现类
        Phone phone = new IphoneX();

        //装饰成打电话之前可以听音乐的功能
        phone = new MusicPhone(phone);

        //装饰成打电话之后可以通知当前时间的功能
        phone = new GiveCurrentTimePhone(phone);

        phone.call();

    }
}
