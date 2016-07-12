package algos.Algos_and_ds.easy;

import java.util.Arrays;

/*
 * used two counters approach for increasing and decreasing the computed product values
 * */
public class Given_products {
	public static boolean isProdPresent(int[] x, int prod){
		Arrays.sort(x); //use in-built method to sort the array
		int i=0, j=x.length-1;
		while(i<j){
			if(x[i]*x[j] == prod)
				return true;
			else if(x[i]*x[j] < prod)
				i++;
			else
				j--;
		}
		return false;
	}
	public static void main(String[] args) {
		int[] a = {5,3,1,2,4};
		System.out.println(isProdPresent(a, 5));
	}
}
