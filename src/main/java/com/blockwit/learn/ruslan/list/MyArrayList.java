package com.blockwit.learn.ruslan.list;

import java.util.List;
import java.util.Collection;

public class MyArrayList {

    public static void main(String args[]) {

        MyList list = new MyList();

        list.list[0] = 1;

        list.addNumber(5);
        list.addNumber(4);
        list.addNumber(3);
        list.addNumber(5);

        System.out.println( "---");

        System.out.println( list.list[0]);
        System.out.println( list.list[1]);
        System.out.println( list.list[2]);
        System.out.println( list.list[3]);
        System.out.println( list.list[4]);
        System.out.println( list.list[5]);

        System.out.println( "Вывод ---");

        System.out.println( list.getNumber(0));
        System.out.println( list.getNumber(1));
        System.out.println( list.getNumber(2));
        System.out.println( list.getNumber(3));
        System.out.println( list.getNumber(4));
        System.out.println( list.getNumber(5));
        System.out.println( list.getNumber(6));
        System.out.println( list.getNumber(7));
        System.out.println( list.getNumber(8));
        System.out.println( list.getNumber(9));

    }

}



