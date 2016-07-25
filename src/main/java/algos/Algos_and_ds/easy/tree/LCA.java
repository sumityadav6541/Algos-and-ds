package algos.Algos_and_ds.easy.tree;

import algos.Algos_and_ds.commons.BST;
import algos.Algos_and_ds.commons.TreeNode;

public class LCA {
	public static void main(String[] args) {
		
		int[] b = { 1, 3, 5, 7, 9, 11, 13 };
		TreeNode root = BST.sortedArray2BST(b);
		//LevelOrder.levelOrderTraversal(root);
		System.out.println(getBSTLCA(root,1,5).data);
		System.out.println(getBTLCA(root,1,5).data);
	}

	/*
	 * assuming n1 and n2 are present in the tree
	 * */
	private static TreeNode getBTLCA(TreeNode root, int n1, int n2) {
		if(root==null)
			return root;
		boolean n1_pos = isPresent(root.left,n1);
		boolean n2_pos = isPresent(root.left,n2);
		if(n1_pos && n2_pos)
			return getBTLCA(root.left, n1, n2);
		else if(!n1_pos && !n2_pos)
			return getBTLCA(root.right, n1, n2);
		else
			return root;
			
	}

	private static boolean isPresent(TreeNode root, int data) {
		if(root==null)
			return false;
		if(root.data == data)
			return true;
		else
			return isPresent(root.left, data) || isPresent(root.right, data);
	}

	public static TreeNode getBSTLCA(TreeNode root, int n1, int n2) {
		if(root==null)
			return root;
		
		if(root.data<n1 & root.data<n2)
			return getBSTLCA(root.right, n1, n2);
		else if(root.data>n1 & root.data>n2)
			return getBSTLCA(root.left, n1, n2);
		else
			return root;
	}

	
}