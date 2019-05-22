package com.soft184.proxy;

/**
 * 创建真实对象类
 * @author wanghuan le
 * 2019.05.23
 */
public class RealSubject implements Subject {
    @Override
    public void buyMac() {
        System.out.println("买一台Mac");
    }
}
