package com.soft184.jdbc;

/**
 * Created by 田震 on 2019/5/20 6:32
 */
public class SingletonTest {
    public static void main (String[] args) {
        SingLeton object=SingLeton.getInstance();
        object.showMessage();
    }
}
