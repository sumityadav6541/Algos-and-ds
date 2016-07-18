package algos.Algos_and_ds.easy;

public class PrimePairs {
	public static void main(String[] args) {
		// primePairs(15);
		int i = 1, j = 1;
		i += j + 1;
		System.out.println(i);
		for (boolean x : getAllPrimes(17))
			System.out.print(x + " ");
		primePairs(42);
	}

	/*
	 * Implementation of Sieve of Eratosthenes(useful only if n is smaller than
	 * 10 million) for computing all prime numbers below a given number
	 */
	private static boolean[] getAllPrimes(int n) {

		boolean[] sieve = new boolean[n];// create a boolean array of size n and
											// initialize it with true
		for (int i = 0; i < sieve.length; i++)
			sieve[i] = true;

		sieve[0] = false; // 1 is not prime therefore set it to false

		for (int i = 1; i * i <= n; i++) { // from 2(i=1) to square root(i*i<)
											// of the number
			if (sieve[i]) { // if the number is prime then only
				for (int j = 2 * i + 1; j < n; j += i + 1) { // check all the
																// numbers with
																// step-size i
					if ((j + 1) % (i + 1) == 0) {
						sieve[j] = false; // if divisible set them to false
					}
				}
			}
		}

		return sieve;
	}
	
	/*
	 * all smaller or equal product prime pairs of a number
	 * 
	 * */
	private static void primePairs(int n) {
		boolean[] sieve = getAllPrimes(n);
		System.out.println();
		for (int i = 0; i < sieve.length; i++) {
			if (sieve[i]) {
				for (int j = 0; j < sieve.length; j++) {
					if (sieve[j] && (i+1)*(j+1)<=n ) {
						System.out.println((i+1)+" , "+(j+1));
					}
				}
			}
		}

	}

}
