package com.blockwit.learn.ruslan.newlist;

import java.util.List;
import java.util.Collection;


public class Students {

        String[] nameofStudents = new String[10];
        String[] secondList = new String[(nameofStudents.length + nameofStudents.length)];

        String  addName  (String nameOfStudent) {
            for (int i=0; i < nameofStudents.length ; i++) {
                if (nameofStudents[i] == null) {
                    nameofStudents[i] = nameOfStudent;
                    break;
                }
            }

            if (nameofStudents[nameofStudents.length -1] != null) {
                System.arraycopy(nameofStudents, 0, secondList, 0, nameofStudents.length);

            }

            if (nameofStudents[nameofStudents.length -1] != null) {
                for (int i = nameofStudents.length, j = nameofStudents.length; i < secondList.length; i++, j++) {
                    if (secondList[j] == null & nameOfStudent != nameofStudents[nameofStudents.length-1]) {
                        secondList[j] = nameOfStudent;
                        break;
                    }
                }

            }



                return nameOfStudent;
        }



    String getNumber (int indexToRead ) {
        if (indexToRead >= 0 & indexToRead < nameofStudents.length) {
            return nameofStudents[indexToRead];

        }
        if (indexToRead >= nameofStudents.length) {
            return secondList[indexToRead];

        }

        return secondList[indexToRead];

    }
















}
