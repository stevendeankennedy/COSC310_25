package edu.frostburg.cosc310.recursion;

public class RecursionMachine {

	public static void main(String[] args) {
		RecursionMachine rm = new RecursionMachine();
		rm.count(5);
	}
	
	/**
	 * Recursion example.
	 * Is it O(n) like Christ guesses?
	 * @param n
	 */
	public void count(int n) {
		if (n == 0) {  // 1
			System.out.println(0);
			return;
		}
		System.out.println(n);
		count(n-1); // n!, Thanks to Christ!
//		System.out.println(n); // 1
	}

}
