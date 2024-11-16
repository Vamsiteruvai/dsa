package com.tree;

public class BinaryTree {
	
	public static void binaryTree(Node node) {
		if(node==null) {
			return;
		}
//		binaryTree(node.left);
//		System.out.print(node.data+" ");    //Inorder Traversal
//		binaryTree(node.right);
//		
		binaryTree(node.left);
		binaryTree(node.right);				//Preorder Traversal
		System.out.print(node.data+" ");
		
//		System.out.print(node.data+" ");
//		binaryTree(node.left);				//Postorder Traversal
//		binaryTree(node.right);
	}
	/**
	 * Inorder Traversal
	 * @param args
	 */
	public static void main(String[] args) {
		Node root=new Node(1);
		root.left=new Node(2);
		root.right=new Node(3);
		root.left.left=new Node(4);
		root.left.right=new Node(5);
		binaryTree(root);
		 
	}

}
