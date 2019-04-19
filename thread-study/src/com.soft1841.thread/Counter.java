package com.soft1841.thread;
import javax.swing.*;
import java.awt.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
/**
 * 定一个时间 与实际时间相差的时间
 * Created by 田震 on 2019/4/17 16:36
 */
public class Counter {
    private JFrame frame;
    private JLabel timelabel;
    public static void main(String[] args) throws Exception {
        new Counter().getTime("2019-04-18 19:00:00");
    }
    /* String -> Date */
    private Date String2Date(String dateStr) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        try {
            Date date = simpleDateFormat.parse(dateStr);
            return date;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
    /* 倒计时的主要代码块 */
    private void getTime(String dateStr) {
        Date end = String2Date(dateStr);
        long time = (end.getTime() - 1 - new Date().getTime()) / 1000; // 自定义倒计时时间
        long hour = 0;
        long minute = 0;
        long seconds = 0;
        while (time >= 0) {
            hour = time / 3600;
            minute = (time - hour * 3600) / 60;
            seconds = time - hour * 3600 - minute * 60;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("<html><br>距离软件1841团日主题活动开始时间：").append(dateStr).append("还有<br><br>")
                    .append(hour).append("时 ").append(minute).append("分 ").append(seconds).append("秒 ")
                    .append("</html>");
            timelabel.setText(stringBuilder.toString());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            time--;
        }
    }
    public Counter() {
        frame = new JFrame("倒计时窗口" );
        timelabel = new JLabel();
        init();
    }
    /* 组件的装配 */
    private void init() {
        JPanel jPanel = new JPanel();
        Font font=new Font("微软雅黑",Font.BOLD,20);
        timelabel.setFont(font);
        jPanel.add(timelabel);
        frame.add(jPanel);
        frame.setVisible(true);
        frame.setSize(900, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
