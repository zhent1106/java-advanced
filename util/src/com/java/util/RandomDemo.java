package com.java.util;

import java.util.Random;
/**
 * Random随机数类程序
 * Created by 田震 on 2019/3/12 10:13
 */
public class RandomDemo {
    public static void main (String[] args) {
        //随机产生一个5以内的随机数，包括5
        Random random=new Random();
        //bound不包括自个儿[0,6）
        int num=random.nextInt(6);
        System.out.println(num);
    }
}
