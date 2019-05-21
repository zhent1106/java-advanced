package com.soft184.adapter;

/**
 * Created by 田震 on 2019/5/21 23:36
 */
public class AdapterTest {
    public static void main (String[] args) {
        System.out.println("特长生招募中...");
        Student student1=new Student(){
            @Override
            public void javaStudy () {
                System.out.println("我是一名java大神");
            }

            @Override
            public void mathStudy () {
                System.out.println("也是一名数学大神");
            }
        };
        student1.javaStudy();
        student1.mathStudy();
        Student student2=new Student(){
            @Override
            public void playBasketball () {
                System.out.println("我篮球打的好");
            }

            @Override
            public void playFootball () {
                System.out.println("足球也踢的好");
            }
        };
        student2.playBasketball();
        student2.playFootball();
    }
}
