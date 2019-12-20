package com.zeroten.common.util.test;

/**
 * Created by ZhnagZifan on 2019/12/20
 */
public class Test {
    public static void main(String[] args) throws CloneNotSupportedException {
        CopyTest copy = new CopyTest("标记接口作用验证").clone();
        System.out.println(copy.getName());
    }
}
