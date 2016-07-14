package algos.Algos_and_ds.easy;

public class MissingNumber {
	public static void main(String[] args) {
		int[] a = { 1, 3, 4, 5, 6, 7, 8, 9, 10 };
		System.out.println("Missing number is "+findMissingNumber(a));
	}

	private static int findMissingNumber(int[] a) {
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			sum += a[i];
		}

		return (a.length + 1) * (a.length + 2) / 2 - sum;
	}
}
