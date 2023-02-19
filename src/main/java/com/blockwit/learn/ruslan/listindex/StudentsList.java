package com.blockwit.learn.ruslan.listindex;


public class StudentsList {

    String[] nameofStudents = new String[100];

    int indexOfStudents =0;

    int  addName  (String nameOfStudent) {
        for (int i=0; i < nameofStudents.length ; i++) {
            if (i == indexOfStudents) {
                nameofStudents[i] = nameOfStudent;
                indexOfStudents = i+1;
                break;
            }
        }
        return  indexOfStudents;
    }


    String getStudent (int indexOfRequest) {

        String studentsName = (String) null;

        if (indexOfRequest >=0 & indexOfRequest < nameofStudents.length-1) {
            studentsName = nameofStudents[indexOfRequest] ;
        }
        return studentsName;

    }

}
