package com.soft1841.string;
import java.io.*;
/**
 * Created by 田震 on 2019/4/4 00:29
**/
public class BufferedTest {
    public static void main(String[] args) {
        String[] content ={"你走的你的经天路，", "我走的我的油坊桥。", "从此我们，", "不再相见！"};
        File file = new File("D:\\word.txt");
        try {
            FileWriter fw = new FileWriter(file);
            BufferedWriter bufferedWriter = new BufferedWriter(fw);
            for (int i = 0;i<content.length;i++){
                bufferedWriter.write(content[i]);
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
            fw.close();
        }catch (IOException e){
            e.printStackTrace();
        }
        try {
            FileReader fileReader= new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String s = null;
            int k =0;
            while ((s = bufferedReader.readLine()) !=null){
                k++;
                System.out.println("第"+k+"行:"+s);
            }
            bufferedReader.close();
            fileReader.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
