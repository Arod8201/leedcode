package com.study.leedcode.easy.binarysearchtree;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.function.Function;

import javax.swing.tree.TreeNode;

import com.study.leedcode.easy.binarysearchtree.entity.TreesNode;

/*
  Example 1:
  			Input: root = [4,2,7,1,3], val = 2
			Output: [2,1,3]
			
  Example 2:
  			Input: root = [4,2,7,1,3], val = 5
			Output: []
*/

// 700. Search in a Binary Search Tree
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
**/
public class Solution {

	public static void main(String[] args) {
		
		List<Integer> root = new LinkedList<>();
		root.add(4);
		root.add(2);
		root.add(7);
		root.add(1);
		root.add(3);
		Collections.sort(root);
		System.out.println(root);

		
		
	}
	
//	public TreesNode searchBST(TreesNode root, int val) {
//
//	}

}
