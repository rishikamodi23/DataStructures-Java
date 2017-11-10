package com.rishika.java.tree;

class Node<E> {
	E value;
	Node left,right;
	
	public Node(E value){		
		this.value=value;
		left=null;
		right=null;
	}
	
}
