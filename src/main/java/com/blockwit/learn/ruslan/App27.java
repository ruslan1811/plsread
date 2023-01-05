package com.blockwit.learn.ruslan;
import java.util.Arrays;

public class App27 {

	public static void main(String[] args) {

		int[] numbers = {12,7,89,-4,8,9};
		for (int i=0; i < numbers.length; i++) {
			System.out.println(numbers[i]);
			}
		Arrays.sort(numbers);
		for (int j : numbers) {
			System.out.println(j + ",");
			}

		

	}		
}	
