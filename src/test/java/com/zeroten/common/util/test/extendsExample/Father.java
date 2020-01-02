package com.zeroten.common.util.test.extendsExample;

/**
 * Created by ZhnagZifan on 2019/12/20
 */
public class Father {
    private Integer age;
    private String name;
    private Integer money;

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getMoney() {
        return money;
    }

    public void setMoney(Integer money) {
        this.money = money;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append("名字：");
        sb.append(getName());
        sb.append("，年龄：");
        sb.append(getAge());
        sb.append("，钱财：");
        sb.append(getMoney());
        return sb.toString();
    }
}
