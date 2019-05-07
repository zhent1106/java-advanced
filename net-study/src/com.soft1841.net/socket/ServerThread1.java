package com.soft1841.net.socket;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.Socket;
/**
 * Created by 田震 on 2019/5/7 6:26
 */
public class ServerThread1  implements Runnable {
    private Socket socket;
    public  ServerThread1(Socket socket){
        this.socket=socket;
    }
    @Override
    public void run () {
        System.out.println("客户端"+socket.getInetAddress()+"连接成功");
        InputStream  inputStream=null;
        try{
            inputStream=socket.getInputStream();
            BufferedReader br=new BufferedReader(new InputStreamReader(inputStream));
            System.out.println("客户端"+socket.getInetAddress()+"给你发来了一条消息"+br.readLine());
            br.close();
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
