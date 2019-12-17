package com.zeroten.common.util.review;

import org.junit.Test;

import java.sql.SQLOutput;

/**
 * Created by ZhnagZifan on 2019/12/16
 */
public class reString {
    // length,codePointCount,substring,format
    // equals,equalsIgnoreCase,startsWith,endsWith,contains,
    // indexOf,lastIndexOf,replace,replaceAll
    // trim,toUpperCase,toLowerCase
    @Test
    public void test基础等于判断() {
        String str1 = "hello";
        String str2 = "hello";
        String str3 = "hello" + "world";
        String str4 = str2 + "world";
        String str5 = new String("hello");
        String str6 = new String("hello");
        String str7 = str6.intern();
        String str8 = new String("hello").intern();

        System.out.println("str1 = str2, " + (str1 == str2));
        System.out.println("str3 = str4, " + (str3 == str4));
        System.out.println("str1 = str5, " + (str1 == str5));
        System.out.println("str5 = str6, " + (str5 == str6));
        System.out.println("str1 = str7, " + (str1 == str7));
        System.out.println("str1 = str8, " + (str1 == str8));

        String str9 = "hello";
        str9 += "world";
        System.out.println("str3 = str9, " + (str3 == str9));
    }

    @Test
    public void test长度() {
        // int codePointCount(int beginIndex, int endIndex)` 表示字符串的实际长度，及代码点数。
        String str = "hello,\uD835\uDD5D\uD835\uDD60\uD835\uDD60\uD835\uDD5C";
        System.out.println(str);
        System.out.println("length is: " + str.length());
        System.out.println("code point count is: " + str.codePointCount(0, str.length())
                + ",code point at is: " +str.codePointAt(2));
    }

    @Test
    public void test子串() {
//        String substring(int beginIndex)
//        String substring(int beginIndex, int endIndex)
        String str = "hello, world!";

        System.out.println(str.substring(1));

        System.out.println(str.substring(0, 1));
        System.out.println(str.substring(0, str.length() - 1));
//        System.out.println(str.substring(0, str.length() + 1));
    }

    @Test
    public void test格式化() {
        System.out.printf("hello, %s %n", "world");
        System.out.printf("大写a：%c %n", 'A');
        System.out.printf("100 > 50：%b %n", 100 > 50);
        System.out.printf("100除以2：%d %n", 100 / 2);
        System.out.printf("100的16进制数是：%x %n", 100);
        System.out.printf("100的8进制数是：%o %n", 100);
        System.out.printf("100元打8.5折扣是：%f 元%n", 50 * 0.85);
        System.out.printf("上述价格的16进制数是：%a %n", 50 * 0.85);
        System.out.printf("上面的折扣是%d%% %n", 85);
    }

    @Test
    public void test综合() {
//        相等判断
//        equals 判断是否相等。
//        equalsIgnoreCase 不区分大小写判断是否相等。
//        前缀判断
        System.out.println("hello".startsWith("h"));
//        后缀判断
        System.out.println("hello".endsWith("o"));
//        包含判断
        System.out.println("hello".contains("ll"));
        
//        去空格
        System.out.println(" hello, world! ".trim());
//        写转换
        System.out.println("Hello, world!".toUpperCase());
        System.out.println("Hello, world!".toLowerCase());
//        空串和 Null 串
//        空串是⼀个⻓度为0且内容为空的 String 对象。
//        String 存放 null，表示没有任何对象与该变量关联。

    }

    @Test
    public void test查找替换() {
        //        查找
//        indexOf 从前边查找
//        lastIndexOf 从后边开始找
        System.out.println("-------------------");
        String str = "hello, world!";
        System.out.println(str.indexOf("e"));
        System.out.println(str.indexOf('e'));
        System.out.println(str.indexOf(101));

        System.out.println(str.indexOf("e", 2));

        System.out.println(str.indexOf("l"));
        System.out.println(str.lastIndexOf("l"));
        System.out.println(str.lastIndexOf("l", 9));

//        查找替换
//        replace
//        replaceAll
        System.out.println("hello, world!".replace('o', 'A'));
        System.out.println("hello, world!".replace("o", "OOO"));
        System.out.println("hello, world!".replaceAll("o", "OOO"));
    }

    @Test
    public void testStringBufferStringBuilder() {
//        append 在字符串结尾追加
//        length 返回当前⻓度
//        setLength 设置字符串⻓度
    }


    //        去掉字符串开头/结尾/中间的空格（不使⽤ trim ⽅法）
    public static String trimAll(String str) {
        StringBuilder tmp = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c == ' ') {
                continue;
            }
            tmp.append(c);
        }
        return tmp.toString();
    }

//    反转字符串，比如输入 123，反转结果 321
    public static String reverse(String str) {
        StringBuilder tmp = new StringBuilder();
        char[] chars = str.toCharArray();
        for (int i = chars.length - 1; i >= 0; i--) {
            char c = chars[i];
            tmp.append(c);
        }
        return tmp.toString();
    }

    public static void main(String[] args) {
        String str = "     33     555    ";
        System.out.println(trimAll(str));
        String str1 = "1234";
        System.out.println(reverse(str1));
    }

}
