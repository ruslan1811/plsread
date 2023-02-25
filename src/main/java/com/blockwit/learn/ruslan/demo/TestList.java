package com.blockwit.learn.ruslan.demo;

import java.util.Date;

public class TestList {
 public static void main (String args[]) {
     List list = new List();
     fixTime();
     testCells();
     list.calculateTime();
     }

     public static long fixTime() {
       long fixStart = System.currentTimeMillis();
         return fixStart;
     }

    public static void testCells() {
        List varList = new List();
        varList.addItem(4000000);
         for (int i=0; i< varList.list.length; i++) {
             System.out.println(varList.list[i]);
         }
     }
}
