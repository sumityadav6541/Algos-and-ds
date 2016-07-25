package algos.Algos_and_ds.easy.tree;

import algos.Algos_and_ds.commons.TreeNode;

public class TreeSiblings {
	public static void main(String[] args) {
		TreeNode root = new TreeNode(26);
		root.left = new TreeNode(10);
		root.right = new TreeNode(3);
		root.left.left = new TreeNode(4);
		root.right.right = new TreeNode(2);
		
		printNonSiblings(root);
	}

	// running complexity is O(n)
	private static void printNonSiblings(TreeNode root) {
		if(root==null)
			return;
		
		printNonSiblings(root.left);
		
		if(root.left==null && root.right!=null)
			System.out.print(root.right.data+" ");
		
		if(root.right==null && root.left!=null)
			System.out.print(root.left.data+" ");
		
		printNonSiblings(root.right);
		
	}
}
