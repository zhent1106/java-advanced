package com.soft1841.thread.daojishi;
import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Timer;
import java.util.TimerTask;
/**
 * Created by 田震 on 2019/4/17 13:16
 */
public class TimeFrame extends JFrame {
    private JPanel jPanel;
    private TimerTask timeTask;
    private Timer timer;
    JTextArea jTextArea;
    public TimeFrame() throws Exception{
        init();
        setTitle("倒计时窗体");
        setSize(800,500);
        setLocationRelativeTo(null);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public  void init() {
        JPanel jPanel = new JPanel() {
            protected void paintComponent (Graphics g) {
                try {
                    BufferedImage bg = ImageIO.read(new File("D://bg.jpg"));
                    g.drawImage(bg, 0, 0, getWidth(), getHeight(), null);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        };
        jTextArea = new JTextArea();
        jTextArea.setLineWrap(true);
        jTextArea.setFont(new Font("微软雅黑", 0, 60));
        jTextArea.setSize(new Dimension(990, 1020));
        String string = ("倒计时");
        char[] chars = string.toCharArray();
        final String[] s = {new String()};
        TimerTask writeWord = new TimerTask() {
            @Override
            public void run() {
                for (int i = 0; i < chars.length; i++) {
                    s[0] += String.valueOf(chars[i]);
                    jTextArea.setText(s[0]);
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        };
        Timer timer=new Timer();
        timer.schedule(writeWord,2000,10);
        JLabel timeLabel=new JLabel();
        timeTask=new TimerTask() {
            @Override
            public void run () {
                Font font=new Font("微软雅黑",Font.BOLD,100);
                timeLabel.setFont(font);
            }
        };
        jPanel.setLayout(new FlowLayout(FlowLayout.CENTER,200,200));
        add(jPanel);
        add(jTextArea,BorderLayout.CENTER);
    }
    public static void main (String[] args) throws Exception {
        JFrame.setDefaultLookAndFeelDecorated(true);
        new TimeFrame();
    }
            }

