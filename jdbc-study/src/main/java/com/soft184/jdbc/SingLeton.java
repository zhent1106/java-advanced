package com.soft184.jdbc;

/**
 * Created by 田震 on 2019/5/20 6:24
 */
public class SingLeton {
    private static SingLeton instance=new SingLeton();
    private SingLeton(){

    }
    public   static SingLeton getInstance(){
        return instance;
    }
    public void showMessage(){
        System.out.println("Hello TianZhen!");
    }
}
