package com.blockwit.learn.ruslan;

	

public class App2 {
	public static void main(String[] args) {
	
	double[] monthSalaries = { 100,109,108,114,101,100,120,200,103,112,107,150};
			
	
	for (int i = 0; i < monthSalaries.length; i++) {
	double average = monthSalaries[i] / 30;
	System.out.println(average);

	}
	

	/*	double sum = 0;
	for (int i = 0; i < monthSalaries.length; i++) {
		sum += monthSalaries[i];
	}
	
	salaryVacation = sum / monthSalaries.length;
	System.out.println(salaryVacation);
*/
	}
}
