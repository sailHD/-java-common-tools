package com.zeroten.common.util.test;

/**
 * Created by ZhnagZifan on 2019/12/19
 */
public class ClassStaticPrefix {
    public static int count;
    public int index;

    public ClassStaticPrefix() {
        count++;
    }

    public static void setCount(int count) {
        ClassStaticPrefix.count = count;
    }

    public static void main(String[] args) {
        ClassStaticPrefix obj1 = new ClassStaticPrefix();
        System.out.println(obj1.count);
        ClassStaticPrefix obj2 = new ClassStaticPrefix();
        System.out.println(ClassStaticPrefix.count);
    }
}
