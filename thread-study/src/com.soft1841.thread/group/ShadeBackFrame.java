package com.soft1841.thread.group;
        import javax.swing.*;
        import java.awt.*;
        import java.awt.event.ActionEvent;
        import java.awt.event.ActionListener;
        import java.util.Random;
        import java.util.Timer;
        import java.util.TimerTask;
/**
 *漂亮的界面
 */
public class ShadeBackFrame extends JFrame implements ActionListener {
    private int width;
    private int height;
    private JLabel accountLabel,passwordLabel;
    private JTextField accountField;
    private JPasswordField passwordField;
    private JButton loginButton;
    private JLabel backgroundLabel;
    private JLabel avatarLabel;
    private JCheckBox rpJCheckBox,alJCheckBox;
    public ShadeBackFrame() {
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        width = screenSize.width;
        height = screenSize.height;
        init();
        setTitle("吃葡萄不吐葡萄皮之田震");
        setSize(width, height);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    class ShadePanel extends JPanel  {
        public  ShadePanel(){
            java.util.Timer timer = new Timer();
            timer.schedule(timerTask,0,1000);
        }
        TimerTask timerTask = new TimerTask() {
            @Override
            public void run() {
                repaint();
            }
        };
        @Override
        protected void paintComponent(Graphics g1) {
            Graphics2D g = (Graphics2D) g1;
            super.paintComponent(g);
            int width = getWidth();
            int height = getHeight();
            Color[] color = {Color.CYAN,Color.MAGENTA,Color.BLUE,Color.PINK,Color.GREEN,Color.GRAY};
            Random r = new Random();
            int i = r.nextInt(6);
            int j = r.nextInt(6);
            //创建填充模式对象
            GradientPaint paint = new GradientPaint(i, j, color[i], 0, height,color[j]);
            g.setPaint(paint);
            g.fillRect(i, j, width, height);
        }
    }
    /**
     * 登陆界面
     */
    class LoginPane extends JPanel{

    }
    private void init() {
        setLayout(null);
        ShadePanel shadePanel = new ShadePanel();
        shadePanel.setLayout(null);
        shadePanel.setBounds(0, 0, width, height);
        LoginPane loginPanel = new LoginPane();
        loginPanel.setBackground(new Color(234,241,248));
        loginPanel.setLayout(null);
        loginPanel.setBounds(550, 200, 640, 470);
        shadePanel.add(loginPanel);
        add(shadePanel);
        Font font = new Font("微软雅黑", Font.PLAIN, 18);
        //设置字体
        accountLabel = new JLabel("注册账号");
        accountLabel.setFont(font);
        accountLabel.setForeground(new Color(39, 134, 228));
        accountField = new JTextField();
        accountField.setFont(font);
        passwordLabel = new JLabel("找回密码");
        passwordLabel.setFont(font);
        passwordLabel.setForeground(new Color(39, 134, 228));
        passwordField = new JPasswordField();
        passwordField.setFont(font);
        rpJCheckBox = new JCheckBox("记住密码");
        rpJCheckBox.setFont(font);
        rpJCheckBox.setForeground(new Color(154, 158, 163));
        alJCheckBox = new JCheckBox("自动登录");
        alJCheckBox.setFont(font);
        alJCheckBox.setForeground(new Color(154, 158, 163));
        loginButton = new JButton("登录");
        loginButton.addActionListener(this);
        loginButton.setFont(font);
        loginButton.setForeground(new Color(255, 255, 255));
        loginButton.setBackground(new Color(0, 163, 255));
        //设置布局
        setLayout(null);
        accountField.setBounds(190, 257, 289, 42);
        accountLabel.setBounds(493, 257, 76, 42);
        passwordField.setBounds(190, 298, 289, 42);
        passwordLabel.setBounds(493, 298, 76, 42);
        rpJCheckBox.setBounds(190, 345, 110, 30);
        alJCheckBox.setBounds(383, 345, 110, 30);
        loginButton.setBounds(190, 380, 289, 42);
        loginPanel.add(accountField);
        loginPanel.add(accountLabel);
        loginPanel.add(passwordField);
        loginPanel.add(passwordLabel);
        loginPanel.add(rpJCheckBox);
        loginPanel.add(alJCheckBox);
        loginPanel.add(loginButton);
        backgroundLabel = new JLabel();
        loginPanel.add(backgroundLabel);
        backgroundLabel = new JLabel();
        Icon backIcon = new ImageIcon(LoginFrame.class.getResource("/img/1.png"));
        backgroundLabel.setIcon(backIcon);
        backgroundLabel.setBounds(0,0,644,225);
        loginPanel.add(backgroundLabel);
        avatarLabel = new JLabel();
        Icon avatarIcon = new ImageIcon(LoginFrame.class.getResource("/img/3.png"));
        avatarLabel.setIcon(avatarIcon);
        avatarLabel.setBounds(60,245,122,122);
        loginPanel.add(avatarLabel);
        loginPanel.add(alJCheckBox);
    }
    public static void main (String[] args) {
        new ShadeBackFrame();
    }
    @Override
    public void actionPerformed (ActionEvent e) {
        JOptionPane.showMessageDialog(null, "登录成功");
    }
}