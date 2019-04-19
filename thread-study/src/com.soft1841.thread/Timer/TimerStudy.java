package com.soft1841.thread.Timer;
import javax.swing.*;
import java.awt.*;
import java.util.Timer;
import java.util.TimerTask;
/**
 * Created by 田震 on 2019/4/15 20:27
 */
public class TimerStudy extends JFrame {
    JPanel ovalPanel;
    JTextArea jTextArea;
    public TimerStudy(){
        init();
        setTitle("timer和join方法实体窗口");
        setSize(1980, 1020);
        setLocationRelativeTo(null);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public void init(){
        ovalPanel = new JPanel();
        ovalPanel.setSize(new Dimension(800, 1020));
        CircleThread circleThread = new CircleThread();
        circleThread.setFrame(this);
        new Thread(circleThread).start();
        add(ovalPanel, BorderLayout.WEST);
        jTextArea = new JTextArea();
        jTextArea.setLineWrap(true);
        jTextArea.setFont(new Font("微软雅黑", 0, 60));
        jTextArea.setSize(new Dimension(990, 1020));
        String string = ("少壮不努力，老大敲代码\n-----By TIANZHEN\n");
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
        add(jTextArea,BorderLayout.EAST);
    }
    public static void main (String[] args) {
        new TimerStudy();
    }
}
