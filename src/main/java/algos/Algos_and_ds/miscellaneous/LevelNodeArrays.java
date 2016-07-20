package algos.Algos_and_ds.miscellaneous;

import algos.Algos_and_ds.commons.BST;
import algos.Algos_and_ds.commons.TreeNode;

public class LevelNodeArrays {
	public static void main(String[] args) {
		int[] b = { 1, 3, 5, 7, 9, 11, 13 };
		TreeNode root = BST.sortedArray2BST(b);
		TreeNode[][] arrs = getLevelArrays(root);
		
		for(TreeNode[] arr : arrs){
			for(TreeNode x : arr){
				System.out.println(x.data);
			}
		}
				
	}

	/*
	 * return level nodes array
	 * 
	 * */
	//TODO: complete the method
	public static TreeNode[][] getLevelArrays(TreeNode root) {
		return new TreeNode[][] {{root}};
	}
}
