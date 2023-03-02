package com.blockwit.learn.ruslan.demo;
import java.util.Arrays;

public class List {
    public static String[] list;
    private int index = 0;


 public void add (String item) {
     if (index == list.length) {
         list = Arrays.copyOf(list, list.length + 1);

     }
     list[index] = item;
     index++;
 }

 public String get (int idOfItem) {
     return list[idOfItem];
 }


}