package com.zeroten.common.util.test.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Created by ZhnagZifan on 2020/1/2
 */
public class UserInvocationHandler implements InvocationHandler {
    public Object object;

    public UserInvocationHandler(Object object) {
        this.object = object;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("开始执行");

        if (args != null || args.length == 1) {
            User user = (User) args[0];
            if ("save".equals(method.getName())) {
                if (user.getName() == null || user.getName().trim().length() == 0) {
                    System.out.println("姓名为空，不保存");
                    return false;
                }
                if (user.getAge() == null || user.getAge() < 0) {
                    System.out.println("年龄不能小于0，不保存");
                    return false;
                }
            }
        }
        Object result = method.invoke(object, args);
        System.out.println("执行结束");
        return result;
    }
}
