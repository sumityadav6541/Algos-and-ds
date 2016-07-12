package algos.Algos_and_ds.easy;

public class NextElement {
	public static int[] immediateSmallerElement(int[] x){
		
		int[] res = new int[x.length];
		
		for(int i=0; i<x.length-1; i++){
			res[i] = x[i] > x[i+1] ? x[i+1]:-1;
		}
		
		res[x.length-1] = -1;
		
		return res;
	}
	
	public static int[] nextGreatestElement(int[] x){
		int[] res = new int[x.length];
		
		res[x.length-1] = -1;
		int max = x[x.length-1];
		
		for(int i=x.length-2; i>=0; i--){
			res[i] = x[i] > max ? -1 : max;
			max = x[i] > max ? x[i] : max;
		}
		
		return res;
	}
	
	public static void main(String[] args) {
		//int[] a = {4, 2, 1, 5, 3};
		int[] a = {16, 17, 4, 3, 5, 2};
		for(int x: a)
			System.out.print(x+" ");
		System.out.println();
		/*for(int x: immediateSmallerElement(a))
			System.out.print(x+" ");*/
		for(int x: nextGreatestElement(a))
			System.out.print(x+" ");
	}
}
