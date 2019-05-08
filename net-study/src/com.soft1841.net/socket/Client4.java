package com.soft1841.net.socket;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;
import java.util.UUID;
/**
 * 服务器端向客户端发送非文本数据
 */
public class Client4 {
    public static void main(String[] args)throws IOException {
        Socket client = new Socket("192.168.43.27",10086);
        System.out.println("成功连接上服务器...");
        InputStream inputStream = client.getInputStream();
        BufferedInputStream bis = new BufferedInputStream(inputStream);
        System.out.println("请输入要保存的路径：");
        Scanner scanner  = new Scanner(System.in);
        String path = scanner.nextLine();
        File file = new File(path+"/"+ UUID.randomUUID().toString()+".jpg");
        OutputStream os = new FileOutputStream(file);
        BufferedOutputStream bos= new BufferedOutputStream(os);
        byte[] data = new byte[1024];
        int tmp;
        while ((tmp = bis.read(data)) != -1){
            bos.write(data,0,tmp);
        }
        bos.close();
        bis.close();
        client.close();

    }
}
