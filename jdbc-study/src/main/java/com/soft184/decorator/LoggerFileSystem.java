package com.soft184.decorator;

/**
 * Created by 田震 on 2019/5/23 23:22
 */
public class LoggerFileSystem implements  Logger {
    @Override
    public void log (String message) {
        System.out.println("日志输出到本地文件系统"+message);
    }
}
