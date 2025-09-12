package edu.frostburg.cosc310.javaexamples.lists;
/**
 * Node for our linked list implementation.
 * 
 * @author Ashley + company
 */
public class DLNode {
	private String dat;
	private DLNode next;
	private DLNode prev;
	
	/**
	 * Constructor
	 * 
	 * @author Taylin
	 */
	public DLNode(String dat) {
		this(dat, null, null);
	}
	
	/**
	 * Second constructor
	 * @param dat
	 * @param next
	 */
	public DLNode(String dat, DLNode next, DLNode prev) {
		this.dat = dat;
		this.next = next;
		this.prev = next;
	}

	public String dat() {
		return dat;
	}

	public DLNode prev() {
		return prev;
	}

	public void setPrev(DLNode prev) {
		this.prev = prev;
	}

	public void setDat(String dat) {
		this.dat = dat;
	}

	public DLNode next() {
		return next;
	}

	public void setNext(DLNode next) {
		this.next = next;
	}
}
