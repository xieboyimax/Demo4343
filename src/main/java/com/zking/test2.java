package com.zking;

public class test2 {
    public static void main(String[] args) {
        String s1 = "Programming";
        String s2 = new String("Programming");
        String s3 = "Program";
        String s4 = "ming";
        String s5 = "Program" + "ming";
        String s6 = s3 + s4;
        String s7 = new String(String.valueOf(11));
        String s8 = s7.intern();
        String s9 = s2.intern();
        System.out.println(s1 == s2);//false
        System.out.println(s1 == s5);//true
        System.out.println(s1 == s6);//false
        System.out.println(s1 == s6.intern());//true
        System.out.println(s2 == s2.intern());//false
        System.out.println(s7 == s8);
        System.out.println(s9 == s2);
        System.out.println(s2 == s2.intern());
    }
}
