package com.soft1841.net.week11;

import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;

/**
 * Created by 田震 on 2019/5/6 16:18
 */
public class Client1 {
    public static void main (String[] args) throws IOException {
        Socket socket=new Socket("10.40.152.78",10086);
        InputStream in=socket.getInputStream();
        byte[] b= new byte[1024];
        in.read(b);
        System.out.println("服务器发送的数据是"+new String(b));
        in.close();
        socket.close();
    }
}
