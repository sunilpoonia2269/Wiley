package com.trees;

public class TreeApp {

	public static void main(String[] args) {
		Tree tree = new Tree();
		
		tree.root = new Node("A");	
		tree.root.left = new Node("B");
		tree.root.left.left = new Node("D");
		tree.root.left.right = new Node("E");
		tree.root.right = new Node("C");
		tree.root.right.left = new Node("F");
		tree.root.right.right = new Node("G");
		
		///              A
		//             /    \
		///           B       C
		//			 / \     /  \
		//			D   E    F   G
		///				
		
		TreeServices ts = new TreeServices();
		
		
		System.out.println("Pre Order Travesel =====> ");
		ts.preOrder(tree.root);
		System.out.println();
		
		System.out.println("In Order Travesel =====> ");
		ts.inOrder(tree.root);
		System.out.println();
		
		System.out.println("Post Order Travesel =====> ");
		ts.postOrder(tree.root);


	}

}
