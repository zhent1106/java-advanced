package com.soft1841.thread;
/**
 * Created by 田震 on 2019/4/8 6:34
 */
public class ThreadTest1 extends Object implements Runnable{
    private int count =10;
    @Override
    public void run () {
        while (true){
            System.out.print(count+"   ");
            if (--count==0){
                break;
            }
        }
    }
    public static void main (String[] args) {
        ThreadTest1 test1=new ThreadTest1();
        //启动线程
        test1.run();
    }
}
