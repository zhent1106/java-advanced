package com.java.util;

import java.util.Scanner;

/**
 * integer类的练习
 * Created by 田震 on 2019/3/12 8:35
 */
public class IntegerDemo {
    public static void main (String[] args) {
        int num=31;
        //调用Integer类的方法，将num进行进制转换
        String str1=Integer.toBinaryString(num);
        System.out.println("二进制:"+str1);
        String str2=Integer.toHexString(num);
        System.out.println("十六进制:"+str2);
        String str3=Integer.toOctalString(num);
        System.out.println("八进制:"+str3);
        String str4=Integer.toString(num);
        System.out.println("十五进制:"+str4);
        System.out.println("------------------分割线，以下是自定义内容----------------");
        System.out.println("转换为八进制"+convert(num,8));
    }
    public static  String convert (int num,int radix) {
        //num转为radix进制
        //创建一个StringBuffer,用来存放结果为字符串
        StringBuffer str = new StringBuffer();
        while (num != 0) {
            //求出余数
            int remainder = num % radix;
            //将余数加入stringBuffer
            str.append(String.valueOf(remainder));
            //更新被除数为商
            num = num / radix;
        }
        //将结果串取反返回
        return str.reverse().toString();
    }
}
