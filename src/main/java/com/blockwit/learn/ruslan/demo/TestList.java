package com.blockwit.learn.ruslan.demo;

import java.util.Date;

public class TestList {
    public static void main(String args[]) {
        List list = new List();
        testPerformance();
    }
    public  static long testPerformance() {
        long startTime = System.currentTimeMillis();
        List copyList = new List();
        copyList.list = new int[100000];
        for (int i = 0; i < copyList.list.length; i++) {
            System.out.println(copyList.list[i]);
        }
        long finishTime = System.currentTimeMillis();
        long result = finishTime - startTime;
       System.out.println(result);
       return result;
    }

}
