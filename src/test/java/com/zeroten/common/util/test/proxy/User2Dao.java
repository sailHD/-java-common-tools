package com.zeroten.common.util.test.proxy;

/**
 * Created by ZhnagZifan on 2020/1/2
 */
public class User2Dao {
    public boolean save(User user) {
        System.out.println("保存用户2：" + user.getName() + "," + user.getAge());
        return true;
    }
}
