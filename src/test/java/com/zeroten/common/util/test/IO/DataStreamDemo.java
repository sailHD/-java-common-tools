package com.zeroten.common.util.test.IO;

import org.testng.annotations.Test;

import java.io.*;

/**
 * Created by ZhnagZifan on 2020/2/15
 */
// 读写二进制文件
public class DataStreamDemo {
//    DataInputStream类
//        FileInputStream的子类
//          与FileInputStream类结合使用读取二进制文件
//    DataOutputStream类
//         FileOutputStream的子类
//            与FileOutputStream类结合使用写二进制文件

    @Test
    public void 测试DataInputStream和DataOutputStream类() throws IOException {
        //这是个文件，用于保存“内存数据”
        //把这个文件当成一个持久化的对象
        File file = new File("D:\\金迅\\2020.02.13字符流和序列化\\test","测试DataInputStream和DataOutputStream.txt");
        if (!file.exists()) {
            file.createNewFile();
        }
        //不是序列化
        // 保持读写顺序一致
        DataOutputStream out = new DataOutputStream(new FileOutputStream(file));
        out.writeInt(111);
        out.writeUTF("fjsfdk");
        out.writeInt(456);
        out.writeDouble(500000.00);
        out.flush();
        out.close();

        DataInputStream in = new DataInputStream(new FileInputStream(file));
        System.out.println(in.readInt());
        System.out.println(in.readUTF());
        System.out.println(in.readInt());
        System.out.println(in.readDouble());
        in.close();
    }

    @Test
    public void 合起来() throws Exception{
        DataOutputStream dos = null; //声明数据输出流对象
//        File f = new File("D:" + File.separator + "order.txt");//指定文件的保存路径
        File f = new File("D:\\金迅\\2020.02.13字符流和序列化\\test","order.txt");
        OutputStreamWriter oStreamWriter = new OutputStreamWriter(new FileOutputStream(f), "utf-8");
        dos = new DataOutputStream(new FileOutputStream(f));//实例化数据输出流对象
        String names[] = {"衬衣","手套","围巾"};//商品名称
        float prices[] = {98.3f,30.3f,50.5f};    //商品价格
        int nums[] = {3,2,1};    //商品数量
        for(int i = 0;i<names.length;i++){
            /*//循环写入
            dos.writeChar(names[i]);    //写入字符串
            dos.writeChar('\t');    //加入分隔符
            dos.writeFloat(prices[i]);  //写入小数
            dos.writeChar('\t'); //加入分隔符
            dos.writeInt(nums[i]); //写入整数
            dos.writeChar('\n');    //换行
*/
            oStreamWriter.write(names[i]);
            oStreamWriter.write('\t');
            oStreamWriter.write(prices[i]+"");  //写入小数
            oStreamWriter.write('\t'); //加入分隔符
            oStreamWriter.write(nums[i]); //写入整数
            oStreamWriter.write('\n');  //换行
        }
        oStreamWriter.close();  //关闭输出流
    }
}
