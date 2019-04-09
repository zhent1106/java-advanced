package com.soft1841.thread.TICKET;

/**
 * 售票线程程序3
 * 实现runnable类接口并实现线程同步（加锁）   数据共享，线程同步，代码快的方式加锁
 * Created by 田震 on 2019/4/9 8:27
 */
public class TicketThreadTest3 {
    public static void main (String[] args) {
        TicketThread3 tt = new TicketThread3();
        Thread thread1 = new Thread(tt, "南工院");
        Thread thread2 = new Thread(tt, "南信院");
        Thread thread3 = new Thread(tt, "南铁院");
        thread1.start();
        thread2.start();
        thread3.start();
    }
}
class  TicketThread3 implements Runnable {
    private int tickets = 10;

    @Override
    public void run () {
        while (tickets > 0) {
            //加锁 同步售票代码块
            synchronized (this) {
                if (tickets > 0) {
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        System.out.println("中断异常");
                    }
                    System.out.println(Thread.currentThread().getName() + "已开通售票通道，当前票数为：" + --tickets);
                } else {
                    break;
                }

            }
        }
    }
}