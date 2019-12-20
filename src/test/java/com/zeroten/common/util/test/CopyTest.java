package com.zeroten.common.util.test;

/**
 * Created by ZhnagZifan on 2019/12/20
 */
public class CopyTest implements Cloneable {
    String name = "";

    public CopyTest(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    @Override
    public CopyTest clone() throws CloneNotSupportedException {
        return (CopyTest) super.clone();
    }


    public static void main(String[] args) throws CloneNotSupportedException {
        CopyTest copy = new CopyTest("标记接口作用验证").clone();
        System.out.println(copy.getName());
    }
}
