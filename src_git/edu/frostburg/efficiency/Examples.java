package edu.frostburg.efficiency;

public class Examples {

	public static void main(String[] args) {
		Examples ex = new Examples();
		
		int n = 10;
		int d = 1;
		ex.runBasicThings(n, d);
		System.out.println("---");
		System.out.println("pt 2");
		ex.runOtherThings(n, d);
		System.out.println("---\npt 3");
		ex.runLastThing(n, d);
	}
	
	public void runLastThing(int n, int d) {
		runLastThing(n);
		System.out.println();
	}
	
	private void runLastThing(int n) {
		if (n == 0) // c 
			return; // c
		runLastThing(n-1); // n
		System.out.print(n + " "); // c
	}
	
	public void runOtherThings(int n, int d) {
		int count = 0;
		for (int i=0; i<n; i+=1) { // n times (n * cn)
			for (int j=i; j<n; j+=1) { // n times (cn)
				count += d; // c
			}
		}
		System.out.println("O(n^2):"+count);
	}
	
	/**
	 * Algorithm counting examples
	 * @param n number of counts
	 * @param d number to increment by (d*n)
	 */
	public void runBasicThings(int n, int d) {
		int count = 0; // c
		for (int i=0; i<n; i+=1) {// n * c
			count += d;
		}
		System.out.println("O(n):"+count); // c
		// = c + (cn) + c = n + c
		
		count = 0;
		for (int i=0; i<n; i+=1) { // n times (n * cn)
			for (int j=0; j<n; j+=1) { // n times (cn)
				count += d; // c
			}
		}
		System.out.println("O(n^2):"+count);
		
		count = 0;
		for (int i=n; i>0; i/= 2) {
			count += d;
		}
		System.out.println("O(lg n):"+count);
	}

}
