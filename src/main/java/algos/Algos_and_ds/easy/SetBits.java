package algos.Algos_and_ds.easy;

public class SetBits {
	public static void main(String[] args) {
		//System.out.println(getSetBits(15));
		System.out.println(getTotalBits(4));
		System.out.println(getBitsSumFrom1ToN(4));// should be equal to 5
		System.out.println(getBitsSumFrom1ToN(17));// should be equal to 35
	}

	private static int getBitsSumFrom1ToN(int i) {
		
		int n = getTotalBits(i);
		int lowerBound = (int)Math.pow(2, n-1);
		
		int sum = 0;
		for(int j =i; j >= lowerBound; j--){
			sum+= getSetBits(j);
		}
		return (int) (sum + (n-1)*Math.pow(2, n-2));
	}

	private static int getTotalBits(int i) {
		int count = 0;

		while (i > 0) {
			count++;
			i = i >> 1;
		}
		return count;
	}

	private static int getSetBits(int i) {
		int count = 0;

		while (i > 0) {
			if ((i & 1) == 1)
				count++;
			i = i >> 1;
		}
		return count;
	}

}
