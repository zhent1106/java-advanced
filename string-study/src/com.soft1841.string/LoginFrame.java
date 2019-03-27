package com.soft1841.string;
import org.jb2011.lnf.beautyeye.BeautyEyeLNFHelper;
import org.jb2011.lnf.beautyeye.ch3_button.BEButtonUI;
import javax.swing.*;
import java.awt.*;

/**
 * Created by 田震 on 2019/3/28 6:45
 */
public class LoginFrame extends JFrame {
    private JLabel accountLabel,passwordLabel,roleLabel;
    private JTextField accountField;
    private JPasswordField passwordField;
    private JButton confirmButton,cancelButton;
    private JComboBox<String>roleComboBox;
    private JLabel bgLabel;
    public LoginFrame(){
        init();
        setTitle("登陆窗体");
        setSize(640,480);
        setLocationRelativeTo(null);
        //窗口大小不可变
        setResizable(false);
        setVisible(true);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }

    private void init () {
        Font font = new Font("微软雅黑",Font.PLAIN,18);
        accountLabel = new JLabel("账号");
        accountLabel.setFont(font);
        accountField = new JTextField();
        accountField.setFont(font);
        passwordLabel = new JLabel("密码");
        passwordLabel.setFont(font);
        passwordField = new JPasswordField();
        passwordField.setFont(font);
        roleLabel=new JLabel("角色");
        roleLabel.setFont(font);
        String[] roles={"管理员","前台","后台"};
        roleComboBox= new JComboBox <>(roles);
        roleComboBox.setFont(font);
        confirmButton = new JButton("登陆");
        confirmButton.setFont(font);
        cancelButton=new JButton("取消");
        cancelButton.setFont(font);
        //窗口布局设为空布局，需要给每个组件定位
        setLayout(null);
        //setBounds 方法的四个参数分别为组件x、y坐标，组件宽高
        accountLabel.setBounds(120,100,100,35);
        accountField.setBounds(250,100,300,35);
        passwordLabel.setBounds(120,160,100,35);
        passwordField.setBounds(250,160,300,35);
        roleLabel.setBounds(120,230,100,35);
        roleComboBox.setBounds(250,230,260,35);
        confirmButton.setBounds(100,300,180,50);
        confirmButton.setUI(new BEButtonUI().setNormalColor(BEButtonUI.NormalColor.blue));
        cancelButton.setBounds(380,300,180,50);
        cancelButton.setUI(new BEButtonUI().setNormalColor(BEButtonUI.NormalColor.green));
        add(accountLabel);
        add(accountField);
        add(passwordLabel);
        add(passwordField);
        add(roleLabel);
        add(roleComboBox);
        add(confirmButton);
        add(cancelButton);
        bgLabel = new JLabel();
        Icon bgicon = new ImageIcon(LoginFrame.class.getResource("/image/bei.jpg"));
        bgLabel.setIcon(bgicon);
        bgLabel.setBounds(0,0,640,480);
        add(bgLabel);
    }
    public static void main(String[] args) {
        //用beauty-eye样式
        try {
            BeautyEyeLNFHelper.frameBorderStyle = BeautyEyeLNFHelper.FrameBorderStyle.osLookAndFeelDecorated;
            org.jb2011.lnf.beautyeye.BeautyEyeLNFHelper.launchBeautyEyeLNF();
        }catch (Exception e){
            e.printStackTrace();
        }
        new LoginFrame();

    }


}
