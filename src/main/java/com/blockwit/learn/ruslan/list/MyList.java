package com.blockwit.learn.ruslan.list;


public class MyList {
      int[] list = new int[10];

       int  addNumber (int numberеtoWrite) {

               for(int  i =0 ; i <= list.length-1; i++) {
                   if (list[i] == 0) {
                       list[i] = numberеtoWrite;
                       break;
                   }
               }
               return numberеtoWrite;

       }

       int getNumber (int indexToRead ) {
            if (indexToRead >= 0) {

            }
           return list[indexToRead];
       }


}

