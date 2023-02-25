package com.blockwit.learn.ruslan.demo;

public class List {
    static int[] list;
    static int index = 0;
    long startTime = System.currentTimeMillis();

    public  void  addItem(int Number) {
         list = new int[100000];
         for (int i=0; i < list.length; i++) {
             list[index] = Number;
             index++;
     }
    }

    public long calculateTime() {
        long finishTime = System.currentTimeMillis();
        long result = finishTime - startTime;
        System.out.println(result);
        return result;
    }

}
