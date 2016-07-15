package algos.Algos_and_ds.easy;

public class BitsAndBinaries {
	public static void main(String[] args) {
		int n=15;
		for(int i=1;i<=n;i++){
			toBinary(i);
		}
	}

	// O(log(x)) running time
	private static void toBinary(int x) {
		int n = SetBits.getTotalBits(x); // takes O(log(x)) time
		
		boolean[] bit = new boolean[n];
		
		for(int i=n-1;i>=0;i--){  // takes O(log(x)) time (since n = log(x))
			bit[i] = x%2!=0;
			x/=2;
		}
		
		for(int i=0;i<n;i++)
			System.out.print(bit[i] ? 1 : 0);
		
		System.out.println();
	}
}
