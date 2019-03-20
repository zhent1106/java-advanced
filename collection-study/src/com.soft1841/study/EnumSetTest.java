package com.soft1841.study;
import java.util.Scanner;
/**
 * 枚举类型练习
 * Created by 田震 on 2019/3/21 6:30
 */
enum Week {
    // 定义一个枚举，用来记录一周的星期
    MONDAY("星期一"), TUESDAY("星期二"), WEDNESDAY("星期三"), THURSDAY("星期四"), FRIDAY("星期五"), SATURDAY("星期六"), SUNDAY("星期日");
    String week;
    // 定义一个变量，作为临时变量
    Week(String week) {
        // 定义枚举构造函数
        this.week = week;
    }
    public String getName() {
        // 获取枚举常量对应的值
        return week;
    }
    public static Week getWeek(String week) {
        // 定义一个静态方法，用来根据输入获取对应Week枚举值
        switch (week) {
            case "mon":
                return Week.MONDAY;
            case "tues":
                return Week.TUESDAY;
            case "wed":
                return Week.WEDNESDAY;
            case "thur":
                return Week.THURSDAY;
            case "fri":
                return Week.FRIDAY;
            case "sat":
                return Week.SATURDAY;
            case "sun":
                return Week.SUNDAY;
            default:
                return Week.MONDAY;
        }
    }
}
public class EnumSetTest {
    public static void main(String[] args) {
        System.out.println("**************中英文星期对照表**************");
        Week weekArray[] = Week.values();
        for (Week k : weekArray) {
            // 循环遍历枚举数组
            System.out.println(k + "·····" + k.getName());
        }
        System.out.print("\n输入要查询的英文星期单词的小写缩写：");
        Scanner sc = new Scanner(System.in);
        Week week = Week.getWeek(sc.next());
        // 根据输入获取枚举值
        switch (week) {
            case MONDAY:
                System.out.println("MONDAY————" + week.getName());
                // 获取枚举值的中文描述
                break;
            case TUESDAY:
                System.out.println("TUESDAY——" + week.getName());
                break;
            case WEDNESDAY:
                System.out.println("WEDNESDAY——" + week.getName());
                break;
            case THURSDAY:
                System.out.println("THURSDAY——" + week.getName());
                break;
            case FRIDAY:
                System.out.println("FRIDAY——" + week.getName());
                break;
            case SATURDAY:
                System.out.println("SATURDAY——" + week.getName());
                break;
            case SUNDAY:
                System.out.println("SUNDAY——" + week.getName());
        }
       sc.close();
    }
}
