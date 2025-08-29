package edu.frostburg.cosc310.javaexamples;

import java.util.Scanner;

public class ExampleThing {

	private int aNumber;
	protected double anotherNumber;
	
	public int say(String word) {
		System.out.println(word);
		return 1;
	}
	
	public long add(int a, int b) {
		return a + b;
	}
	
	public static void main(String[] args) {
//		System.out.println("Hello World!");
//		
		ExampleThing myExample = new ExampleThing();
//		
//		
//		// other examples
//		
//		int camelCaseIsBetter = 1;
//		int camelcaseisbetter = 1;
//		int camel_case_is_better = 1;
//		long b = 2000000000;
//		int a = 1;
//		
//		b = a;
//		a = (int)b;  // type casting
		
		myExample.runFridayExamples();
		myExample.runFridayExamples2();
	}
	
	private void runFridayExamples2() {
		String one = "one";
		String two = "two";
		String one2 = "one";
		String one3 = new String("one");
		
		/* Don't do this, even though it seems like it works... */
		if (one == one3) {
			System.out.println("equal");
		} else {
			System.out.println("not");
		}
		
		if (one.equals(one3)) {
			System.out.println("But wait, it is equal actually");
		}
		
		int x = 1;
		switch(x) {
			case 1: // this is like saying x == 1
				System.out.println("1");
				break;
			case 2: // aka x == 2
				System.out.println("2");
				break;
			default: // aka else
				System.out.println("x");
		}
		
		thisIsALine:
		while(x == 5) {
			if (x == 1) {
				System.out.println(x);
				break thisIsALine;
			}
			if (x == 2)
				continue thisIsALine;
			x = x - 1;
		}
		
		boolean b = false;
		do { // will always do this one time first
			System.out.println("Hello");
		} while (b);
		
		for (int i=0; i<5; i++) {
			System.out.println(i);
		}
		
		String[] args = new String[1];
		for (String s : args) {
			System.out.println(s);
		}
	}

	/*
	 * This is a comment
	 * It can take multiple lines
	 * etc
	 */
	/**
	 * This is a Javadoc comment.
	 * They are fancy.
	 *  @author sdkennedy
	 *  @return nothing
	 */
	public void runFridayExamples() {
		int x = (4-4) * (5+1) / 5;
		int easyvalue = 5;
		int y = easyvalue++; // inc after reading
		int z = ++easyvalue; // inc before reading
		
		System.out.println(y);
		System.out.println(z);
		int i = 5;
		while (i > 0) {
			System.out.println(i--);
		}
		
		// evaluators
		// ==, >=, >, ...
		// &&, ||
		// &, |
		
		x = 1;
		// short circuit evaluation
		if (x > 1 && y > 1 /*&& mything.etc() == 0*/) {
			// stuff
		} else if (x > 1 || y > 1) {
			// stuff
		}
		
		String str = "Hello World\nGoodbye World";
		Scanner s = new Scanner(System.in);
	}

}
