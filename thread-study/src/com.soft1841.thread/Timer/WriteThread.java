package com.soft1841.thread.Timer;
import javax.swing.*;
/**
 * Created by 田震 on 2019/4/15 15:51
 */
public class WriteThread  {
    public static void main(String[] args) {
         WT wt = new WT();//创建一个对象
        Thread writeThread = new Thread(wt);//创建一个线程
        writeThread.start();//线程开始
    }
}
class WT implements Runnable {
    String text = "少壮不努力，老大敲代码\n-----By H4ckSo1di3r";
    public void run () {
        for (int i = 0; i < text.length(); i++) {
            System.out.print(text.charAt(i));
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}