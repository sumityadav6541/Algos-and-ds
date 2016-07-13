package algos.Algos_and_ds.easy;

public class SquareRoot {

	public static void main(String[] args) {
		for (int i = 0; i <= 36; i++)
			System.out.print(floorSqrt(i) + " ");
		
		System.out.println();
		
		for (int i = 0; i <= 36; i++)
			System.out.print(floorSqrtFaster(i) + " ");
	}

	// running time complexity O(n*(1/2))
	private static int floorSqrt(int n) {
		for (int i = 0; i <= n; i++) {
			if (i * i >= n)
				return i * i == n ? i : i - 1;
		}
		return -1;
	}

	// running time complexity O(log(n))
	private static int floorSqrtFaster(int n) {
		int left = 0;
		int right = n;
		int mid;
		
		while(left <= right){
			mid = left + (right - left)/2;
			
			if(mid*mid == n)
				return mid;
			else if(mid*mid < n)
				left = mid+1;
			else
				right = mid-1;
		}
		
		return right;
	}
}
