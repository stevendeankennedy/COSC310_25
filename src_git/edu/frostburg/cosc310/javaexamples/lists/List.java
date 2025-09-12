package edu.frostburg.cosc310.javaexamples.lists;

/**
 * JavaDoc here Yay!
 * 
 * This is our list interface, based on the ADT we wrote on the board
 * @param <T> the type that we will store
 */
public interface List {

	public void add(String e); // basically push
	public void rem(); // basically pop
	public void add(String e, int i); // add e to index i
	public void rem(int i); // remove from index i
}
