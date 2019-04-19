package com.soft1841.thread.Timer;
import javax.swing.*;
import java.awt.*;
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;

/**
 * Created by 田震 on 2019/4/15 15:50
 */
public class CircleThread  implements Runnable {
    int x = 800;
    int y = 800;
    private JFrame frame;
    public void setFrame(JFrame frame) {
        this.frame = frame;
    }
    @Override
    public void run () {
        TimerTask timerTask = new TimerTask() {
            @Override
            public void run() {
                for (int i = 1; i <= 18; i++) {
                    try {
                        Thread.sleep(900);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    Graphics graphics = frame.getGraphics();
                    graphics.setColor(new Color(new Random().nextInt(256), new
                            Random().nextInt(256), new Random().nextInt(256)));
                    graphics.drawOval(x / 2 - (i + 1) * 10, y / 2 - (i + 1) * 10, 10 + 20 * i,
                            10 + 20 * i);
                }
            }
        };
        Timer timer=new Timer();
        timer.schedule(timerTask,5,500);
    }
    }


//    public static void main (String[] args) {
//        JFrame frame = new CircleThread();
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        frame.setSize(600, 600);
//        frame.setVisible(true);//该方法会调用子类的paint重写方法，画出相应paint中的图形
//    }
//    @Override
//    public void paint (Graphics g) {
//        int x0 = getSize().width / 2;//圆的最左上角x坐标
//        int y0 = getSize().height / 2;//圆的最左上角y坐标
//        for (int r = 0; r < getSize().height / 2; r += 10) {
//
////            g.setColor(getRandomColor());//给画笔设置随机数颜色
//			/*画圆，前两个参数是圆的xy坐标，xy坐标值想等为同心圆，否则不是
//			后面两个参数是宽和高，若宽高相等则为圆，否则为椭圆*/
//            g.drawOval(x0 - r, y0 - r, r * 2, r * 2);
//        }
//    }
//
//    //    public Color getRandomColor(){
////        Color color=new Color((int)(Math.random()*256), (int)(Math.random()*256), (int)(Math.random()*256));
////        return color;
////    }
//    @Override
//    public void run () {
////        for (int r = 0; r < getSize().height / 2; r += 10) {
////            g.drawOval(x0 - r, y0 - r, r * 2, r * 2);
//        }
