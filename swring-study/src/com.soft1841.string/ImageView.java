package com.soft1841.string;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
/**
 * Created by 田震 on 2019/4/2 12:22
 */
public class ImageView extends JFrame implements ActionListener {
    private JPanel centerPanel,bottomPanel,leftPanel;
    private CardLayout cardLayout;
    private GridLayout gridLayout;
    private JButton chooseButton,preBtn,nextBtn,firstBtn,lastBtn;
    private JFileChooser fileChooser;
    private JLabel[] imgLabels;
    private JLabel newimgLabel;
    private GroupLayout groupLayout;
    public ImageView() {
        init();
        setTitle("ImageView浏览图");
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setVisible(true);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }
    private void init () {
        chooseButton = new JButton("选择");
        preBtn = new JButton("前一张");
        nextBtn = new JButton("后一张");
        firstBtn = new JButton("第一张");
        lastBtn = new JButton("最后一张");
        centerPanel = new JPanel();
        leftPanel = new JPanel();
        cardLayout = new CardLayout();
        newimgLabel = new JLabel("图片");
        bottomPanel = new JPanel();

        centerPanel.setLayout(cardLayout);
        //centerPanel.add(imgLabel);
        add(centerPanel,BorderLayout.CENTER);
        centerPanel.setBackground(new Color(189, 230, 247));

        leftPanel.setBackground(new Color(73, 156, 84));
        leftPanel.setMaximumSize(new Dimension(600,JFrame.HEIGHT));
        leftPanel.setMinimumSize(new Dimension(600,JFrame.HEIGHT));
        add(leftPanel,BorderLayout.WEST);

        bottomPanel.add(firstBtn);
        bottomPanel.add(preBtn);
        bottomPanel.add(chooseButton);
        bottomPanel.add(nextBtn);
        bottomPanel.add(lastBtn);
        chooseButton.addActionListener(this);
        preBtn.addActionListener(this);
        nextBtn.addActionListener(this);
        firstBtn.addActionListener(this);
        lastBtn.addActionListener(this);
        add(bottomPanel,BorderLayout.SOUTH);

    }
    public static void main (String[] args) {
          new ImageView();
    }
    @Override
    public void actionPerformed (ActionEvent e) {
        if (e.getSource() == chooseButton) {
            if (e.getSource() == chooseButton){
                fileChooser = new JFileChooser();
                fileChooser.setCurrentDirectory(new File("D://img"));
                fileChooser.setMultiSelectionEnabled(true);
                int result = fileChooser.showOpenDialog(null);
                if (result == JFileChooser.APPROVE_OPTION) {
                    File[] files = fileChooser.getSelectedFiles();
                    InputStream inputStream;
                    byte[] bytes;
                    //创建网格布局，放入leftPanel中
                    gridLayout = new GridLayout((files.length / 3) + 1, 3, 5, 5);
                    leftPanel.setLayout(gridLayout);
                    //创建imgLabel数组
                    imgLabels = new JLabel[files.length];
                    for (int i = 0; i < files.length; i++) {
                        //每次循环获取一个路径，赋给files
                        files = fileChooser.getSelectedFiles();
                        //对每个子文件创建字节输出流数组,构建Icon，并设置给JLabel
                        imgLabels[i] = new JLabel();
                        try {
                            inputStream = new FileInputStream(files[i]);
                            bytes = new byte[(int) files[i].length()];
                            inputStream.read(bytes);
                            //放图片
                            Icon icon = new ImageIcon(bytes);
                            imgLabels[i].setIcon(icon);
                            leftPanel.add(imgLabels[i]);
                        } catch (IOException e1) {
                            JOptionPane.showMessageDialog(null, "io异常");
                        }
                    }
                }
            }
        }

        }

        }

