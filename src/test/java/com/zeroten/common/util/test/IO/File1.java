package com.zeroten.common.util.test.IO;

import org.junit.Test;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

/**
 * Created by ZhnagZifan on 2020/2/14
 */
public class File1 {
    //文件在代码当中的表现形式
    //在创建File对象的时候，这个就是一个对象，没有读取文件，也不会验证
//		File f1 = new File("文件的路径（全路径）");//
//		File f2 = new File("文件的路径","文件名");//
    //路径：
    //在windows当中：\\
    //在linux当中：/


    //目录的创建
    @Test
    public void 目录的创建() {
        File f = new File("D:\\金迅\\2020.02.11  I·O\\第一年");
        File f2 = new File("D:\\金迅\\2020.02.11  I·O\\第一年\\第二月\\第三日");
        //没有哪个规定，文件一定要有后缀
        System.out.println("文件或者目录是否存在："+f.exists());//判断文件或者目录是否存在
        /*if (!f.exists()) {
            boolean b = f.mkdir();//创建目录 ， 不会创建不存在的父目录
            System.out.println(b);
        }*/
        if (!f2.exists()) {
//            boolean b = f2.mkdir();
            boolean b = f2.mkdirs();//创建目录 ，同时创建父目录
            System.out.println(b);
        }
    }

    @Test
    public void 创建文件() throws IOException {
        File f = new File("D:\\金迅\\2020.02.11  I·O\\第一年","《啦啦啦》.txt");//文件
        if (!f.exists()) {
            boolean newFile = f.createNewFile();
            System.out.println(newFile);
        }
    }

    @Test
    public void 判断是否是文件或目录() {
        File f = new File("D:\\金迅\\2020.02.11  I·O\\第一年");//目录
        File f2 = new File("D:\\金迅\\2020.02.11  I·O\\第一年","《啦啦啦》.txt");//文件

        System.out.println(f.isDirectory());
        System.out.println(f2.isFile());
    }

    @Test
    public void 其他方法() {
        File f = new File("D:\\金迅\\2020.02.11  I·O\\第一年");//目录
        File f2 = new File("D:\\金迅\\2020.02.11  I·O\\第一年","《啦啦啦》.txt");//文件
        //通常是需要找到在容器中的位置，在web当中有专门的方法
        System.out.println(f2.length());   // 获取的是字节长度，也是不用的
        String[] fileList = f.list();      // 获取当前文件夹的内容
        System.out.println(Arrays.toString(fileList));
    }
}
