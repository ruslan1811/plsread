package com.blockwit.learn.ruslan;
import java.util.Arrays;

public class App48 {

    public static void main (String args[]) {

        int[] numbers = {12,7,89,-4,8,9};

        for (int i= 0; i < numbers.length -1; i++) {
            System.out.println(i);

        }

        int lastNumber = numbers[numbers.length -1];

        for (int j = numbers.length -1; j >=0; j--) {

            if (numbers[j] < lastNumber) lastNumber = numbers[j];

        }

        boolean swapped = true;
        int k = 0;
        int temporary;

        while (swapped) {
            swapped = false;
            k++;
            for( int i=0; i< numbers.length - k; i++) {
                if (numbers[i] > numbers[i+1]) {
                    temporary = numbers[i];
                    numbers[i] = numbers[i+1];
                    numbers[i+1] = temporary;
                    swapped = true;

                }

            }
        }

        for (int i =0; i < numbers.length; i++) {
            System.out.print(numbers[i]+ "; ");

        }

    }

}
