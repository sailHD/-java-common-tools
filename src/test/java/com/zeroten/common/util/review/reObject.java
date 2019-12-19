package com.zeroten.common.util.review;

import org.junit.Test;

/**
 * Created by ZhnagZifan on 2019/12/19
 */
public class reObject {
    private void changePrimitiveValue(int n) {
        n = 200;
    }
    private int reChangePrimitiveValue(int n) {
        n = 200;
        int m = n;
        return m;
    }

    private void changeReferenceValue(StringBuilder sb) {
        sb.append("New");
        sb = new StringBuilder();
        sb.append("NewValue");
    }
    private StringBuilder reChangeReferenceValue(StringBuilder sb) {
        sb.append("New");
        sb = new StringBuilder();
        sb.append("NewValue");
        return sb;
    }

    private void changeStr(String str) {
        str = "xinde";
    }
    private String reChangeStr(String str) {
        str = "xinde";
        return str;
    }


    @Test
    public void testModifyMethodParam() {
        int numb = 10;
        changePrimitiveValue(numb);
        System.out.println("numb=" + numb);
        reChangePrimitiveValue(numb);
        System.out.println("numb=" + numb);

        StringBuilder sb = new StringBuilder();
        sb.append("字符串");
        changeReferenceValue(sb);
        System.out.println("sb=" + sb.toString());
//        changeReferenceValue(sb);

        String str = "jiude";
        changeStr(str);
        System.out.println("str=" + str);
        reChangeStr(str);
        System.out.println("str=" + str);
    }
}
