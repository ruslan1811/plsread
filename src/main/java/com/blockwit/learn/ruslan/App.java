package com.blockwit.learn.ruslan;

/**
 * Hello world!
 *
 */
/**

/*
 *   public class App 
 *	 {
 *   public static void main( String[] args )
 *   {
 *       System.out.println( "Hello World!" );
 *   }
	} 	*/
	

public class App {
	public static void main(String[] args)
	{
	String a;
	a = "i don't believe a word";
	 String b;
	 b = "shining on a crazy diamond";
	int year;
	year = 1988;
	String name;
	name = "Ruslan";
	int currentYear;
	currentYear = 2023;
	int age;
	age = currentYear - year;
	double weight;
	weight = 63;
	double protein;
	protein = weight * 1.7;
	double fats;
	fats = weight * 1.2;
	double carbs;
	carbs = weight * 2.5;
	boolean isMen = true;
	if(isMen == false) {
		protein = weight * 1.5;
		fats = weight * 1.1;
		carbs = weight * 2.1;
	}
	String[] myFriends = {"Валерий", "Ольга", "Наталья"};
	double[] rainFalls =  {0.3, 0.0, 5.0, 6.0, 0.2, 1.1, 5.1};
	System.out.println(a);
	System.out.println(b);
	System.out.println(year);
	System.out.println(name);
	System.out.println("Имя " + name + " имеет возраст " + age);
	System.out.println(protein);
	System.out.println("Для веса " + weight + " нужно " + protein + " г. белков, " + fats + " г. жиров, " + carbs + " г. углеводов.");
	for (int i=0; i < 3; i++) {
		System.out.println(myFriends[i]);
	};
	for (int y=0; y < 7;y++) {
		System.out.println(rainFalls[y]);
	}

}
}
