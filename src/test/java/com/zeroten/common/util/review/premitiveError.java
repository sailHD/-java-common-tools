package com.zeroten.common.util.review;

import org.junit.Test;

/**
 * Created by ZhnagZifan on 2019/12/17
 */
public class premitiveError {
//    数值精度顺序：double > float > long > int > short > byte
//包含 hashCode、getClass、max、min 等属性和方法

    @Test
    public void test包装类型转换() {
        int n1 = Integer.parseInt("100");
        System.out.println(n1);

        int n2 = new Integer(100).intValue();
        System.out.println(n2);

        boolean b1 = Boolean.valueOf("true");
        System.out.println(b1);

        boolean b2 = Boolean.valueOf("tRue");
        System.out.println(b2);
    }

    /*
    * 高频区间进行了数据缓存
    *
    * */

    @Test
    public void 比较Integer之间() {
        Integer n1 = 127;
        Integer n2 = 127;
        Integer n3 = 128;
        Integer n4 = 128;
        System.out.println((n1 == n2) + "," + (n3 == n4));  // true,false
        // 会调用valueof方法
        // 原因是有一个缓存数组存储[-128,127]，引用指向的是同一个堆内存地址。超过这个范围以后，才会分配新的内存地址。
    }

    @Test
    public void 比较Double之间() {
        Double d1 = 127d;
        Double d2 = 127d;
        Double d3 = 128d;
        Double d4 = 128d;
        System.out.println((d1 == d2) + "," + (d3 == d4));  //false,false
        // Float/Double：未缓存
    }

    @Test
    public void Integer与new() {
        Integer n1 = 127;
        Integer n2 = new Integer(127);
        System.out.println((n1 == n2) + "," + n1.equals(n2));   // false true
//        本质是因为 Integer 内部维护了一个IntegerCache，
//        -128 到 127 是byte的取值范围，如果在这个取值范围内，自动装箱就不会创建对象，而是从IntegerCache中获取，如果超过了byte的取值返回就会再新创建对象；
    }

    @Test
    public void Integer与int() {
//        基本类型和包装类比较 ==，包装类会自动拆箱成基本类型。而基本类型是值比较，所以 n3 == n4 是true
//        因为 n3 是基本类型，== 比较时会自动拆箱。
        int n1 = 127;
        Integer n2 = new Integer(127);
        int n3 = 128;
        Integer n4 = new Integer(128);
        System.out.println((n1 == n2) + "," + n2.equals(n1) + "," + (n3 == n4) + "," + n4.equals(n3)); // true,true,true,true
    }

    @Test
    public void 程序是否会报错() {
        int iMax = Integer.MAX_VALUE;
        int val = iMax * iMax;
        System.out.println(val);
        // 不会，数值计算超出范围时程序不会报错，但是会返回一个错误的结果
    }

}
