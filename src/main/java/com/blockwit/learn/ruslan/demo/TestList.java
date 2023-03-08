package com.blockwit.learn.ruslan.demo;

import java.util.Date;

public class TestList {
    public static void main(String args[]) {
        List list = new List();
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            list.add("Text");
        }
        long endTime = System.currentTimeMillis();
        long result = endTime - startTime;
        System.out.println(result);
        System.out.println(list.getSize());

        list.insert(40, "txt");



    }



}
