package com.zeroten.common.util.test.fanxingAndenum;

/**
 * Created by ZhnagZifan on 2020/2/24
 */
public class demoEnum {
    public static void main(String[] args) {
        SHUAI_GE shuaiGe = SHUAI_GE.SHUAI;// 声明并赋值
        //在类的定义和使用中，传递
//        Zzf zzf = new Zzf();
//        zzf.setShuai_ge(shuaiGe);
        //在switch使用中传递
        switch (shuaiGe) {
            case SHUAI:
                break;
            case HEN_SHUAI:
                break;
        }

//        testEnum();

        testFooood();
    }

    private static void testFooood() {
        System.out.println(Fooood.A.A1);
        System.out.println(Fooood.B.B2);
    }

    private static void testEnum() {
        SHUAI_GE shuaiGe = SHUAI_GE.HEN_SHUAI;
        System.out.println(shuaiGe); // HEN_SHUAI
        System.out.println(shuaiGe.getValue()); // 1
        System.out.println(SHUAI_GE.SHUAI.isShuai());
        System.out.println(SHUAI_GE.SHUAI.isHenShuai());
        System.out.println(SHUAI_GE.HEN_SHUAI.isShuai());
        System.out.println(SHUAI_GE.HEN_SHUAI.isHenShuai());
    }
}
