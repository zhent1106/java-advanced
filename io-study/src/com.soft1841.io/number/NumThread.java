package com.soft1841.io.number;
import javax.swing.*;
import java.util.Random;
/**
 * Created by 田震 on 2019/4/8 16:36
 */
public class NumThread extends Thread{
    private JLabel numberLabel;
    public void  setNumberLabel(JLabel numberLabel){
        this.numberLabel=numberLabel;
    }

    @Override
    public void run(){
        Random random=new Random();
        while (true){
            int num=random.nextInt(100);
            numberLabel.setText(String.valueOf(num));
            try {
                Thread.sleep(500);

            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }

    }
}

