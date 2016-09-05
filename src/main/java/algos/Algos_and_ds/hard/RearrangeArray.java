package algos.Algos_and_ds.hard;

import java.util.Arrays;

public class RearrangeArray {
	public static void main(String[] args) {
		int[] a = {1,0};
		rearrange(a);
		System.out.println(Arrays.equals(new int[] {0, 1},a));
		
		int[] b = {4 , 0 , 2 , 1, 3};
		rearrange(b);
		System.out.println(Arrays.equals(new int[] {3,4,2,0,1} , b));
		
		int[] c = {3,2,0,1};
		rearrange(c);
		System.out.println(Arrays.equals(new int[] {1,0,3,2} , c));
		
	}

	private static void rearrange(int[] a) {
		
	}

	private static void rearrange_using_Array(int[] a) {
		int[] temp = new int[a.length];
		for(int i=0;i<a.length;i++){
			temp[i] = a[a[i]];
		}
		for(int i=0;i<a.length;i++){
			a[i] = temp[i];
		}
	}
}
