package com.blockwit.learn.ruslan;

public class App49 {
    public static void main (String args[]) {

        int[] firstArray = {7,4,2,8,6,7};
        int[] secondArray = {6,2,9};

        for (int i =0; i < firstArray.length; i++) {
            System.out.println(firstArray[i]);
        }
        for (int i =0;  i < secondArray.length; i++) {
            System.out.println(secondArray[i]);
        }

        int[] resultArray = new int[firstArray.length + secondArray.length];

        int maxLen = Math.max(firstArray.length, secondArray.length), j =0;
        System.out.println(maxLen);

        for (int i = 0; i < maxLen; i++) {
            if (i < firstArray.length) resultArray[j++] = firstArray[i];
            if (i < secondArray.length) resultArray[j++] = secondArray[i];
                 System.out.println("Вывод - " + resultArray[i]);

        }

        int lastLen = resultArray.length - firstArray.length;

        int k = lastLen;
        for (int i = maxLen; i < resultArray.length; i++) {
                System.out.println("Вывод - " + resultArray[i]);

        }

        for (int i =0; i < firstArray.length; i++) {
            System.out.println(resultArray[i]);
        }
        
    }

}
