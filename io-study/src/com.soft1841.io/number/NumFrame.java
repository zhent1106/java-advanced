package com.soft1841.io.number;
import javax.swing.*;
import java.awt.*;
/**
 * Created by 田震 on 2019/4/8 16:36
 */
public class NumFrame extends JFrame{
    private JLabel numberLabel;
    private JLabel timeLabel;
    private JPanel pictureJPanle,rgbJPanle;
    private JLabel imgLabel;
    public NumFrame () {
        init();
        setTitle("随机数轮播窗体");
        setSize(900, 600);
        setLocationRelativeTo(null);
        setResizable(false);
        setVisible(true);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }
    private void init () {
        numberLabel = new JLabel();
        timeLabel = new JLabel();
        Font font = new Font("微软雅黑",Font.BOLD,30);
        Font font1=new Font("宋体",Font.ITALIC,28);
        numberLabel.setFont(font);
        timeLabel.setFont(font1);
        add(numberLabel,BorderLayout.NORTH);
        add(timeLabel,BorderLayout.SOUTH);
        NumThread numThread = new NumThread();
        numThread.setNumberLabel(numberLabel);
        numThread.start();
        TimeThread timeThread = new TimeThread();
        timeThread.setTimeLabel(timeLabel);
        timeThread.start();
        pictureJPanle =new JPanel();
        add(pictureJPanle,BorderLayout.EAST);
        rgbJPanle=new JPanel();
        add(rgbJPanle,BorderLayout.WEST);
        imgLabel=new JLabel();
        add(imgLabel,BorderLayout.CENTER);
        PictureThread pictureThread=new PictureThread();
        pictureThread.setPicturePanel(pictureJPanle);
        pictureThread.start();
        RgbThread rgbThread=new RgbThread();
        rgbThread.setRgbJPanle(rgbJPanle);
        rgbThread.start();
        ImgThread imgThread = new ImgThread();
        imgThread.setImgLabel(imgLabel);
        imgThread.start();
    }
    public static void main (String[] args) {
          new NumFrame();
    }
}
