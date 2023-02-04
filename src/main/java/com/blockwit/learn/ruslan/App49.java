package com.blockwit.learn.ruslan;

public class App49 {

    public static void main (String args[]) {


        int[] firstArray = {7,4,2,8,6,7};
        int[] secondArray = {6,2,9};

        for (int i : firstArray) {
            System.out.println(i);
        }
        for (int i : secondArray) {
            System.out.println(i);
        }

        int[] resultArray = new int[firstArray.length + secondArray.length];

//       for (int i = 0; i < secondArray.length ; i++){
//            resultArray[i * 2] = firstArray[i];
//            resultArray[i * 2 + 1] = secondArray[i];
//        System.out.println("Вывод" + resultArray[i]);
//
//       }


        int maxLen = Math.max(firstArray.length, secondArray.length), j =0;
        System.out.println(maxLen);

        for (int i = 0; i < maxLen; i++) {
            if (i < firstArray.length) resultArray[j++] = firstArray[i];
            if (i < secondArray.length) resultArray[j++] = secondArray[i];
                 System.out.println("Вывод - " + resultArray[i]);

        }


        int lastLen = resultArray.length - firstArray.length;

//        System.out.println(lastLen);
//        System.out.println(maxLen);


        int k = lastLen;
        for (int i = maxLen; i < resultArray.length; i++) {

//            if (i > maxLen) resultArray[k++] = firstArray[i++];
                System.out.println("Вывод - " + resultArray[i]);

        }


//        for ( j = 6;  j < firstArray.length; j++ ) {
//
//        if ( resultArray[j] == ( j  % 2)) {
//             resultArray[j++] = firstArray[j++];
//            }
//
//
//            System.out.println("txt" + resultArray[j]);
//
//        }
//        for (int k =0;  k < secondArray.length; k++ ) {
//
//            if ( k % 2 == 0) {
//                resultArray[k + 1] = secondArray[k];
//            }
//
//            System.out.println("txt" + resultArray[k]);
//
//        }

//        for (int i =0; i < 7; i++) {
//
//            System.out.println("Вывод" + resultArray[i]);
//
//        }
//







    }




}
