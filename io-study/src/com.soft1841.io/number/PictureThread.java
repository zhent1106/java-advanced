package com.soft1841.io.number;


import javax.swing.*;
import java.awt.*;
import java.util.Random;

/**
 * Created by lenovo on 2019/4/8 19:56
 */
public class PictureThread extends Thread {
    private JPanel picturePanel;
    public void setPicturePanel(JPanel picturePanel){
        this.picturePanel=picturePanel;

    }
    @Override
    public void run(){
        Random random = new Random();

        while (true){
            int r = random.nextInt(256);
            int g = random.nextInt(256);
            int b = random.nextInt(256);
            picturePanel.setBackground(new Color(r,g,b));
            try {
                Thread.sleep(1200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
