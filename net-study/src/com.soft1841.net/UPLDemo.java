package com.soft1841.net;

import java.net.MalformedURLException;
import java.net.URL;

/**
 * Created by 田震 on 2019/5/13 22:36
 */
public class UPLDemo {
    public static void main (String[] args) {
        try {
            URL url=new URL("https://www.baidu.com/s?tn=60017574_oem_dg&isource=infinity&iname=baidu&itype=web&ie=utf-8&wd=url%E4%BE%8B%E5%AD%90");
            System.out.println("URL为："+url.toString());
            System.out.println("协议为："+url.getProtocol());
            System.out.println("验证信息："+url.getAuthority());
            System.out.println("文件名及请求参数"+url.getFile());
            System.out.println("主机名："+url.getHost());
            System.out.println("路径："+url.getPath());
            System.out.println("端口："+url.getPort());
            System.out.println("默认端口："+url.getDefaultPort());
            System.out.println("请求参数："+url.getQuery());
            System.out.println("定位位置："+url.getRef());

        } catch (MalformedURLException e) {
            e.printStackTrace();
        }

    }
}
