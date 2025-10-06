package edu.frostburg.cosc310.proj.translation;

public class AVLTree {

	private AVLNode root;
	private int count;
	
	/**
	 * Constructor
	 */
	public AVLTree() {
		root = null;
		count = 0;
//		print("AVL Tree ready!");
	}
	
	public void add(String eng) {
		root = add(eng, root); // maybe
	}
	
	//* TODO: Change the eng (and arabic) to be the right data */
	private AVLNode add(String key, AVLNode root) {
		// if duplicate key, return false
		// else add and return true
		
		AVLNode nd = new AVLNode(key); // TODO: revise node
		if (root == null) {  // aka an empty tree
//			count += 1;
			return nd;
		} else if (nd.getData().compareTo(root.getData()) < 0) {
			// if it is less, add it to the lefthand sided
			root.setLeft(add(key, root.left()));
		} else if (nd.getData().compareTo(root.getData()) > 0) {
			root.setRight(add(key, root.right()));
		} else { // it is equal
			return root;
		}

//		count += 1;

		// update the height
		root.setHeight(1 + Math.max(getHeight(root.left()), getHeight(root.right())));
		
		// check the  balance here (checks difference)
		int balance = getBalance(root);
		
		// note that when adding, need to do some comparison
		if (balance > 1) { // TODO: Check condition
			return rightRotation(root);
		}
		return root;
	}
	
	private AVLNode rightRotation(AVLNode c) {
		// setup
		AVLNode b = c.left();
		AVLNode z = b.right();
		
		// rotate
		b.setRight(c);
		c.setLeft(z);
		
		// update heights
		b.setHeight(1 + Math.max(getHeight(b.left()), getHeight(b.right())));
		c.setHeight(1 + Math.max(getHeight(c.left()), getHeight(c.right())));
		
		return b; 
	}
	
	/**
	 * Calculates LEFT_HEIGHT - RIGHT HEIGHT
	 * 	if it is positive, the left is taller
	 * 	if it is negative, the right is taller
	 * 	else it is perfectly balanced, as all things should be
	 * @param root
	 * @return a negative or positive number.
	 */
	private int getBalance(AVLNode root) {
		if (root == null) {
			return 0;
		}
		return getHeight(root.left()) - getHeight(root.right());
	}
	
	private int getHeight(AVLNode root) {
		if (root == null) {
			return 0;
		}
		return root.height();
	}
	
	public void printInorder() {
		printInorder(root);
	}
	
	// Just print keys...
	private void printInorder(AVLNode root) {
		if (root == null) {
			return;
		}
		//LVR
		printInorder(root.left());
		System.out.print(root.getData() + " ");
		printInorder(root.right());
	}
	
	private void printPreorder() {
		if (root == null) {
			return;
		}
		//VLR
		System.out.print(root.getData() + " ");
		printInorder(root.left());
		printInorder(root.right());
	}
	
	public void printPostorder() {
		
	}
	
	
	public AVLNode root() {
		return root;
	}
	
	public int count() {
		return count;
	}
}
