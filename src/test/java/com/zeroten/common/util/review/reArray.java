package com.zeroten.common.util.review;

import org.junit.Test;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
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
    public void test数组相等() {
        /*Arrays.equals比较的是两个数组的元素是否相等。
        == 比较的是变量(栈)内存中存放的对象的(堆)内存地址，用来判断两个对象的地址是否相同，即是否是指相同一个对象。比较的是真正意义上的指针操作。
        equals用来比较的是两个对象的内容是否相等，由于所有的类都是继承自java.lang.Object类的，所以适用于所有对象，
        如果没有对该方法进行覆盖的话，调用的仍然是Object类中的方法，而Object中的equals方法返回的却是==的判断。
        
        所以一般可以重写equals方法, 选取"内容"进行比较*/
        int[] a = new  int[]{1,2,3};
        int[] b = new int[]{1,2,3};
        System.out.println(a == b); //返回false
        System.out.println(a.equals(b));//返回false
        System.out.println(Arrays.equals(a,b));//返回true
    }
    
    /**
     *
     * 本类演示了Arrays类中的asList方法
     * 通过四个段落来演示,体现出了该方法的相关特性.
     *
     * (1) 该方法对于基本数据类型的数组支持并不好,当数组是基本数据类型时不建议使用
     * (2) 当使用asList()方法时，数组就和列表链接在一起了.
     *     当更新其中之一时，另一个将自动获得更新。
     *     注意:仅仅针对对象数组类型,基本数据类型数组不具备该特性
     * (3) asList得到的数组是的没有add和remove方法的
     *
     * 阅读相关:通过查看Arrays类的源码可以知道,asList返回的List是Array中的实现的
     * 内部类,而该类并没有定义add和remove方法.另外,为什么修改其中一个,另一个也自动
     * 获得更新了,因为asList获得List实际引用的就是数组
     *
     * 当更新数组或者asList之后的List,另一个将自动获得更新
     * 对基本类型数组，通过asList之后的List修改对应的值后,在运行时会报出异常
     * 但是基本类型数组对应的List是会发生变化的，这是毫无疑问的
     */
    @Test
    public void test数组转化为list() {
        String[] s = {"aa","bb","cc"};
        List<String> strlist = Arrays.asList(s);
        for(String str:strlist){
            System.out.println(str);
        }
        System.out.println("------------------------");
        //基本数据类型结果打印为一个元素
        int[] i ={11,22,33};
        List intlist = Arrays.asList(i);
        for(Object o:intlist){
            System.out.println(o + " ");
        }
        // 这样才可以
        int[] base = (int[]) intlist.get(0);
        for(Object b:base){
            System.out.println(b + " ");
        }
        System.out.println("------------------------");
        Integer[] ob = {11,22,33};
        List<Integer> oblist = Arrays.asList(ob);
        for(int a:oblist){
            System.out.println(a);
        }
    }
/*
    不推荐使用，用处不大
    使用二分搜索法来搜索指定数组，以获得指定对象。
    在进行此调用之前，必须根据元素的自然顺序对数组进行升序排序（通过 sort(Object[])方法）。
    如果没有对数组进行排序，则结果是不确定的。
    （如果数组包含不可相互比较的元素（例如，字符串和整数），则无法 根据其元素的自然顺序对数组进行排序，因此结果是不确定的。）
    如果数组包含多个等于指定对象的元素，则无法保证找到的是哪一个。
    */
    @Test
    public void test二分搜索法获取下标() {
        int arr [] =new int[]{1,3,5,4,5,8,5,9};
        Arrays.sort(arr);
        int index1 = Arrays.binarySearch(arr,6);
        int index2 = Arrays.binarySearch(arr,5);
        int index3 = Arrays.binarySearch(arr,0);
        int index4 = Arrays.binarySearch(arr,10);
        System.out.println("index1 = "+ index1 +", index2 = " + index2 +
                ", index3 = " + index3 +", index4 = "+ index4);

        int index5 = Arrays.binarySearch(arr,1, 4, 6);
        int index6 = Arrays.binarySearch(arr,2, 4, 5);
        int index7 = Arrays.binarySearch(arr,1, 4 ,2);
        int index8 = Arrays.binarySearch(arr,1, 3, 10);
        int index9 = Arrays.binarySearch(arr,1, 3, 0);
        System.out.println("index5 = "+ index5 +", index6 = " + index6 +
                ", index7 = " + index7 +", index8 = "+ index8 +
                ", index9 = " + index9);
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
