package com.javadude.factories.binarytree;

public class App1 {
	public static void main(String[] args) {
		BinaryTreeNode1 root = new BinaryTreeNode1(42);
		root.insert(10);
		root.insert(100);
		root.insert(1);
		root.insert(33);
		root.insert(84);
		root.insert(22);
		
		root.inorder();
	}
}
