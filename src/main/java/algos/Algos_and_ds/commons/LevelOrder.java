package algos.Algos_and_ds.commons;

import java.util.ArrayDeque;

public class LevelOrder {
	public static void main(String[] args) {
		int[] b = { 1, 3, 5, 7, 9, 11, 13 };

		TreeNode root = BST.sortedArray2BST(b);
		levelOrderTraversal(root);
	}

	public static void levelOrderTraversal(TreeNode root) {
		if (root == null)
			return;
		ArrayDeque<TreeNode> q = new ArrayDeque<TreeNode>();
		q.add(root);
		TreeNode temp;
		while (!q.isEmpty()) {
			temp = q.poll();
			if (temp.left != null)
				q.add(temp.left);
			if (temp.right != null)
				q.add(temp.right);
			System.out.println(temp.data);
		}

	}
}
