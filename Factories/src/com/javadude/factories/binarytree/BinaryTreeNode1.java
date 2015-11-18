package com.javadude.factories.binarytree;

public class BinaryTreeNode1 {
	private BinaryTreeNode1 left;
	private BinaryTreeNode1 right;
	private int data;
	
	public int getData() {
		return data;
	}
	public BinaryTreeNode1(int data) {
		this.data = data;
	}
	public void insert(int data) {
		if (data < this.data) {
			if (left == null)
				left = new BinaryTreeNode1(data);
			else
				left.insert(data);
		} else {
			if (right == null)
				right = new BinaryTreeNode1(data);
			else
				right.insert(data);
		}
	}
	public void inorder() {
		if (left != null)
			left.inorder();
		handleThisNode();
		if (right != null)
			right.inorder();
	}
	protected void handleThisNode() {
		System.out.println(getData());
	}
}
