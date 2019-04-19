package com.soft1841.thread.assembly;
import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;
/**
 * Created by 田震 on 2019/4/16 8:22
 */
public class clockFrame extends JFrame {
    private JPanel jPanel;
    private TimerTask  clockTask,timeTask;
    private Timer timer;
    public clockFrame() throws Exception {
        init();
        setTitle("定时闹钟");
        setSize(700,400);
        setLocationRelativeTo(null);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocation(1200,650);
    }
 public  void  init() {
     JPanel jPanel = new JPanel() {
         protected void paintComponent(Graphics g) {
             try {
                 BufferedImage bg = ImageIO.read(new File("D:/2.jpg"));
                 g.drawImage(bg,0,0,getWidth(),getHeight(),null);
             } catch (IOException e) {
                 e.printStackTrace();
             }
         }
     };
     JLabel timeLabel=new JLabel();
     SimpleDateFormat format = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
  timeTask=new TimerTask() {
      @Override
      public void run () {
          Date currentTime = new Date();
          String a = format.format(currentTime);
          timeLabel.setText(a);
          Font font=new Font("微软雅黑",Font.BOLD,35);
          timeLabel.setFont(font);
      }
  };
     jPanel.setLayout(new FlowLayout(FlowLayout.CENTER,200,200));
     add(jPanel);
     jPanel.add(timeLabel);
     clockTask = new TimerTask() {
         @Override
         public void run() {
             Date date = new Date();
             SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
             String timeString = sdf.format(date);
             if(timeString.equals("2019-04-16 09:16:35")){
                 JOptionPane.showMessageDialog(jPanel, "起床时间到啦~~");
             }
             if(timeString.equals("2019-04-16 09:16:40")){
                 JOptionPane.showMessageDialog(jPanel, "吃饭时间到啦~~");
                 this.cancel();
             }
         }
     };
     timer = new Timer();
     timer.schedule(timeTask,0,1000);
     timer.scheduleAtFixedRate(clockTask, 0, 1000);
 }
    public static void main (String[] args) throws Exception {
        JFrame.setDefaultLookAndFeelDecorated(true);
        new clockFrame();
    }
}
