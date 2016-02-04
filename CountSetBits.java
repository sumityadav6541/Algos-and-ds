public class CountSetBits{
	static int countSetBits(int n){	//Brian Kernighan’s Algorithm:  http://www.geeksforgeeks.org/count-set-bits-in-an-integer/
		int count=0;
		while(n>0){
			n = n&(n-1);
			count++;
		}
		return count;
	}
	public static void main(String[] args){
		System.out.println("number of set Bits in 8 :"+countSetBits(8));
		System.out.println("number of set Bits in 16 :"+countSetBits(16));
		System.out.println("number of set Bits in 15 :"+countSetBits(15));
		System.out.println("number of set Bits in 31 :"+countSetBits(31));
	}
}