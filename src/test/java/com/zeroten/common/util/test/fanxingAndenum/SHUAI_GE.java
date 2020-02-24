package com.zeroten.common.util.test.fanxingAndenum;

/**
 * Created by ZhnagZifan on 2020/2/24
 */
public enum SHUAI_GE {
    SHUAI(0) {
        // 重写枚举方法
        public boolean isShuai() {
            return true;
        }
        public boolean isHenShuai() {
            return false;
        }
    },
    HEN_SHUAI(1) {
        public boolean isShuai() {
            return false;
        }
        public boolean isHenShuai() {
            return true;
        }
    };

    private int des;
    private SHUAI_GE(int i) {
        this.des = i;
    }
    public int getValue() {
        return this.des;
    }

    public boolean isShuai() {
        return true;
    }
    public boolean isHenShuai() {
        return true;
    }
}
