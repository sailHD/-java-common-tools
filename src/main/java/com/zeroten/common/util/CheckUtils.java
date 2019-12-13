package com.zeroten.common.util;

/**
 * Created by ZhnagZifan on 2019/12/13
 */
public class CheckUtils {
    // 判断是否有字符串为空
    public static boolean isAnyEmpty(String... strings) {
        for (int i = 0; i < strings.length; i++) {
            if (strings[i].equals("")) {
                return true;
            }
        }
        return false;
    }

    // 判断引用类型数组是否为空
    public static boolean isEmpty(Object[] arr) {
        if (arr.length == 0) {
            return true;
        }
        for (int i = 0; i<arr.length; i++) {
            if (arr[i] == null || "".equals(arr[i])) {
                return true;
            }
        }
        return false;
    }

    // 判断 str1 字符串str2是否相等
    public static boolean equals(String str1, String str2) {
        if (str1 == null || str2 == null) {
            return false;
        } else {
            if (str1.equals(str2))
                return true;
        }
        return false;
    }

    // 判断 n1 和 n2 的值是否相等
    public static boolean equals(Integer n1, Integer n2) {
        if (n1 == null || n2 == null) {
            return false;
        } else {
            if (n1.equals(n2)) {
                return true;
            } else {
                return false;
            }
        }
    }
}
