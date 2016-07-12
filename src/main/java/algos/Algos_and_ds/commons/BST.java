package algos.Algos_and_ds.commons;

public class BST {
	public static TreeNode sortedArray2BST(int[] x) {
		if (!isSorted(x)) {
			throw new RuntimeException("Array must be a sorted array");
		}

		if (x == null || x.length == 0) {
			return null;
		}

		return convert(x, 0, x.length - 1);

	}

	private static TreeNode convert(int[] x, int left, int right) {

		int mid = left + (right - left) / 2;
		TreeNode head = new TreeNode(x[mid]);
		if (left <= mid - 1)
			head.left = convert(x, left, mid - 1);
		if (mid + 1 <= right)
			head.right = convert(x, mid + 1, right);
		return head;

	}

	private static boolean isSorted(int[] x) {
		if (x == null || x.length == 1)
			return true;

		for (int i = 1; i < x.length; i++) {
			if (x[i - 1] > x[i]) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 4, 5 };
		System.out.println(isSorted(a));

		int[] b = { 1, 3, 5, 7, 9, 11, 13 };
		inOrderTraversal(sortedArray2BST(b));
	}

	private static void inOrderTraversal(TreeNode root) {
		if (root == null)
			return;
		inOrderTraversal(root.left);
		System.out.print(root.data + " ");
		inOrderTraversal(root.right);
	}
}
