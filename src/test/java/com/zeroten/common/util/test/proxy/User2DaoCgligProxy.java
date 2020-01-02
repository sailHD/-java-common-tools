package com.zeroten.common.util.test.proxy;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * Created by ZhnagZifan on 2020/1/2
 */
public class User2DaoCgligProxy implements MethodInterceptor {
    public Object object;

    public User2DaoCgligProxy(Object object) {
        this.object = object;
    }

    public Object getProxyInstance() {
        Enhancer en = new Enhancer();
        en.setSuperclass(object.getClass());
        en.setCallback(this);
        return en.create();
    }

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("开始执行");
        if (objects != null || objects.length == 1) {
            User user = (User) objects[0];
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

        Object result = method.invoke(object, objects);
        System.out.println("执行结束");
        return result;
    }
}
