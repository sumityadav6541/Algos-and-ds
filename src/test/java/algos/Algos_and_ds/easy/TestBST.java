package algos.Algos_and_ds.easy;

import org.junit.Test;

import algos.Algos_and_ds.commons.BST;
import algos.Algos_and_ds.commons.TreeNode;
import junit.framework.TestCase;

public class TestBST extends TestCase {
	
	@Test
	public void testSortedArray2BST(){
		int[] a = null;
		assertEquals(null, BST.sortedArray2BST(a));
	}
}
