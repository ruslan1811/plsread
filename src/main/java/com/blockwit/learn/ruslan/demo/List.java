package com.blockwit.learn.ruslan.demo;

import java.util.Arrays;

public class List {
	private static String[] list = new String[1];
	private int index = 0;

	public void add(String item) {
		if (index == list.length) {
			list = Arrays.copyOf(list, list.length + (int) (list.length * 0.2) + 1);
		}
		list[index] = item;
		index++;
	}

	public String get(int index) {
		return list[index];
	}

	public int getSize() {
		return index;
	}

	public String insert(int index, String text) {
		String[] copiedArray  = Arrays.copyOf(list, list.length + 1);
		System.arraycopy(list, 0, copiedArray, 0, index-1);
		copiedArray[index] = text;
		System.arraycopy(list, index, copiedArray, index+1, (copiedArray.length-1)- index);
		list = copiedArray;
		return list[index];


	}
}
