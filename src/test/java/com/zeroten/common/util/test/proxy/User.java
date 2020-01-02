package com.zeroten.common.util.test.proxy;

/**
 * Created by ZhnagZifan on 2020/1/2
 */
public class User {
    private String name;
    private Integer age;

    public User(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

}
