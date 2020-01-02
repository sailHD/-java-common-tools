package com.zeroten.common.util.test.proxy;

/**
 * Created by ZhnagZifan on 2020/1/2
 */
public class UserStaticProxy implements UserDao {
    private UserDao target;

    public UserStaticProxy(UserDao userDao) {
        this.target = userDao;
    }

    @Override
    public boolean save(User user) {
        if (user.getName() == null || user.getName().trim().length() == 0) {
            System.out.println("姓名为空，不保存");
            return false;
        }
        if (user.getAge() == null || user.getAge() < 0) {
            System.out.println("年龄不能小于0，不保存");
            return false;
        }
        return this.target.save(user);
    }
}
