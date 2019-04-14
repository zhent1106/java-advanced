package com.soft1841.io;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/**
 * Created by lenovo on 2019/4/8 20:32
 */
public class Demo4 extends JFrame {
    MyJPanel mp;
    int index;
    ImageIcon[] imgs = {
            new ImageIcon(""),
            new ImageIcon("src/img/02.jpg"),
            new ImageIcon("src/img/03.jpg"),
            new ImageIcon("src/img/04.jpg"),
            new ImageIcon("src/img/05.jpg"),
            new ImageIcon("src/img/06.jpg"),
            new ImageIcon("src/img/07.jpg"),
            new ImageIcon("src/img/08.jpg"),
    };
    public Demo4() {
        mp = new MyJPanel();
        this.add(mp);
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setTitle("窗口");
        this.setVisible(true);
        Timer timer = new Timer(500,new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mp.repaint();
            }
        });
        timer.start();
    }
    public static void main(String[] args) {
        new Demo4();
    }
    class MyJPanel extends JPanel {
        @Override
        public void paint (Graphics g) {
            super.paint(g);
            g.drawImage(imgs[index % imgs.length].getImage(), 0, 0, this);
            index++;
        }
    }
}
