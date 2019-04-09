package com.soft1841.thread.line;

import javax.swing.*;
import java.awt.*;

/**
 * 绘制彩色线条
 * Created by 田震 on 2019/4/10 6：27
 */
public class DrawLingFrame extends JFrame {
    public DrawLingFrame(){
        init();
        setTitle("绘制彩色线条");
        setSize(900, 600);
        setLocationRelativeTo(null);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public  void init(){
        getContentPane().setBackground(new Color(0,0,0));
        DrawLineThread drawLineThread=new DrawLineThread();
        drawLineThread.setFrame(this);
        new Thread(drawLineThread).start();
    }
    public static void main (String[] args) {
        new DrawLingFrame();
    }
}
