package com.rishika.java.tree;

 class BinaryTree<E> {
	
	private Node<E> root;
	
	BinaryTree(){
		root=null;
	}
	
	public void printTree(){
		if(root==null){
			return;
		}
		_printTreeRecursive(root);
	}
	
	public void _printTreeRecursive(Node node){
		if(node==null)
			return;
		_printTreeRecursive(node.left);
		System.out.println(node.value+"-->");
		_printTreeRecursive(node.right);
	}
	
	public void insertNode(E value){
		 _insertNodeRecursively(root,value);	
	}
	
	public E getRoot(){
		return root.value;
	}
	
	private Node<E> _insertNodeRecursively(Node<E> node, E value){			
		if(node==null){
			node = new Node<E>(value);	
			root=node;
		}		
		else if(node.left==null){
			node.left=new Node<E>(value);
		}
		else if(node.right==null){
			node.right=new Node<E>(value);
		}
		else{
			_insertNodeRecursively(node.left, value);
		}
		return node;
	}
	
	public void deleteNode(E value){
		
	}
	
	private boolean _searchNode(Node node,E value){
		if(node==null)
			return false;
		if(node.value==value){
			return true;
		}
		return (_searchNode(node.left,value) || _searchNode(node.right,value));
	}
	
	public void searchNode(E value){
		System.out.println(_searchNode(root,value));
	}

}
