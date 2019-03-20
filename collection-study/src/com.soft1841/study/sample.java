package com.soft1841.study;
import java.util.*;
public class sample {
    public static void main(String[] args) {
//制作列表 1，加入元素
        List<Racing> list1 = new ArrayList<>();
        list1.add(new Racing(1,"雷霆风暴",57280));
        list1.add(new Racing(2,"魔王",61090));
        list1.add(new Racing(3,"极光",59370));
        list1.add(new Racing(7,"qq 飞车",1000000));
//输出 list1
        System.out.println("*****list1 输出*****");
        list1.forEach(racing -> System.out.println(racing));
//制作列表 1，加入元素
        List<Racing> list2 = new ArrayList<>();
        list2.add(new Racing(4,"大 Q 吧",9999));
        list2.add(new Racing(5,"劳德曼",11880));
        list2.add(new Racing(6,"寒凌",12320));
        System.out.println("*****list2 输出*****");
        list2.forEach(racing -> System.out.println(racing));
//输出排序后的 list1
        sort1(list1);
        System.out.println("*****list1 排序后*****");
        list1.forEach(racing -> System.out.println(racing));
//输出排序后的 list2
        sort2(list2);
        System.out.println("*****list2 排序后*****");
        list2.forEach(racing -> System.out.println(racing));
        Map<String,List<Racing>> map = new HashMap<>();
        map.put("A 车",list1);
        map.put("B 车",list2);
        Iterator<Map.Entry<String,List<Racing>>> iterator = map.entrySet().iterator();
        System.out.println("***加入 map 后输出***");
        while (iterator.hasNext()){
            Map.Entry<String,List<Racing>> entry = iterator.next();
            System.out.println(entry.getKey());
            List<Racing> list = entry.getValue();
            for (Racing racing : list){
                System.out.println("id:" + racing.getId() + " 名称：" +
                        racing.getName() + " 价格：" + racing.getPrice());
                System.out.println();
            }
        }
    }
    //通过 treeSet 排序
    public static void sort1(List<Racing> list1) {
//将 list 中所有的元素添加到 TreeSet 集合中,对其排序,保留重复
        TreeSet<Racing> set1 = new TreeSet<>(new Comparator<Racing>() {
            @Override
            public int compare(Racing o1, Racing o2) {
                int num = o1.compareTo(o2);
                return num == 0 ? 1: num;
            }
        });
//将 list 集合中所有元素添加到 TreeSet 集合中对其排序
        set1.addAll(list1);
//清空 list 集合
        list1.clear();
//将 TreeSet 集合中排好序的元素添加到 list 集合中
        list1.addAll(set1);
    }
    public static void sort2(List<Racing> list2) {
//将 list 中所有的元素添加到 TreeSet 集合中,对其排序,保留重复
        TreeSet<Racing> set2 = new TreeSet<>(new Comparator<Racing>() {
            @Override
            public int compare(Racing o1, Racing o2) {
                int num = o1.compareTo(o2);
                return num == 0 ? 1: num;
            }
        });
//将 list 集合中所有元素添加到 TreeSet 集合中对其排序
        set2.addAll(list2);
//清空 list 集合
        list2.clear();
//将 TreeSet 集合中排好序的元素添加到 list 集合中
        list2.addAll(set2);
    }
}
