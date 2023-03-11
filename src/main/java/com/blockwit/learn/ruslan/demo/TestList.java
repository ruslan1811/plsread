package com.blockwit.learn.ruslan.demo;

import java.util.Date;

public class TestList {
    public static void main(String args[]) {
        List list = new List();
        testAddSingle();
        testAddMultiple();
        performanceTest();
        testSize();
        testInsert();
    }


    public static void testAddSingle() {
        List list = new List();
        String testElement = "simpleElement";
        list.add(testElement);
        if (list.get(0).equals(testElement)) {
            System.out.println("Test successfully passed");
        } else {
            System.err.println("Test failed");
        }
    }

    public static void testAddMultiple() {
        List list = new List();
        for (int i = 0; i < 100; i++) {
            list.add(i + "");
        }

        for (int i = 0; i < 100; i++) {
            if (!list.get(i).equals(i + "")) {
                System.err.println("Test failed");
                return;
            }
        }
        System.out.println("Test successfully passed");
    }



    public static long performanceTest() {
        List list = new List();
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            list.add("Text");
        }
        long endTime = System.currentTimeMillis();
        long result = endTime - startTime;
        return result;
    }


    public static void testSize() {
        List list = new List();
        int index = 0;

        for (int i = 0; i < 100; i++) {
            list.add(i + "");
            index++;
        }
        if (list.getSize() == index) {
            System.out.println("Test successfully passed");

        } else {
            System.err.println("Test failed");
        }

    }

    public static void testInsert() {
        List list = new List();
        for (int i = 0; i < 5; i++) {
            list.add("Text");
        }
        String text = "texxt";
        list.insert(2, text);
       if(list.get(2).equals(text)) {
            System.out.println("Test successfully passed");
        } else {
            System.err.println("Test failed");
        }
    }


}
