package com.zeroten.common.util;

import org.junit.Test;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by ZhnagZifan on 2019/12/13
 */
public class IntPractice {
    @Test
    public void test吸血鬼() {
        String iStr, jStr, tempStr;
        char[] iChar, jChar, chars;
        char[] temp = new char[4];
        int sum = 0;

        for (int i = 10; i < 100; i++) {
            for (int j = i + 1; j < 100; j++) {
                if (i == j) {
                    continue;
                }
                iStr = String.valueOf(i);
                jStr = String.valueOf(j);
                tempStr = String.valueOf(i * j);

                iChar = iStr.toCharArray();
                jChar = jStr.toCharArray();
                chars = tempStr.toCharArray();

                System.arraycopy(iChar, 0, temp, 0, 2);
                System.arraycopy(jChar, 0, temp, 2, 2);
                Arrays.sort(chars);
                Arrays.sort(temp);
                if (Arrays.equals(chars, temp)) {
                    sum++;
                    System.out.println(String.format("第%d组：%d*%d=%d", sum, i, j, i * j));
                }
            }
        }
        System.out.println(String.format("共找到%d组吸血鬼数", sum));
    }


    @Test
    public void test回文数() {
        Scanner sc = new Scanner((System.in));
        System.out.println("输入：");
        int num = sc.nextInt();
        boolean result = this.getHuiWenNum(num);
        System.out.println(String.format("输出：%b", result));

    }

    private boolean getHuiWenNum(int num) {
        if (null != num + "" && num + "" != "") {
            StringBuilder sb = new StringBuilder();
            String numStr = String.valueOf(num);

            char[] chars = numStr.toCharArray();
            for (int i = chars.length - 1; i >= 0; i--) {
                sb.append(chars[i]);
            }
            String tempStr = sb.toString();
            System.out.println(String.format("得到新的%s", tempStr));
            if (numStr.equals((tempStr))) {
                return true;
            }
        }
        return false;
    }
}
