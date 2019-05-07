package com.soft1841.net.socket;

import jdk.internal.util.xml.impl.Input;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.UUID;

/**
 * Created by 田震 on 2019/5/7 8:36
 */
public class Server2 {
    public static void main (String[] args) throws IOException {
        ServerSocket serverSockett=new ServerSocket(10086);
        System.out.println("服务器启动!");
        Socket socket;
        while (true){
            socket=serverSockett.accept();
            ServerThread2 serverThread2=new ServerThread2(socket);
            new Thread(serverThread2).start();
        }
    }
}
class  ServerThread2 implements Runnable{
private  Socket socket;
public  ServerThread2(Socket socket){
    this.socket=socket;
}
    @Override
    public void run () {
        System.out.println("客户端"+socket.getInetAddress()+"连接成功！");
        try {
            InputStream inputStream=socket.getInputStream();
            BufferedInputStream bis=new BufferedInputStream(inputStream);
//
            File file = new File(System.getProperty("user.dir") + "\\" +
                    UUID.randomUUID().toString() + ".jpg");
            OutputStream outputStream=new FileOutputStream(file);
            BufferedOutputStream bos=new BufferedOutputStream(outputStream);
            byte[] data=new byte[1024];
          int tmp;
          while ((tmp=bis.read(data))!=-1){
              bos.write(data,0,tmp);
        }
        bos.close();
          bis.close();
          socket.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}