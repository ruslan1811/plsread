package com.blockwit.learn.ruslan;

	

public class App8 {
	public static void main(String[] args) {
		String[] names = {"Alice", "Bob", "John", "Eugeny", "Alex", "Mira", "Serg", "Ilon", "Zelda", "Gora", "Seve"};
		
		for (int i = 0; i < names.length; i++) {
			if (( i + 1) % 2 == 0) {
				System.out.println(names[i]);
			}
			if ((i + 1) % 5 == 0) {
				System.out.println(names[i]);
			}
			
		}
		


}
}
