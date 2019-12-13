package com.zeroten.common.util;

import java.util.Arrays;

/**
 * Created by ZhnagZifan on 2019/12/13
 */
public class ArrayUtils {

    static int[] sortInt;

    // 对传⼊的 int 数组进⾏排序，从⼩到⼤，并返回排序后的结果
    public static int[] sort(int[] arr) {
        sortInt = new int[arr.length];
        int temp;
        for (int i = 0; i < arr.length; i++) {
            if (arr.length - 1 != i) {
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[i] > arr[j]) {
                        temp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = temp;
                    }
                }
            }
            sortInt[i] = arr[i];
        }
        return sortInt;
    }

}
