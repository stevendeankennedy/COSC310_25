package edu.frostburg.cosc310.javaexamples.lists;

/**
 * A quick list implementation.  Stores ints.
 * 
 * Created by Steve K and COSC 310 Friends
 */

public class ListOld { // Thanks, William P!
	
	private int[] dat; // note that arrays in Java know their size
		// conveniently, they are also ordered and indexed...
	private int count;  // this is how many spots in the array we use
	
	public ListOld(int size) { // Aom points out that this should be
							// dynamic.  He's right, but I dont' care
		dat = new int[size];
	}
	
	// primitive behavior, thanks Christ! 
	public boolean add(int e) {
		if (count == getSize()) {
			return false;
		}
		dat[count++] = e;
		return true;
	}
	
	// public void remove()
	// public void add(e,i)
	// public void rem(e,i)
	
	public int getSize() {
		return dat.length;
	}
}
