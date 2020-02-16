package com.zeroten.common.util.test.IO;

import java.io.Serializable;

/**
 * Created by ZhnagZifan on 2020/2/16
 */
public class Person implements Serializable {
    /**
     * 保证数据一致性：当成一个默认操作
     */
    private static final long serialVersionUID = 3864539696939260927L;//版本号

    private Integer id;
    private String name;
    private Integer age;
    private Car c;

    public Integer getId() {
        return id;
    }

    public Person setId(Integer id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public Person setName(String name) {
        this.name = name;
        return this;
    }

    public Integer getAge() {
        return age;
    }

    public Person setAge(Integer age) {
        this.age = age;
        return this;
    }
    public Car getC() {
        return c;
    }
    public Person setC(Car c) {
        this.c = c;
        return this;
    }
    @Override
    public String toString() {
        return "Person [id=" + id + ", name=" + name + ", age=" + age + "]";
    }

}
