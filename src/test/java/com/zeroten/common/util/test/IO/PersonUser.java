package com.zeroten.common.util.test.IO;

import java.io.*;

/**
 * Created by ZhnagZifan on 2020/2/16
 */
// 序列化和反序列化
public class PersonUser {
    public static void main(String[] args) throws Exception{
        Person person = new Person()
                .setAge(24).setId(1).setName("帆哥").setC(new Car());
        //直接把内存数据序列化到文件里了
        //后缀随意，你喜欢就行
        File f = new File("D:\\金迅\\2020.02.13字符流和序列化\\test\\person.o2");//杨氏文件
        if(!f.exists()){
            f.createNewFile();
        }
        //序列化：把对象序列化成二进制
        ObjectOutputStream out = new ObjectOutputStream(
                new FileOutputStream(f));
        out.writeObject(person);
        out.flush();
        out.close();

        //反序列化：把二进制，反序列化成对象
        ObjectInputStream in = new ObjectInputStream(
                new FileInputStream(f));
        Object object = in.readObject();
        if (object instanceof Person) {
            Person p = (Person)object;
            System.out.println(p);
        }
        in.close();
    }
}
