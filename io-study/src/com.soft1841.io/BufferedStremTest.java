package com.soft1841.io;
import java.io.*;
/**
 * Created by 田震 on 2019/4/3 00:29
 */
public class BufferedStremTest {
    public static void main (String[] args) {
        String content[] = { "你走的你的经天路，", "我走的我的油坊桥。", "从此我们，", "不再相见！" };
        File file = new File("D://word.txt");
        FileOutputStream fos = null;
        BufferedOutputStream bos = null;
        FileInputStream fis = null;
        BufferedInputStream bis = null;
        try {
            fos = new FileOutputStream(file); // 实例化FileOutputStream对象
            bos = new BufferedOutputStream(fos); // 实例化BufferedOutputStream对象
            byte[] bContent = new byte[1024]; // 创建可以容纳1024个字节数的缓冲区
            for (int k = 0; k < content.length; k++) {
                bContent = content[k].getBytes();
                bos.write(bContent);
            }
            System.out.println("写入成功！\n");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                bos.close();
                fos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        try {
            fis = new FileInputStream(file);
            bis = new BufferedInputStream(fis);
            byte[] bContent = new byte[1024];
            int len = bis.read(bContent);
            // 输出文件数据
            System.out.println("文件中的信息是：" + new String(bContent, 0, len));
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                bis.close();
                fis.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
