package com.soft1841.thread.carousel;
import javax.swing.*;
import java.io.*;
/**
 * Created by 田震 on 2019/4/9 9:08
 */
public class CarouselThread implements Runnable {
    private  String[] imgs ={"D:/img/1.jpg","D:/img/2.jpg","D:/img/3.jpg","D:/img/4.jpg","D:/img/5.jpg","D:/img/6.jpg","D:/img/7.jpg","D:/img/8.jpg"};
    private JLabel bgLabel;
    public void setBgLabel(JLabel bgLabel){
        this.bgLabel=bgLabel;
    }
    @Override
    public void run () {
        int i=0;
        int len=imgs.length-1;
        while (true){
      try {
          File file=new File(imgs[i]);
          InputStream inputStream=new FileInputStream(file);
          byte[] bytes=new byte[(int) file.length()];
          inputStream.read(bytes);

          Icon icon=new ImageIcon(bytes);
          bgLabel.setIcon(icon);
          try {
              Thread.sleep(1000);
      } catch (InterruptedException e) {
          e.printStackTrace();
      }
            i++;
         if (i==len){
          i=0;
      }
      } catch (IOException e) {
            System.out.println("IO异常");
    }
}
    }
}