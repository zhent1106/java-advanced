package com.soft1841;

import java.io.File;

/**
 * Created by 田震 on 2019/4/1 06:01
 */
public class FolderTest {
    public static void main (String[] args) {
      String path="E:\\Java";
        File file=new File(path);
        File[]  files =file.listFiles();
        for (File f :
                files) {
            if (!f.isDirectory()){
                System.out.println(f);
            }
        }
    }

}
