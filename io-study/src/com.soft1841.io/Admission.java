package com.soft1841.io;
/**
 * Created by 田震 on 2019/4/8 16:23
 */
public class Admission {
    public static void main (String[] args) {
        System.out.println("A,B两队球员的开始上场顺序：");
        A a = new A();
        a.start();
        B b = new B();
        b.start();
    }
}
    class A extends Thread{
        public void run() {
            for (int i = 1; i <= 11; i++) {
                System.out.print("a"+ i+" ");
            }
        }
    }
    class B extends Thread{
        public void run() {
            for (int i = 1; i <= 11; i++) {
                System.out.print("b"+ i+" ");
            }
        }
    }
