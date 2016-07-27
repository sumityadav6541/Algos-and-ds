package algos.Algos_and_ds.easy.tree;

import algos.Algos_and_ds.commons.BST;
import algos.Algos_and_ds.commons.TreeNode;

public class PathSum {
	public static void main(String[] args) {
		int[] b = { 1, 3, 5, 7, 9, 11, 13 };
		TreeNode root = BST.sortedArray2BST(b);
		System.out.println(hasPathSum(root,11));
		System.out.println(hasPathSum(root,10));
	}

	private static boolean hasPathSum(TreeNode root, int sum) {
		if(root==null || sum - root.data < 0)
			return false;
		if(root.data-sum==0 && root.left==null && root.right==null)
			return true;
		return hasPathSum(root.left, sum-root.data) || hasPathSum(root.right, sum-root.data);
	}
}
