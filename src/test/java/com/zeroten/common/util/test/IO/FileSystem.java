package com.zeroten.common.util.test.IO;

import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by ZhnagZifan on 2020/2/15
 */
public class FileSystem {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("输入需要浏览的目录/文件的绝对路径：");
        while (scanner.hasNext()) {
            String absPath = scanner.nextLine();

            File f = new File(absPath);// D:\金迅\2020.02.13字符流和序列化\test\filesystem.txt
            if (f.isDirectory()) {
                String[] list = f.list();
                System.out.println("此路径下的目录和文件："+Arrays.toString(list));
                break;
            }
            if (f.isFile() && f.exists()) {
                scanner = new Scanner(System.in);
                System.out.println("输入查看或删除");
                while (scanner.hasNext()){
                    String command = scanner.nextLine();
                    Reader reader = null;
                    if ("查看".equals(command)) {
                        reader = new InputStreamReader(new FileInputStream(f),"GBK");
                        StringBuffer sb = new StringBuffer();
                        int temp = -1;

                        while ((temp = reader.read()) != -1) {
                            sb.append((char) temp);
                        }
                        System.out.println("文件内容："+sb.toString());
                        reader.close();
                        break;
                    } else if ("删除".equals(command)) {
                        boolean delete = f.delete();
                        System.out.println("是否删除文件："+delete);
                        break;
                    } else {
                        System.out.println("重新输入");
                        continue;
                    }
                }
            }
        }


    }
}
