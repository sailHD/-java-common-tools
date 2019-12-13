package com.zeroten.common.util;

import org.junit.Test;

import java.util.Arrays;

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
}
