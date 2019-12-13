package com.zeroten.common.util;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by ZhnagZifan on 2019/12/13
 */
public class CheckUtilsTest {
    @Test
    public void testIsAnyEmpty() {
        Assert.assertEquals(CheckUtils.isAnyEmpty(""), true);
        Assert.assertEquals(CheckUtils.isAnyEmpty("",""), true);
        Assert.assertEquals(CheckUtils.isAnyEmpty("asdf",""), true);
//        Assert.assertEquals(CheckUtils.isAnyEmpty(null), false);
//        Assert.assertEquals(CheckUtils.isAnyEmpty("s",null), false);
    }

    @Test
    public void testIsEmpty() {
        Object[] arr = {1,""};
        Object[] arr2 = {"ss",null};
        Object[] arr3 = {true,null,""};
        Object[] arr4 = new Object[3];
        Assert.assertEquals(CheckUtils.isEmpty(arr), true);
        Assert.assertEquals(CheckUtils.isEmpty(arr2), true);
        Assert.assertEquals(CheckUtils.isEmpty(arr3), true);
        Assert.assertEquals(CheckUtils.isEmpty(arr4), true);
    }

    @Test
    public void testStringEquals() {
        Assert.assertEquals(CheckUtils.equals("1","1"),true);
        Assert.assertEquals(CheckUtils.equals("",""),true);
        Assert.assertEquals(CheckUtils.equals(null,"1"),false);
        Assert.assertEquals(CheckUtils.equals(null,""),false);
        Assert.assertEquals(CheckUtils.equals((String) null,null),false);
    }

    @Test
    public void testIntegerEquals() {
        Assert.assertEquals(CheckUtils.equals(1,1),true);
        Assert.assertEquals(CheckUtils.equals(null,7),false);
        Assert.assertEquals(CheckUtils.equals((Integer) null,null),false);
    }

    @Test
    public void test() {
        String str = "";
        if (str.length() == 0) {
            System.out.println("长度为0");
        }
    }
}
