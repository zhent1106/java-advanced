package com.soft184.decorator;

/**
 * Created by 田震 on 2019/5/23 23:30
 */
public class LoggerTest {
    public static void main (String[] args) {
        Logger logger1=new TimeLoggerDecorator(new LoggerFileSystem());
        logger1.log("登陆系统.....");
        Logger logger2=new TimeLoggerDecorator(new LoggerCloud());
        logger2.log("登陆系统.....");

    }
}
