package com.javadude.factories.binarytree;

public class App2 {
	public static void main(String[] args) {
		BinaryTreeNode2 root = new BinaryTreeNode2(42);
		root.insert(10);
		root.insert(100);
		root.insert(1);
		root.insert(33);
		root.insert(84);
		root.insert(22);
		
		root.inorder();
	}
}
