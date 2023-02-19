package com.blockwit.learn.ruslan.newlist;

import java.util.List;
import java.util.Collection;

import com.blockwit.learn.ruslan.list.MyList;

public class MyArrayList {
    public static void main(String args[]) {

        Students list = new Students();
        Students secondList = new Students();


        list.addName("Георгий");
        list.addName("Василий");
        list.addName("Макар");
        list.addName("Савелий");
        list.addName("Робинзон");
        list.addName("Виолетта");
        list.addName("Аксинья");
        list.addName("Ерофей");
        list.addName("Александра");
        list.addName("Изольда");
        list.addName("Мария");
        list.addName("Дарья");
        list.addName("Джейн");
        list.addName("Савелий");
        list.addName("Урсула");
        list.addName("Елизавета");
        list.addName("Прасковья");



        for (int i=0; i <= list.nameofStudents.length -1; i++) {
            System.out.println(list.nameofStudents[i] );

        }
        for (int i=0; i <= list.secondList.length -1; i++) {
            System.out.println(" -" + list.secondList[i] );

        }



        System.out.println( list.getNumber(9));




    }

}
