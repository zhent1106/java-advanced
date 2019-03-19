package com.soft1841.list;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by 田震 on 2019/3/20 7:12
 */
public class VegetableList {
    public static void main (String[] args) {
        List<Vegetble> list=new ArrayList <>();
        list.add(new Vegetble("黄瓜",15));
        list.add(new Vegetble("土豆",20));
        list.add(new Vegetble("茄子",17));
        list.add(new Vegetble("玉米",13));
        list.add(new Vegetble("南瓜",11));
        Collections.sort(list);
        for (Vegetble vegetble:list
             ) {
            System.out.println("名称："+vegetble.getName()+"     "+"价格："+vegetble.getPrice());

        }

    }

}
