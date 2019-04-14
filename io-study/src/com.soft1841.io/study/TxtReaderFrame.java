package com.soft1841.io.study;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
/**
 * txt文件阅读器
 * Created by 田震 on 2019/4/1 16:01
 */
public class TxtReaderFrame extends JFrame implements ActionListener {
    private JTextField jTextField;
    private JButton jButton;
    private JPanel topjPanel;
    private JTextArea contentArea;
  public  TxtReaderFrame(){
    init();
    setTitle("文本阅读窗体");
    setSize(new Dimension(640,480));
    setLocationRelativeTo(null);
    setVisible(true);
    setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }
    public void init(){
      jTextField=new JTextField(20);
      jTextField.setPreferredSize(new Dimension(150,30));
      jButton=new JButton("确认");
      jButton.setPreferredSize(new Dimension(70,30));
      topjPanel=new JPanel();
      topjPanel.add(jTextField);
      topjPanel.add(jButton);
      //给按钮注册监听
      jButton.addActionListener(this);
      add(topjPanel,BorderLayout.NORTH);
      //中间的多行文本域
      contentArea=new JTextArea();
      add(contentArea,BorderLayout.CENTER);
    }
    public static void main (String[] args) {
        new TxtReaderFrame();
    }
    @Override
    public void actionPerformed (ActionEvent e) {
       String filePath=jTextField.getText().trim();
        File file =new File(filePath);
       //使用三种方法将file中的内容读入
        try {
            InputStream inputStream=new FileInputStream(file);
            byte[] bytes= new byte[(int) file.length()];
            inputStream.read(bytes);
            String resultStr= new String(bytes);
            contentArea.append(resultStr);
            contentArea.append("\r\n");
        } catch (IOException e1) {
            System.out.println("IO异常");
        }

    }
    }

