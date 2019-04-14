package com.soft1841.thread.carousel;

import javax.swing.*;
/**
 * Created by 田震 on 2019/4/9 9:18
 */
public class CarouselFrame extends JFrame {
   public  CarouselFrame() {
       init();
       setTitle("轮播窗体");
       setExtendedState(JFrame.MAXIMIZED_BOTH);
       setVisible(true);
       setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
   }
   public void init(){
      JLabel bgLabel=new JLabel();
       add(bgLabel);
      CarouselThread ct=new CarouselThread();
      ct.setBgLabel(bgLabel);
       new Thread(ct).start();
    }
    public static void main (String[] args) {
        new CarouselFrame();
    }
}
