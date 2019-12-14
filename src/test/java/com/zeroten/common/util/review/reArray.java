package com.zeroten.common.util.review;

import org.junit.Test;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;

/**
 * Created by ZhnagZifan on 2019/12/13
 */
public class reArray {

    @Test
    public void test数组遍历() {
        Integer[] arr = {1, 2, 3, 4, 5};
        System.out.println("1. for循环使⽤数组下标");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        System.out.println("2. for each循环");
        for (Integer a : arr) {
            System.out.println(a);
        }
        int[] arr2 = {1, 2, 3, 4, 5};
        System.out.println("3. Java 8新增的 Lambda 表达式");
        // Lambda用基本数据类型得到的是内存地址  为什么
        Arrays.asList(arr2).forEach(a -> System.out.println(a));
    }

    @Test
    public void test数组拷贝() {
        Integer[] arr1 = {1, 2, 3, 4, 5};
        Integer[] arr2 = {6, 7, 8, 9, 10};

        Integer[] arr3 = Arrays.copyOf(arr1, 3);
        System.out.println(Arrays.toString(arr3));

        Integer[] arr4 = Arrays.copyOfRange(arr1, 2, 5); // 不包含to
        System.out.println(Arrays.toString(arr4));

        System.arraycopy(arr2, 2, arr1, 0, 3);
        System.out.println(Arrays.toString(arr1));
    }

    @Test
    public void test填充() {
//        定义一个大小为 10 的 int 数组，并将数组全部初始化为指定的值 5，打印数组；然后将数组后 3 为赋值为 3，再次打印数组。
        int arr[] = new int[10];
        int arr2[] = new int[]{1,2,3,4};
        Arrays.fill(arr, 5);
        System.out.println(Arrays.toString(arr));

        Arrays.fill(arr, arr.length - 3, arr.length, 3); // 不包含to
        System.out.println(Arrays.toString(arr));

        Arrays.fill(arr2, arr2.length - 2, arr2.length, 8);
        System.out.println(Arrays.toString(arr2));
    }

    @Test
    public void test数组排序() {
        // 定义一个大小为 100 的 int 数组，随机给每一位赋值一个 `0 ~ 100` 之间的数值，然后对该数组进行排序并打印排序结果。
        int[] arr = new int[100];
        for (int index = 0; index < arr.length; index++) {
            arr[index] = new Random().nextInt(100);
        }
        System.out.println("排序前：" + Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println("排序后：" + Arrays.toString(arr));

        String[] strs = {"f","a","z","p"};
        Arrays.sort(strs);
        System.out.println(Arrays.toString(strs));
    }

    @Test
    public void test多维数组和不规则数组() {
        String[][] users = new String[3][];
        users[0] = new String[4];
        users[0][0] = "001";
        users[0][1] = "张三";
        users[0][2] = "女";
        users[0][3] = "25";

        users[1] = new String[4];
        users[1][0] = "002";
        users[1][1] = "李四";
        users[1][2] = "男";
        users[1][3] = "30";

        System.out.println(Arrays.toString(users));

        for (String[] user : users) {
            System.out.println(Arrays.toString(user));
        }
    }

    @Test
    public void 练习() {
//        给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标。
        int[] nums = {2, 7, 11, 15};
        int target = 13;
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    System.out.println(Arrays.toString(new int[] {i, j}));
                }
            }
        }
    }
}
