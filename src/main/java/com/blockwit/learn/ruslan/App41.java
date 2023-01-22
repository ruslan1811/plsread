package com.blockwit.learn.ruslan;

import java.util.Scanner;

public class App41 {

	public static void main(String args[]) {

		int i = (int) ( Math.random() * 10 );

		Scanner sc = new Scanner(System.in);
	
	

	// System.out.println(i);
		System.out.println("Введите число от 1 до 10");

		for (int j =1; j <=3; j ++) {
			int number = sc.nextInt();
	
			if (number == i) {
				System.out.println("Да. Вы угадали число");
				break;
			}
			else {
				System.out.println("Не удалось угадать. Попробуйте снова.");
			}
		}




	}

}
