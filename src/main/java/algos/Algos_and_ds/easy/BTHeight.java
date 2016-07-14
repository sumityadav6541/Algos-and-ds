package algos.Algos_and_ds.easy;

import algos.Algos_and_ds.commons.BST;
import algos.Algos_and_ds.commons.TreeNode;

public class BTHeight {
	private static int getHeight(TreeNode root){
		if(root==null)
			return 0;
		return 1 + max(getHeight(root.left),getHeight(root.right));
	}

	private static int max(int h1, int h2) {
		return h1 > h2 ? h1 : h2;
	}
	
	public static void main(String[] args) {
		int[] a = {1,3,5,7,9,11,13};
		
		TreeNode root = BST.sortedArray2BST(a);
		BST.inOrderTraversal(root);
		System.out.println();
		System.out.println("Height os a tree is "+getHeight(root));
	}
}
