package algos.Algos_and_ds.easy;

import algos.Algos_and_ds.commons.TreeNode;

public class SumTree {
	public static void main(String[] args) {
		TreeNode root = new TreeNode(26);
		root.left = new TreeNode(10);
		root.right = new TreeNode(3);
		root.left.left = new TreeNode(4);
		root.left.right = new TreeNode(6);
		root.right.left = new TreeNode(1);
		root.right.right = new TreeNode(2);

		System.out.println(isSumTree(root));
		System.out.println(isSumTreeFaster(root));
	}

	private static boolean isSumTreeFaster(TreeNode root) {
		if (root == null || isLeaf(root))
			return true;
		int lSum = 0;
		int rSum = 0;

		if (isSumTreeFaster(root.left) && isSumTreeFaster(root.right)) {
			// calculate the sum of left sub tree
			if (root.left == null)
				lSum = 0;
			else if (isLeaf(root.left))
				lSum = root.left.data;
			else
				lSum = 2 * root.left.data;

			// calculate the sum of right sub tree
			if (root.right == null)
				rSum = 0;
			else if (isLeaf(root.right))
				rSum = root.right.data;
			else
				rSum = 2 * root.right.data;

			if (root.data == lSum + rSum)
				return true;
			else
				return false;
		}

		return false;
	}

	private static boolean isLeaf(TreeNode root) {
		if (root == null)
			return false;
		else if (root.left == null && root.right == null)
			return true;
		else
			return false;
	}

	// time complexity O(n^2) worst case if tree is a sum tree.
	private static boolean isSumTree(TreeNode root) {
		if (root == null)
			return false;
		if (root.left == null && root.right == null)
			return true;

		// boolean flag = isSumTree(root.left) && isSumTree(root.right);
		if (root.data == sumTree(root.left) + sumTree(root.right))
			return isSumTree(root.left) && isSumTree(root.right);
		else
			return false;
	}

	private static int sumTree(TreeNode root) {
		if (root == null)
			return 0;
		else
			return sumTree(root.left) + root.data + sumTree(root.right);
	}

	private static void printTree(TreeNode root) {
		if (root == null)
			return;
		printTree(root.left);
		System.out.print(root.data + " ");
		printTree(root.right);
	}
}
