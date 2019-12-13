package com.zeroten.common.util;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

/**
 * Created by ZhnagZifan on 2019/12/13
 */
public class ArrayUtilsTest {

    @Test
    public void testSort() {
//        int[] sort = ArrayUtils.sort(new int[]{2, 0, 1, 4});
//        System.out.println(Arrays.toString(sort));
        Assert.assertEquals(Arrays.toString(ArrayUtils.sort(new int[]{2, 0, 1, 4})),
                Arrays.toString(new int[]{0, 1, 2, 4}));
    }
}
