package com.blockwit.learn.ruslan;

	

public class App1 {
			public static void main(String[] args) {

	 int[] monthSalaries = { 100,109,108,114,101,100,120,200,103,112,107,150};		
		double sum = 0;
		for (int i = 0; i < monthSalaries.length; i++) {
			sum += monthSalaries[i];
		}
	
		double salaryVacation = sum / monthSalaries.length;
		System.out.println(salaryVacation);

	}
}
