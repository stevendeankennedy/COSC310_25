package edu.frostburg.cosc310.javaexamples.lists;

public class LListTester {

	public static void main(String[] args) {
		LListTester test = new LListTester();
		
		test.go();
	}

	public void go() {
		DLList list = new DLList();
		
		list.add("1");
		list.add("2");
		list.add("3");
	}
}
