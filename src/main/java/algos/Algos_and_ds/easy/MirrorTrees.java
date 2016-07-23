package algos.Algos_and_ds.easy;

import algos.Algos_and_ds.commons.BST;
import algos.Algos_and_ds.commons.TreeNode;

public class MirrorTrees {
	public static void main(String[] args) {

		TreeNode root = new TreeNode(1); // symmetric trees
		root.left = new TreeNode(2);
		root.right = new TreeNode(2);
		root.left.left = new TreeNode(3);
		root.left.right = new TreeNode(4);
		root.right.left = new TreeNode(4);
		root.right.right = new TreeNode(3);

		TreeNode root2 = new TreeNode(1);
		root2.left = new TreeNode(2);
		root2.right = new TreeNode(2);
		root2.left.right = new TreeNode(3);
		root2.right.right = new TreeNode(3);

		System.out.println(isMirrorTrees(root, root)); // should result true
		System.out.println(isMirrorTrees(null, null)); // should result true
		System.out.println(isMirrorTrees(root, null)); // should result false
		System.out.println(isMirrorTrees(root2, root2)); // should result false

	}
	
	/**
	 * worst case runing time complexity is O(n) (if tree is symmetric)
	 * 
	 * @param root
	 * @param root2
	 * @return true if two trees are mirror trees else false
	 */
	public static boolean isMirrorTrees(TreeNode root, TreeNode root2) {
		if (root == null && root2 == null)
			return true;
		else if (root != null && root2 != null && root.data == root2.data)
			return isMirrorTrees(root.left, root2.right) && isMirrorTrees(root.right, root2.left);
		else
			return false;
	}

}
