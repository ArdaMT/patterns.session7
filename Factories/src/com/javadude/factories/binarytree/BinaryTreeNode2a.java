package com.javadude.factories.binarytree;

public class BinaryTreeNode2a extends BinaryTreeNode2 {
	public BinaryTreeNode2a(int data) {
		super(data);
	}
	protected void handleThisNode() {
		System.out.println(getData() + "!!!");
	}
	@Override
	protected BinaryTreeNode2 createNode(int data) {
		return new BinaryTreeNode2a(data);
	}
}
