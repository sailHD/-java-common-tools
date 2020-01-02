package com.zeroten.common.util.test.proxy;

import java.lang.reflect.Proxy;

/**
 * Created by ZhnagZifan on 2020/1/2
 */
public class UserService {
    public static void staticProxy() {
        User user = new User("zx", -22);

        UserDao userDao = new UserDaoImpl();
        UserStaticProxy userStaticProxy = new UserStaticProxy(userDao);
        userStaticProxy.save(user);
    }

    public static void JDKProxy() {
        User user = new User("zx", 22);

        UserDao userDao = new UserDaoImpl();
        UserInvocationHandler handler = new UserInvocationHandler(userDao);
        UserDao userDaoProxy = (UserDao) Proxy.newProxyInstance(
                userDao.getClass().getClassLoader(),
                userDao.getClass().getInterfaces(),
                handler
        );

        userDaoProxy.save(user);
    }

    public static void JDKProxy2() {
        User user = new User("zx", 22);

        User2Dao userDao = new User2Dao();
        UserInvocationHandler handler = new UserInvocationHandler(userDao);
        UserDao userDaoProxy = (UserDao) Proxy.newProxyInstance(
                userDao.getClass().getClassLoader(),
                userDao.getClass().getInterfaces(),
                handler
        );

        userDaoProxy.save(user);
    }

    private static void cglibProxy() {
        User user = new User("张三", 21);
        User2Dao user2Dao = new User2Dao();

        User2DaoCgligProxy cglibProxy = new User2DaoCgligProxy(user2Dao);
        User2Dao user2DaoProxy = (User2Dao) cglibProxy.getProxyInstance();
        user2DaoProxy.save(user);
    }

    public static void main(String[] args) {
        //1.静态代理
//        staticProxy();

        //2.动态代理
//        JDKProxy();

        //2.动态代理 - 被代理对象不是基于接口来实现的
//        JDKProxy2();

        //3.cglib代理
        cglibProxy();
    }


}
