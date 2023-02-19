package com.blockwit.learn.ruslan.listindex;


public class StudentsList {

    String[] nameofStudents = new String[100];
    String[] secondList = new String[(nameofStudents.length) * 2 ];

    int indexOfStudents =0;

    int  addName  (String nameOfStudent) {
        for (int i=0; i < nameofStudents.length ; i++) {
            if (nameofStudents[i] == null) {
                nameofStudents[i] = nameOfStudent;
                indexOfStudents = i;
                break;
            }
        }

    if (indexOfStudents == nameofStudents.length-1 || indexOfStudents >= nameofStudents.length) {
        System.arraycopy(nameofStudents, 0, secondList, 0, nameofStudents.length);
        for (int i = nameofStudents.length; i <= secondList.length-1; i++) {
            if (secondList[i] == null & nameOfStudent != nameofStudents[nameofStudents.length-1]) {
                secondList[i] = nameOfStudent;
                indexOfStudents = i;
                break;
            }
        }
    }

        return  indexOfStudents;
    }


    String getStudent (int indexOfRequest) {

        String studentsName = (String) null;

        if (indexOfRequest >=0 & indexOfRequest < nameofStudents.length-1) {
            studentsName = nameofStudents[indexOfRequest] ;
        }
        else {
            studentsName = secondList[indexOfRequest];
        }
        return studentsName;

    }

}
