package com.blockwit.learn.ruslan.demo;

public class TestList {
	public static void main(String args[]) {
		testAddSingle();
		testAddMultiple();
	}

	public static void testAddSingle() {
		List list = new List();
		String testElement = "simpleElement";
		list.add(testElement);
		if (list.get(0).equals(testElement)) {
			System.out.println("Test successfully passed");
		} else {
			System.err.println("Test failed");
		}
	}

	public static void testAddMultiple() {
		List list = new List();
		for (int i = 0; i < 100; i++) {
			list.add(i + "");
		}

		for (int i = 0; i < 100; i++) {
			if (!list.get(i).equals(i + "")) {
				System.err.println("Test failed");
				return;
			}
		}
		System.out.println("Test successfully passed");
	}

}
