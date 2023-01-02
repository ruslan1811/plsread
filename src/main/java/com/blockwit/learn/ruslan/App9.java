package com.blockwit.learn.ruslan;

	

public class App9 {
	public static void main(String[] args) {
		String[] names = {"Lucefer", "Mamona", "Asmodey", "Wezewolf", "Leviafan", "Belfegor"};
		Boolean[] requested = {false, true, true, false, true, true };
		for (int i = 0, y = 0; i < names.length; i++, y++) {
		
			if (requested[y] == true) {
				System.out.println(names[i]);
				}
			}	


}
}
