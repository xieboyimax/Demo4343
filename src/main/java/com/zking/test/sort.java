package com.zking.test;

import java.util.Arrays;

public class sort {



   static int[] intArray = new int[]{1, 56, -5, 33};
   static String[] strArray = new String[]{"Z", "a", "D"};

   static int temp = 0;
   static int[] sortNum = {11,23,214,13,432,546,43,65};
    public static void main(String[] args){
        Arrays.sort(intArray);
        Arrays.sort(strArray);
        System.out.println(Arrays.toString(intArray));
        System.out.println(Arrays.toString(strArray));

          for (int i = 0; i < sortNum.length-1; i++) {
             for (int j = 0; j < sortNum.length-1-i; j++) {
                 if(sortNum[j+1]<sortNum[j]){
                  temp = sortNum[j];
                  sortNum[j]=sortNum[j+1];
                  sortNum[j+1]=temp;
                 }
             }
          }
          System.out.println(Arrays.toString(sortNum));
    }

}
