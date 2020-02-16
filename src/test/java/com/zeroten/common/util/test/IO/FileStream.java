package com.zeroten.common.util.test.IO;

import org.junit.Test;

import java.io.*;

/**
 * Created by ZhnagZifan on 2020/2/14
 */
public class FileStream {
     /*字节流*/
    //程序：以程序作为参照物

    // 读数据
//    int read( )   掌握
//    int read(byte[] b)    掌握
//    int read(byte[] b,int off,int len)

    @Test
    public void 输入字节流一次性() throws Exception {
        //使用流操作文件
        File f = new File("D:\\金迅\\2020.02.11  I·O\\第一年","《啦啦啦》.txt");//文件
        long len1 = f.length();//读文件大小（单位字节）
        //注意！！！！！！！！！！！！！
        //这只是个demo~!
        //目的：明白字节流的使用方法
        // 以后通常是用数据流来传递，没有中间的文件存在，所以不会用FileInputStream
        InputStream in = new FileInputStream(f);
        int available = in.available(); //获取可读数据的大小（单位字节）
        byte[] bs = new byte[available];
        in.read(bs);
        String str = new String(bs,"UTF-8");
        System.out.println(str);
        in.close();//关闭流
    }

    @Test
    public void 输入字节流一次一个字节() throws Exception {
        File f = new File("D:\\金迅\\2020.02.11  I·O\\第一年","《啦啦啦》.txt");
        long len1 = f.length();
        InputStream in = new FileInputStream(f);
        int len2 = in.available();  // 可读数据大小
        //数组的创建，必然要指定长度，java中默认int
        byte[] bs = new byte[len2];
        //1.如何暂时保存读到的数据
        byte temp = -1;
        //2.如何把数据写入数组
        int index = 0;
        while ((temp = (byte) in.read()) != -1) {
            bs[index] = temp;
            index++;
        }
        String str = new String(bs, "GBK");
        System.out.println(str);
        in.close();
    }




    //写数据
//    void write(int c)          掌握
//    void write(byte[] buf)     掌握
//    void write(byte[] b,int off,int len)

    @Test
    public void 输出字节流一次性() throws Exception {
        File f = new File("D:\\金迅\\2020.02.11  I·O\\第一年","《啦啦啦》.txt");
        OutputStream out = new FileOutputStream(f);
        //输出流，是覆盖原文件里的内容，不是追加
        String str = "第一章\r\n那一年，那一个风雨交加的……此处省略一万字";
        //第一步。获取字节
        byte[] bytes = str.getBytes();
        out.write(bytes); //很粗暴
        out.flush();   //把缓冲区的数据推送到输出流里(看数据量)
        out.close();
    }

    @Test
    public void 输出字节流一次一个字节() throws Exception {
        File f = new File("D:\\金迅\\2020.02.11  I·O\\第一年","《啦啦啦》.txt");
        OutputStream out = new FileOutputStream(f);
        String str = "第一章\r\n那一年，那一个风雨交加的……此处省略一万字\r\n大理的夜好冷";
        byte[] bytes = str.getBytes();

        for (byte b : bytes) {
            out.write(b);
        }
        out.flush();   //把缓冲区的数据推送到输出流里(看数据量)
        out.close();
    }
}
