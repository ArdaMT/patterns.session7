package com.javadude.factories.binarytree;

public class BinaryTreeNode1a extends BinaryTreeNode1 {
	public BinaryTreeNode1a(int data) {
		super(data);
	}
	protected void handleThisNode() {
		System.out.println(getData() + "!!!");
	}
}
