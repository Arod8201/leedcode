package com.study.leedcode.easy.binarysearchtree.entity;

public class TreesNode {

	private int val;
	private TreesNode left;
	private TreesNode right;

	public TreesNode() {

	}

	public TreesNode(int val) {
		this.val = val;
	}

	public TreesNode(int val, TreesNode left, TreesNode right) {
		this.val = val;
		this.left = left;
		this.right = right;
	}

	public int getVal() {
		return val;
	}

	public void setVal(int val) {
		this.val = val;
	}

	public TreesNode getLeft() {
		return left;
	}

	public void setLeft(TreesNode left) {
		this.left = left;
	}

	public TreesNode getRight() {
		return right;
	}

	public void setRight(TreesNode right) {
		this.right = right;
	}

	@Override
	public String toString() {
		return "TreesNode [val = " + val + ", left = " + left + ", right = " + right + "]";
	}

}
