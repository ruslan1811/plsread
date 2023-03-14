package com.blockwit.learn.ruslan.chainedlist;

import java.util.*;
public class ChainedList {
    public static void main (String args[]) {

        LinkedList<String> cities = new LinkedList<>();

        String city1 = new String("Ярославль");
        String city2 = new String("Москва");
        String city3 = new String("Казань");
        String city4 = new String("Екатеринбург");

        cities.add(city1);
        cities.add(city2);
        cities.add(city3);
        cities.add(city4);


        cities.add("Тула");
        cities.add("Челябинск");


        System.out.println(cities);

    }

 }