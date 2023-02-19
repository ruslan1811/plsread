package com.blockwit.learn.ruslan.listindex;


public class StudentsList {

    String[] nameofStudents = new String[100];

    int indexOfStudents =0;

    int  addName  (String nameOfStudent) {
       if (indexOfStudents < nameofStudents.length ) nameofStudents[indexOfStudents] = nameOfStudent;
        indexOfStudents++;
        return  indexOfStudents;
    }


    String getStudent (int indexOfRequest) {
        return nameofStudents[indexOfRequest];
    }
}
