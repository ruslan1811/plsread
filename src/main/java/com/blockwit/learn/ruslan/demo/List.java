package com.blockwit.learn.ruslan.demo;

public class List {
    static int[] list = new int[100000];
    static int index = 0;
    long startTime = System.currentTimeMillis();
    public  void  addItem(int Number) {
        for (int i=0; i < list.length; i++) {
            list[index] = Number;
            index++;
        }
    }
    long finishTime = System.currentTimeMillis();

    public long  calculateTime() {

        long elapsed = finishTime - startTime;
        return elapsed;

        }
}
