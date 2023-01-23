package com.blockwit.learn.ruslan;

import java.util.Scanner;
import java.util.Random;

public class App44 {
	
	public static void main(String args[]) {

		int gameSticks = (int) (Math.random() * ((30 - 10 ) + 1) + 10);
		 System.out.println(gameSticks);	
		
		int sticksLimit;
		int playerSticks;

		while (gameSticks > 0) {
			
			if (gameSticks < 3) {
				Random r = new Random();
				sticksLimit = r.nextInt(gameSticks) + 1;
					}			
			else {
				Random l = new Random();
				sticksLimit = l.nextInt(3) + 1;
			    }
		
			playerSticks = (int) (Math.random() * sticksLimit) + 1;
		
			System.out.println("Компьютер взял " + playerSticks + " палочек");

			gameSticks = gameSticks - playerSticks;
		






			if (gameSticks == 0) {
			
				System.out.println("Компьютер  проиграл");
				break;
					
					    }
			
		//Ходит игрок
		
			if (gameSticks < 3) {
			
				Scanner sc = new Scanner(System.in);
			
				System.out.println("Введите число от 1  до " + gameSticks);
			
				playerSticks = sc.nextInt();

		/*	if (sc.nextInt() > sticksLimit || sc.nextInt() == 0 ) {
				System.out.println("Число не ок");
				System.out.println("Введите число от 1 до " + gameSticks);
				playerSticks = sc.nextInt();
			}*/
			

				System.out.println("Вы взяли " + playerSticks + " палочек");
				
				        	}
			else {
			
				Scanner st = new Scanner(System.in);
			
				System.out.println("Введите число от 1 до 3");

				playerSticks = st.nextInt();
			
			

				
				System.out.println("Вы взяли " + playerSticks + " палочек");


		}	
			
		
		
		
		gameSticks = gameSticks - playerSticks;

		if (gameSticks == 0) {
			System.out.println("Игрок проиграл");
			break;
				}

		

		


		}	









	}
}	
