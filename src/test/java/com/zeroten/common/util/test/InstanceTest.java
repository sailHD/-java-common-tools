package com.zeroten.common.util.test;

import org.junit.Test;

/**
 * Created by ZhnagZifan on 2019/12/20
 */
public class InstanceTest {
    @Test
    public void testIns() {
        Integer i = new Integer(3);
        Long l = new Long(5);
//        System.out.println(l instanceof Integer);  // 无关，会报错

        Father father = new Father();
        father.setName("爸爸");
        father.setAge(45);
        father.setMoney(120);
        System.out.println(father.toString());

        SonEx sonEx = new SonEx();
        sonEx.setName("儿子");
        sonEx.setAge(24);
        sonEx.setMoney(120);
        sonEx.setOwnMoney(30);
        System.out.println(sonEx.toString());

        Father father1 = new SonEx();
        System.out.println(father instanceof Father);
        System.out.println(father instanceof SonEx);
        System.out.println(sonEx instanceof Father);
        System.out.println(sonEx instanceof SonEx);
        System.out.println(father1 instanceof Father);
        System.out.println(father1 instanceof SonEx);
    }
}
