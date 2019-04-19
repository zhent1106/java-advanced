package com.soft1841.string;
import org.jb2011.lnf.beautyeye.BeautyEyeLNFHelper;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Scanner;
/**
 * Created by 田震 on 2019/4/2 8:45
 */
public class JFileChooserTest extends JFrame implements ActionListener {
    private JButton chooseButton;
    private JLabel pathLabel;
    private JFileChooser fileChooser;

    public JFileChooserTest () {
        init();
        setTitle("JFileChooser");
        setSize(1000, 800);
        setLocationRelativeTo(null);
        setResizable(false);
        setVisible(true);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }
    private void init () {
        chooseButton = new JButton("选择文件");
        pathLabel = new JLabel("暂无选择");
        add(chooseButton, BorderLayout.NORTH);
        chooseButton.addActionListener(this);
        Font font = new Font("微软雅黑", Font.PLAIN, 26);
        pathLabel.setFont(font);
        add(pathLabel, BorderLayout.CENTER);
    }
    public static void main (String[] args) {
        try {
            BeautyEyeLNFHelper.frameBorderStyle = BeautyEyeLNFHelper.FrameBorderStyle.osLookAndFeelDecorated;
            org.jb2011.lnf.beautyeye.BeautyEyeLNFHelper.launchBeautyEyeLNF();
        } catch (Exception e) {
            e.printStackTrace();
        }
        new JFileChooserTest();
    }
    @Override
    public void actionPerformed (ActionEvent e) {
        //创建FileChooser对象
        fileChooser = new JFileChooser();
        //设置文件选择器的默认路径
        fileChooser.setCurrentDirectory(new File("D:/"));
        //打开对话框
        int result = fileChooser.showOpenDialog(null);
        //用户点击了“确认”按钮
        if (result == JFileChooser.APPROVE_OPTION) {
            //获取用户选择的文件
            File file = fileChooser.getSelectedFile();
            //将选择的文件的绝对路径显示==测试
            pathLabel.setText(file.getAbsolutePath());
            try {
                InputStream inputStream=new FileInputStream(file);
                Scanner scanner=new Scanner(inputStream);
                pathLabel.setText(scanner.nextLine());
            } catch (FileNotFoundException e1) {
                e1.printStackTrace();
            }

        }
    }
}
