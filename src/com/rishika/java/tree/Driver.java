package com.rishika.java.tree;



public class Driver {
	

	
	public static void main(String args[]){
		BinaryTree binaryTree = new BinaryTree();
		binaryTree.insertNode(2);//root
		binaryTree.insertNode(3);
		binaryTree.insertNode(4);
		binaryTree.insertNode(5);
		binaryTree.insertNode(6);
		System.out.println("Inside Driver.....");
		System.out.println("root node is: "+ binaryTree.getRoot());
		binaryTree.printTree();
		binaryTree.searchNode(5);
	}

}
