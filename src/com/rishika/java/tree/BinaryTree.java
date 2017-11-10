package com.rishika.java.tree;

 class BinaryTree<E> {
	
	private Node<E> root;
	
	BinaryTree(){
		root=null;
	}
		
	public void printTree(){
		System.out.println("Inside print.....");
		if(root==null){
			return;
		}
		_printTreeRecursive(root);
	}
	
	public void _printTreeRecursive(Node node){
		if(node==null)
			return;
		System.out.println("Inside recursive print.....");
		_printTreeRecursive(node.left);
		System.out.println(node.value+"-->");
		_printTreeRecursive(node.right);
	}
	
	public void insertNode(E value){
//		root=new Node(value);
		System.out.println("Inside insert node.....");
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
		System.out.println("Root value....."+node.value);
		return node;
	}
	
	public void deleteNode(E value){
		
	}
	
	public void searchNode(E value){
		
	}

}
