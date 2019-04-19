package com.soft1841.string;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;

/**卡片布局实现多图浏览功能
 * Created by 田震 on 2019/4/2 9:10
 */
public class ImageViewFrame extends JFrame implements ActionListener {
    private JLabel centerLabel;
    private JButton chooseButton, preButton, nextButton, firstButton, lastButton;
    private JFileChooser fileChooser;
    private JPanel centerPanel, bottomPanel;
    private CardLayout cardLayout;

    public ImageViewFrame () {
        init();
        setTitle("ImageViewFrame浏览");
        setSize(1000, 800);
        setLocationRelativeTo(null);
        setResizable(false);
        setVisible(true);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }

    private void init () {
        centerPanel = new JPanel();
        centerLabel = new JLabel();
        cardLayout = new CardLayout();
        centerPanel.setLayout(cardLayout);
        centerPanel.setBackground(new Color(24, 64, 22));
        add(centerPanel);
        bottomPanel = new JPanel();
        chooseButton = new JButton("选择照片");
        firstButton = new JButton("第一张");
        preButton = new JButton("前一张");
        nextButton = new JButton("后一张");
        lastButton = new JButton("最后一张");
        bottomPanel.add(chooseButton);
        bottomPanel.add(firstButton);
        bottomPanel.add(preButton);
        bottomPanel.add(nextButton);
        bottomPanel.add(lastButton);
        chooseButton.addActionListener(this);
        firstButton.addActionListener(this);
        preButton.addActionListener(this);
        nextButton.addActionListener(this);
        lastButton.addActionListener(this);
        add(bottomPanel, BorderLayout.SOUTH);
    }
    public static void main (String[] args) {
        new ImageViewFrame();
    }
    @Override
    public void actionPerformed (ActionEvent e) {
        if (e.getSource() == chooseButton) {
            fileChooser = new JFileChooser();
            fileChooser.setCurrentDirectory(new File("D:/img"));
            fileChooser.setMultiSelectionEnabled(true);
            int result = fileChooser.showOpenDialog(null);
            if (result == JFileChooser.APPROVE_OPTION) {
                File[] files = fileChooser.getSelectedFiles();
                for (File f : files) {
                    System.out.println(f.getAbsolutePath());
                    //对每个子文件，创建字节流输出文字数组，构建Icon,并设置给Jlabel；
                    try {
                        byte[] bytes = new byte[(int) f.length()];
                        InputStream inputStream = new FileInputStream(f);
                        inputStream.read(bytes);
                        Icon icon = new ImageIcon(bytes);
                        JLabel imgLabel = new JLabel();
                        imgLabel.setIcon(icon);
                        centerPanel.add(imgLabel);
                    } catch (IOException e1) {
                        JOptionPane.showMessageDialog(null, "IO异常");
                    }
                }
            }

        } if (e.getSource() == preButton) {
            cardLayout.previous(centerPanel);
        }
                    if (e.getSource() == firstButton) {
                        cardLayout.first(centerPanel);}
                        if (e.getSource() == nextButton) {
                            cardLayout.next(centerPanel);}
                            if (e.getSource() == lastButton) {
                                cardLayout.last(centerPanel);
                        }
}
}
