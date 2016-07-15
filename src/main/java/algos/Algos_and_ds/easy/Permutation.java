package algos.Algos_and_ds.easy;

public class Permutation {
	public static void main(String[] args) {
		String str = "abc";
		String t1 = new String(SortCharArray.sortChar("tes"));
		stringPermute(t1);
	}

	private static void stringPermute(String str) {
		permute(str.toCharArray(), 0, str.length() - 1);
	}
	
	// time complexity O(n!)
	private static void permute(char[] charArray, int left, int right) {
		if (left < right) {
			for (int i = left; i <= right; i++) {
				swap(charArray, left, i);
				permute(charArray, left + 1, right);
				swap(charArray, left, i);
			}
		} else {
			System.out.println(charArray);
		}
	}

	private static void swap(char[] charArray, int i, int j) {
		char temp = charArray[i];
		charArray[i] = charArray[j];
		charArray[j] = temp;
	}
}
