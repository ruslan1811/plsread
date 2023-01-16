package com.blockwit.learn.ruslan;

import java.util.Scanner;

public class App43 {
	public static void main(String args[]) {

		for (int i = 0; i < 3; i++) {

			int secretNumber = (int) (Math.random() * 10);
	
			int computerNumber = (int) (Math.random() * 10);
		
			Scanner scan = new Scanner(System.in);
		
			System.out.println("Введите число от 1 до 10");
			int userNumber = scan.nextInt();

			int firstResult = (int) (computerNumber - secretNumber);

			int secondResult = (int) (userNumber - secretNumber);
	
			

			// Calculate results
			
			
			int j = 0;
			int k = 0;

			
		
			
			if (firstResult < secondResult) {
				j = j +1;
			       System.out.println("result" + j);	
			}
			else {
				k = k + 1;
				System.out.println("result b " + k);
			}

			if (j ==2) {
				System.out.println("Выиграл компьютер");
			}
			else if (k==2) {
				System.out.println("Выиграл пользователь");
			}		

		

	
		/*		if (j >= 2) {
				System.out.println("Выиграл компьютер");
			}
			else if ( k >=2) {
				System.out.println("Выиграл человек");
			}

		*/


	}	


		
		
		
		


	}


}
