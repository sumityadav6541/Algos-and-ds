package algos.Algos_and_ds.easy;

import java.util.Arrays;

public class SortCharArray {
	public static void main(String[] args) {
		System.out.println("I am the main method of the SortCharArray class ");
		System.out.println(sortChar("test"));
	}
	
	// modify it with your implemented Dual Pivot Quick Sort
	public static char[] sortChar(String string) {
		char[] array = string.toCharArray();
		Arrays.sort(array);
		return array;
	}
}
