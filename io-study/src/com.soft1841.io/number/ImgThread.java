package com.soft1841.io.number;
import javax.swing.*;
/**
 * Created by 田震 on 2019/4/8 20:49
 */
public class ImgThread extends Thread {
    private JLabel imgLabel;
    String[] imgPath = {"01.jpg", "02.jpg", "03.jpg", "04.jpg","05.jpg","06.jpg","07.jpg","08.jpg"};
    public void setImgLabel(JLabel imgLabel) {
        this.imgLabel = imgLabel;
    }
    @Override
    public void run() {
        //循环读取图片数组
        while (true) {
            for (int i = 0; i < imgPath.length; i++) {
                //用每个资源创建一个图片对象
                Icon icon = new ImageIcon(NumFrame.class.getResource("/img/" + imgPath[i]));
                imgLabel.setIcon(icon);
                try {
                    //休眠2秒
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                //轮播到最后一张图的时候，回到第一张重新播放
                if (i == imgPath.length - 1) {
                    i = 0;
            }
        }
    }
}
}