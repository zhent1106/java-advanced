package com.soft1841.net.week11;

import java.io.IOException;
import java.net.Socket;

/**
 * Created by 田震 on 2019/5/6 6:13
 */
public class Client {
    public static void main (String[] args)throws IOException {
        Socket socket=new Socket("192.168.43.27",10086);
        System.out.println("已和服务器建立联系，远程主机地址："+socket.getRemoteSocketAddress());
    }
}
