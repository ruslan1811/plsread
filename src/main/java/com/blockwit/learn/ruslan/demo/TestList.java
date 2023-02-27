package com.blockwit.learn.ruslan.demo;

import java.util.Date;

public class TestList {
    public static void main(String args[]) {
        List list = new List();
        testPerformance();
    }

    public  static long testPerformance() {
        long startTime = System.currentTimeMillis();
        List varList = new List();
        varList.list = new int[100000];
        for (int i = 0; i < varList.list.length; i++) {
            System.out.println(varList.list[i]);
        }
        long finishTime = System.currentTimeMillis();
        long result = finishTime - startTime;
       System.out.println(result);
       return result;
    }


}
