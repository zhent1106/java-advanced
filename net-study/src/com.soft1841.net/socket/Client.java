package com.soft1841.net.socket;

import com.oracle.xmlns.internal.webservices.jaxws_databinding.SoapBindingParameterStyle;

import java.io.IOException;
import java.net.Socket;

/**
 * 客户端
 * Created by 田震 on 2019/5/7 8:16
 */
public class Client {
    public static void main (String[] args) throws IOException {
        Socket socket=new Socket("127.0.0.1",10086);

        System.out.println(socket.getRemoteSocketAddress()+"连接成功");

    }
}
