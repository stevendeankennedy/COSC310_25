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
		DLNode current = head;
		int nd = 0;
		while (nd < i-1) {
			current = current.next();
			nd += 1;
		} // end of loop

		// current is now pointing at the previous to new node
		// 1 new node
		DLNode newNode = new DLNode(e);
		// 2 new next
		newNode.setNext(current.next());
		// 3 old next
		current.setNext(newNode);
		count += 1;
	}
	
	/**
	 * Removing the last element, aka pop
	 * 
	 * Thanks Michael, Aom, Christ, ...
	 */
	@Override
	public void rem() {
		if (head == null)
			return;
		count -= 1;
		int i = 1;
		DLNode curr = head;
		while(i < count) {
			curr = curr.next();
			i += 1;
		} // loop end
		// should be pointing to next to last element
		curr.setNext(null);
	}



	@Override
	public void rem(int i) {
		// TODO Auto-generated method stub
		
	}

	public void printList() {
		if (head == null) {
			System.out.println("-empty-");
			return;
		}
		int counter = 0;
		DLNode curr = head;
		while (curr != null) {
			System.out.print(curr.dat() + " ");
			curr = curr.next();
		}
		System.out.println();
	}
}
