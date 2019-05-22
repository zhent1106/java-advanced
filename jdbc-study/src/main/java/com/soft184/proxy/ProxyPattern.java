package com.soft184.proxy;

public class ProxyPattern {
    public static void main(String[] args) {
        Subject proxy = new Proxy();
        proxy.buyMac();
    }
}
