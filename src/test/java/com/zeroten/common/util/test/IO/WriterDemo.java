package com.zeroten.common.util.test.IO;

import org.testng.annotations.Test;

import java.io.*;

/**
 * Created by ZhnagZifan on 2020/2/15
 */
public class WriterDemo {
    //字符输出流   写


    @Test
    public void 测试Writer() throws Exception {
//        Writer类常用方法
//        write(String str)
//        write(String str,int off,int len)
//        void close()
//        void flush()

        Writer writer = new OutputStreamWriter(
                new FileOutputStream(
                        new File("D:\\金迅\\2020.02.13字符流和序列化\\test","测试reader和writer.txt")));

        writer.write("那一夜，那一晚....\r\n" +
                "不要忘了~~\r\n"+"那一天");
        writer.flush(); // 清孔缓冲区
        writer.close();
    }

    @Test
    public void 测试BufferedWriter() throws Exception {

        BufferedWriter bw = new BufferedWriter(
                new OutputStreamWriter(
                        new FileOutputStream(
                                new File("D:\\金迅\\2020.02.13字符流和序列化\\test","测试reader和writer.txt"))));
        bw.write("那一夜，那一晚....\r\n" +
                "不要忘了~~\r\n"+"那一天啊");
        bw.flush(); // 清孔缓冲区
        bw.close();
    }
}
