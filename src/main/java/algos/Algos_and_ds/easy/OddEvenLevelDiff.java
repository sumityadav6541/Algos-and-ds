package algos.Algos_and_ds.easy;

import java.util.ArrayDeque;

import algos.Algos_and_ds.commons.TreeNode;

public class OddEvenLevelDiff {
	private static TreeNode NULLNODE = new TreeNode(Integer.MIN_VALUE);
	
	public static void main(String[] args) {
		/*
		 * int[] b = { 1, 3, 5, 7, 9, 11, 13 }; TreeNode root =
		 * BST.sortedArray2BST(b);
		 */

		TreeNode root = new TreeNode(10);
		root.left = new TreeNode(20);
		root.right = new TreeNode(30);
		root.left.left = new TreeNode(40);
		root.left.right = new TreeNode(60);

		System.out.println(getLevelDiff_1q(root));
	}

	// using only one queue
	public static int getLevelDiff_1q(TreeNode root) {
		if (root == null) {
			throw new RuntimeException("Can not pass an empty tree");
		}
	
		int evenLevelSum = 0, oddLevelSum = 0;
	
		ArrayDeque<TreeNode> q = new ArrayDeque<TreeNode>(); // use level order traversal
		q.add(root);
		q.add(NULLNODE);
		TreeNode temp;
		int level = 1;
	
		while (!q.isEmpty()) {
			temp = q.poll();
	
			if (temp == NULLNODE) {
				level++;
				if (!q.isEmpty())
					q.add(NULLNODE);
			} else {
	
				if (level % 2 == 0)
					evenLevelSum += temp.data;
				else
					oddLevelSum += temp.data;
				
				if(temp.left!=null)
					q.add(temp.left);
				if(temp.right!=null)
					q.add(temp.right);
			}
	
		}
		return oddLevelSum - evenLevelSum;
	}

	// using two queue's
	public static int getLevelDiff_2q(TreeNode root) {
		if (root == null) {
			throw new RuntimeException("Can not pass an empty tree");
		}

		int evenLevelSum = 0, oddLevelSum = 0;

		ArrayDeque<TreeNode> q1 = new ArrayDeque<TreeNode>();// odd level list
		ArrayDeque<TreeNode> q2 = new ArrayDeque<TreeNode>();// even level list
		q1.add(root);
		TreeNode temp;

		while (!q1.isEmpty() || !q2.isEmpty()) {

			while (!q1.isEmpty()) { // odd level sum
				temp = q1.poll();
				if (temp.left != null)
					q2.add(temp.left);
				if (temp.right != null)
					q2.add(temp.right);
				oddLevelSum += temp.data;
			}

			while (!q2.isEmpty()) { // even level sum
				temp = q2.poll();
				if (temp.left != null)
					q1.add(temp.left);
				if (temp.right != null)
					q1.add(temp.right);
				evenLevelSum += temp.data;
			}
		}

		return oddLevelSum - evenLevelSum;
	}

}
