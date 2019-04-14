package com.soft1841.thread.group;
import javax.swing.*;
import java.awt.*;
/**
 * Created by 吃葡萄不吐葡萄皮之祖国的葡萄 on 2019/4/9 10:05
 */
public class ImgFrame extends JFrame {
    private  JFrame frame = new JFrame("背景图片");
    private JPanel imgPanel;
    private ImageIcon imageIcon;
    public  ImgFrame(){
        init();
        setTitle("吃葡萄不吐葡萄皮之祖国的葡萄");
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setVisible(true);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }
    public void init(){
        imageIcon  = new ImageIcon("E:/bg.jpg");
         JLabel label = new JLabel(imageIcon);
        // 把标签的大小位置设置为图片刚好填充整个面板
         label.setBounds(0,0,imageIcon.getIconWidth(),imageIcon.getIconHeight());
        imgPanel = (JPanel) frame.getContentPane();
        imgPanel.setLayout(new FlowLayout());
        frame.getLayeredPane().setLayout(null);
        frame.getLayeredPane().add(label, new Integer(Integer.MIN_VALUE));
        add(imgPanel);
        add(label);
        JLabel bgLabel=new JLabel();
        add(bgLabel);
       ImgThread it=new ImgThread();
        it.setBgLabel(bgLabel);
        new Thread(it).start();
    }
    public static void main (String[] args) {
        new ImgFrame();
    }
}
