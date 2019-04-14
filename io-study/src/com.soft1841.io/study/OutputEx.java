package com.soft1841.io.study;
import java.io.*;
/**
 * Created by 田震 on 2019/4/1 15:41
 */
public class OutputEx {
    public static void main (String[] args) throws IOException {
        String str="I Love Java!";
        File file =new File("D://hello.txt");
        if (!file.exists()){
            file.createNewFile();
        }
//       //1.字节流输出
        OutputStream outputStream=new FileOutputStream(file);
        outputStream.write(str.getBytes());
        outputStream.close();
//        //2.字符流输出
//        Writer writer=new FileWriter(file,true);
//        writer.write(str.toCharArray());
//        writer.close();
//        //3.打印流输出--包装流
//        OutputStream outputStream=new FileOutputStream(file);
//        PrintStream printStream=new PrintStream(outputStream);
//        printStream.print(str);
//        outputStream.close();
//        printStream.close();
    }
}
