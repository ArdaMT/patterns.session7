package com.javadude.factories.binarytree;

public class BinaryTreeNode2 {
	private BinaryTreeNode2 left;
	private BinaryTreeNode2 right;
	private int data;
	
	public int getData() {
		return data;
	}
	public BinaryTreeNode2(int data) {
		this.data = data;
	}
	public void insert(int data) {
		if (data < this.data) {
			if (left == null)
				left = createNode(data);
			else
				left.insert(data);
		} else {
			if (right == null)
				right = createNode(data);
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
	protected BinaryTreeNode2 createNode(int data) {
		return new BinaryTreeNode2(data);
	}
}
