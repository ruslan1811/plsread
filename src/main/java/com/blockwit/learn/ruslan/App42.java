package com.blockwit.learn.ruslan;

import java.util.Scanner;

public class App42 {

	public static void main(String args[]) {

	int secretNumber  = (int) ( Math.random() * 10 );
	
	

	Scanner sc = new Scanner(System.in);
	
	for (int i = 1; i < 10; i++) {
	int computerNumber = (int) (Math.random() * 10);
		System.out.println("Ваш ход. Введите число от 1 до 10");
		int number = sc.nextInt();
	
	

	
	
	int firstResult = (int) (number - secretNumber);
	int secondResult = (int) (computerNumber - secretNumber);

	if ( firstResult < secondResult ) {
		System.out.println("Выиграл пользователь");
	}
	else {
		System.out.println("Выиграл компьютер");
	}


	
	}





	}

}

