package com.soft184.decorator;

import java.util.Calendar;

/**
 * Created by 田震 on 2019/5/23 23:25
 */
public class TimeLoggerDecorator implements Logger {
    private Logger decoratorLogger;
    public TimeLoggerDecorator(Logger decoratorLogger){
        this.decoratorLogger=decoratorLogger;
    }
    @Override
    public void log (String message) {
    decoratorLogger.log(message);
    logTime();
    }
    public void logTime(){
        System.out.println(Calendar.getInstance().getTime());
    }
}
