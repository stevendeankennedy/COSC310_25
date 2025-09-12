package edu.frostburg.cosc310.javaexamples.lists;

/**
 * COSC 310 basic Linked List implementation, based on everything
 * 	that we talked about regarding lists.
 * 
 * @author sdkennedy + COSC 310
 */
public class DLList implements List {

	/* Head of the list */
	private DLNode head;
	private DLNode tail;
	private int count;
	
	public DLList() {
		head = null;
		count = 0;
		System.out.println("Made a DLList!");
	}
	
	/**
	 * Adds an element to the front of the list.
	 */
	@Override
	public void add(String e) {
		DLNode nd = new DLNode(e);
		if (count == 0) {  // aka an empty list			
			head = tail = nd;
		} else {
			nd.setPrev(tail);
			tail.setNext(nd);
			tail = nd;
		}
		count += 1;
	}

	/**
	 * Add an element to a random position
	 * @param i the index where e should go
	 * @param e the new element
	 */
	@Override
	public void add(String e, int i) {
		// find the node previous to i
		// then adjust pointers (tip: don't lose track of next)
	}
	
	@Override
	public void rem() {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void rem(int i) {
		// TODO Auto-generated method stub
		
	}

}
