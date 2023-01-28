package com.blockwit.learn.ruslan;
import java.util.Arrays;

public class App48 {


    public static void main (String args[]) {



        int[] numbers = {12,7,89,-4,8,9};


        for (int i : numbers) {
            System.out.println(i);



        }

        Arrays.sort(numbers);

        for (int values : numbers) {
            System.out.print(values + ", ");

        }




    }

}
