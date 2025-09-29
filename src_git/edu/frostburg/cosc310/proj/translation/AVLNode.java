package edu.frostburg.cosc310.proj.translation;

public class AVLNode {
	private KeyValue data;  // TODO: Currently missing get/set
	private AVLNode left;
	private AVLNode right;
	private int height;
	
	public AVLNode left() { // cut off "get" because data structures reasons
		return left;
	}
	public void setLeft(AVLNode left) {
		this.left = left;
	}
	public AVLNode right() {
		return right;
	}
	public void setRight(AVLNode right) {
		this.right = right;
	}
	public int height() { // cut off "get" for consistency, but its actually fine
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
}
