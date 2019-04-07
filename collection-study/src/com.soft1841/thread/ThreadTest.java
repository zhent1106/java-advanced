package com.soft1841.thread;
/**
 * Created by 田震 on 2019/4/8 6:30
 */
public class ThreadTest extends Thread {
    private int count =10;
    public void run(){
        while (true){
            System.out.print(count+"   ");
            if (--count==0){
                break;
            }
        }
    }
    public static void main (String[] args) {
        ThreadTest test=new ThreadTest();
        //启动线程
        test.start();
    }
}
