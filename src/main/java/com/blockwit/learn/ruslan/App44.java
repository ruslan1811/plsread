package com.blockwit.learn.ruslan;

import java.util.Scanner;

public class App44 {
	
	public static void main(String args[]) {

		for (int i = 21; i >= 0; i --) {
			
			
					
			int compNumber = (int) (Math.random() * 3);
				
			

			System.out.println("Число компьютера " + compNumber);
			
			Scanner scan = new Scanner(System.in);

			System.out.println("Введите число от 1 до 3");

			int userNumber = scan.nextInt();
			
				

			i = i - compNumber - userNumber;

			
			


	
			if (i <=0) {

				System.out.println("Игра окончена");
			}
			
		
				

		}

		
		


	}

}	
