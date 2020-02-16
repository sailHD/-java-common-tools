package com.zeroten.common.util.test.IO;

import org.testng.annotations.Test;

import java.io.*;

/**
 * Created by ZhnagZifan on 2020/2/15
 */
public class ReaderDemo {
    //字符输入流   读

    @Test
    public void 测试Reader() throws Exception {
        //InputStreamReader(InputStream in)//参数
        //InputStreamReader(InputStream in, String charsetName)//设字符集
        //一般常用字符集：GBK/UTF-8/GB2312/ISO-8859-1--->保证统一
        //字符串可以指定编码集的编码和解码
//		String s1 = new String(bytes, "newcharset");
//		String s2 = "".getBytes("charset");

        // 一个字节一个字节读
        Reader reader = new InputStreamReader(
                new FileInputStream(
                        new File("D:\\金迅\\2020.02.13字符流和序列化\\test","测试reader和writer.txt")),"GBK");
        //char == int
        //在泛型当中，基本数据类型的泛型，只能使用包装类
        StringBuffer sb = new StringBuffer();
        int temp = -1;
        while ((temp = reader.read()) != -1) {  //char 是没有-1
            sb.append((char) temp);
        }
        System.out.println(sb.toString());
        reader.close();
    }

    @Test
//        该类只能按照本地平台的字符编码来读取数据，用户不能指定其他的字符编码类型
    public void testFileReader() throws Exception {
//        FileReader类是InputStreamReader的子类
//        FileReader(File file)
//        FileReader(String name)
//        与字节流FileInputStream类实现文本文件读取步骤类似

        System.out.println(System.getProperty("file.encoding"));  //获得本地平台的字符编码类型
//        Reader fr = new FileReader("D:\\金迅\\2020.02.13字符流和序列化\\test\\测试reader和writer.txt");
        File f = new File("D:\\金迅\\2020.02.13字符流和序列化\\test","测试reader和writer.txt");
        Reader fr = new FileReader(f);

        StringBuffer sb = new StringBuffer();
        int temp = -1;
        while ((temp = fr.read()) != -1) {
            sb.append((char) temp);
        }
        System.out.println(sb.toString());
        fr.close();
    }

    @Test
    public void 测试BufferedReader() throws Exception{
        // 一行一行读
        //缓冲：默认8192/8K
        BufferedReader br = new BufferedReader(
                new InputStreamReader(//设字符集
                        new FileInputStream(
                                new File("D:\\金迅\\2020.02.13字符流和序列化\\test",
                                        "测试reader和writer.txt")),"GBK"));
        //字符流开始，缓冲才有意义
        StringBuffer sb = new StringBuffer();
        String str = "";
        while ((str = br.readLine()) != null) {
            sb.append(str);
            sb.append("\r\n");
        }
        System.out.println(sb.toString());
        br.close();
    }
}
