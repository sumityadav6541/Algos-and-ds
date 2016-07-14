package algos.Algos_and_ds.easy;

public class Permutation {
	public static void main(String[] args) {
		String str = "abc";
		stringPermute(str);
	}

	private static void stringPermute(String str) {
		permute(str.toCharArray(),0,str.length()-1);
	}

	private static void permute(char[] charArray, int left, int right) {
		if(left < right){
			for(int i = left; i<=right;i++){
				swap(charArray,left,i);
				permute(charArray, left, i);
			}
		}
		else{
			System.out.println(charArray);
		}
	}
}
