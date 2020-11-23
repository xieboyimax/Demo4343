package com.zking;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;

public class test1 {
    //使用java.lang.Math,生成100个0到99之间的随机整数，找出最大和最小，并统计大于50的整数个数？
    public static void main(String[] args) {
        int max = 0;//用来存放最大值
        int min = 0;//用来存放最小值
        String sum = "";//用来存放所有整数
        int num = 0;//用来记录大于50的整数个数
        for (int i = 1; i <= 100; i++) {
            Random random = new Random();
            int r = random.nextInt(99);//ps:表示产生的随机数为0-99的整数,不包括99。
            if (r >= max) {//先找出最大的整数
                max = r;
            } else if (r < min) {//再找最小的整数
                min = r;
            }
            String s = "" + r;//拿到所有的整数
            if (r > 50) {
                sum = sum + s + ",";
                ++num;
            }
        }
        System.out.println("最大数max=" + max + ",最小数=" + min);
        System.out.println("大于50的整数个数有" + num + "个");
        System.out.println(sum);
    }
}
