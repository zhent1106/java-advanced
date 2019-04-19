package com.soft1841.thread.daojishi;

public class JoinThread extends Thread {

    @Override
    public void run() {
        for (int i = 10;i>0;i--){
            System.out.println(i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    public static void main(String[] args) {
        System.out.println("开始倒数");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        JoinThread jointhread  = new JoinThread();
        Thread thread = new Thread(jointhread);
        thread.start();
        try {
            thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("节目开始");
    }

}
