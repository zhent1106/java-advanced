package com.soft1841.net.socket;

import java.io.*;
import java.net.Socket;

/**
 * Created by 田震 on 2019/5/7 8:36
 */
public class Client2 {
    public static void main (String[] args) throws IOException {
        Socket client = new Socket("10.40.233.120", 10086);
        System.out.println("成功连上服务器");
        File file = new File("D:/01.jpg");
        byte[] b = new byte[(int) file.length()];
        InputStream is = new FileInputStream(file);
        is.read(b);
        BufferedOutputStream bos = new BufferedOutputStream(client.getOutputStream());
        bos.write(b);
        is.close();
        bos.close();
    }
}