package com.soft1841.net.socket;
import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
/**
 * 服务器端向客户端发送非文本数据
 */
public class Server4 {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(10086);
        System.out.println("服务器启动");
        while (true){
            Socket socket = serverSocket.accept();
            ServerThread4 server = new ServerThread4(socket);
            new Thread(server).start();
        }
    }
}
class ServerThread4 implements Runnable{
    private Socket socket;

    public ServerThread4(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {
        System.out.println("客户端"+socket.getInetAddress()+"连接成功！");
        try {
            File file = new File("E:/upload/1.jpg");
            InputStream inputStream = new FileInputStream(file);
            byte[] b = new byte[(int) file.length()];
            inputStream.read(b);
            OutputStream outputStream = socket.getOutputStream();
            outputStream.write(b);
            inputStream.close();
            outputStream.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}