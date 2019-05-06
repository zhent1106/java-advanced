package com.soft1841.net.week11;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

/**
 * Created by 田震 on 2019/5/6 16:54
 */
public class Client2 {
    public static void main (String[] args) throws IOException {
        Socket socket=new Socket("10.30.129.29",10086);
        OutputStream out=socket.getOutputStream();
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入要发给服务器的内容：");
        String info=scanner.nextLine();
        out.write(info.getBytes());
        out.close();
        socket.close();
    }
}
