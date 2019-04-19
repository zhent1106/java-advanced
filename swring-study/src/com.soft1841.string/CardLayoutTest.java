package com.soft1841.string;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import org.jb2011.lnf.beautyeye.BeautyEyeLNFHelper;
/**
 * Created by 田震 on 2019/4/12 00:39
 */
public class CardLayoutTest extends JFrame implements ActionListener {
    private JPanel cardPanel;
    private JButton preButton, nextButton;
    private JPanel buttonPanel;
    private CardLayout cardLayout;

    public CardLayoutTest () {
        init();
        setTitle("CardLayout卡片布局");
        setSize(900, 600);
        setLocationRelativeTo(null);
        setResizable(false);
        setVisible(true);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }

    private void init () {
        cardLayout = new CardLayout();
        cardPanel = new JPanel();
        cardPanel.setLayout(cardLayout);
        for (int i = 0; i < 3; i++) {
            cardPanel.add(String.valueOf(i+1),getPanel());
        }
        add(cardPanel);
        buttonPanel=new JPanel();
        buttonPanel.setBackground(new Color(120,165,241));
        preButton=new JButton("上一张");
        nextButton=new JButton("下一张");
        buttonPanel.add(preButton);
        buttonPanel.add(nextButton);
        add(buttonPanel,BorderLayout.SOUTH);
        preButton.addActionListener(this);
        nextButton.addActionListener(this);
    }
     private JPanel getPanel(){
        JPanel newPanel =new JPanel();
    Random randpm=new Random();
    int r=randpm.nextInt(256);
    int g=randpm.nextInt(256);
    int b=randpm.nextInt(256);
    newPanel.setBackground(new Color(r,g,b));
    return newPanel;
    }
    public static void main (String[] args) {
        try {
            BeautyEyeLNFHelper.frameBorderStyle = BeautyEyeLNFHelper.frameBorderStyle.osLookAndFeelDecorated;
            org.jb2011.lnf.beautyeye.BeautyEyeLNFHelper.launchBeautyEyeLNF();
        } catch (Exception e) {
            e.printStackTrace();
        }
        new CardLayoutTest();
    }
    @Override
    public void actionPerformed (ActionEvent e) {
        if (e.getSource()==preButton){
            cardLayout.previous(cardPanel);
        }else {
            cardLayout.next(cardPanel);
        }

    }
}
