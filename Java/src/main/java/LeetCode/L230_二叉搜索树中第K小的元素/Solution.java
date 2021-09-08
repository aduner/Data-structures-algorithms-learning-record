package LeetCode.L230_二叉搜索树中第K小的元素;

import java.util.ArrayList;

/**
 * @author Aduner
 */
public class Solution {
	public ArrayList<Integer> inorder(TreeNode root, ArrayList<Integer> arr) {
		if (root == null) return arr;
		inorder(root.left, arr);
		arr.add(root.val);
		inorder(root.right, arr);
		return arr;
	}

	public int kthSmallest(TreeNode root, int k) {
		ArrayList<Integer> nums = inorder(root, new ArrayList<Integer>());
		return nums.get(k - 1);
	}

}

class TreeNode {
	int val;
	TreeNode left;
	TreeNode right;

	TreeNode() {
	}

	TreeNode(int val) {
		this.val = val;
	}

	TreeNode(int val, TreeNode left, TreeNode right) {
		this.val = val;
		this.left = left;
		this.right = right;
	}
}