package com.zeroten.common.util.test;

/**
 * Created by ZhnagZifan on 2019/12/20
 */
public class SonEx extends Father {
    private Integer ownMoney;

    public Integer getOwnMoney() {
        return ownMoney;
    }

    public void setOwnMoney(Integer ownMoney) {
        this.ownMoney = ownMoney;
    }

    @Override
    public Integer getMoney() {
        return super.getMoney() + getOwnMoney();
    }
}
