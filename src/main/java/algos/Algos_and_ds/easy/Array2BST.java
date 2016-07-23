package algos.Algos_and_ds.easy;

import algos.Algos_and_ds.commons.BST;

public class Array2BST {
	public static void main(String[] args) {
		int[] b = { 1, 3, 5, 7, 9, 11, 13,19 };
		BST.inOrderTraversal(BST.sortedArray2BST(b));
	}
}
