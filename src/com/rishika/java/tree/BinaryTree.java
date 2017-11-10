package com.rishika.java.tree;

 class BinaryTree<E> {
	
	private Node<E> root;
	
	BinaryTree(){
		root=null;
	}
	
//	public BinaryTree(E value){
//		root=new Node<E>(value);
//	}
	
	public void printTree(){
		System.out.println("Inside print.....");
		if(root==null){
			return;
		}
		_printTreeRecursive(root);
	}
	
	public void _printTreeRecursive(Node node){
		System.out.println("Inside recursive print.....");
		_printTreeRecursive(root.left);
		System.out.println(root.value+"-->");
		_printTreeRecursive(root.right);
	}
	
	public void insertNode(E value){
//		root=new Node(value);
		System.out.println("Inside insert node.....");
		root = _insertNodeRecursively(root,value);	
	}
	
	public E getRoot(){
		return root.value;
	}
	
	private Node<E> _insertNodeRecursively(Node<E> node, E value){			
		if(node==null){
			node = new Node<E>(value);	
		}		
		else if(node.left==null){
			node=_insertNodeRecursively(node.left, value);
		}
		else if(node.right==null){
			node=_insertNodeRecursively(node.right, value);
		}
//		else{
//			_insertNodeRecursively(root.left, value);
//		}
		System.out.println("Root value....."+node.value);
		return root;
	}
	
	public void deleteNode(E value){
		
	}
	
	public void searchNode(E value){
		
	}

}
