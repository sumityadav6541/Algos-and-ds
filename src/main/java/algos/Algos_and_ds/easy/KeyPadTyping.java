package algos.Algos_and_ds.easy;

public class KeyPadTyping {
	public static String getNumberForm(String text) {
		if(text==null)
			return null;
		
		char[] textArray = text.toCharArray();
		char[] res = new char[textArray.length];

		int temp = 0;
		for (int i = 0; i < textArray.length; i++) {
			temp = textArray[i] - 97;

			if (temp >= 0 && temp <= 2) { // a,b,c
				res[i] = 50;
			} else if (temp >= 3 && temp <= 5) { // d,e,f
				res[i] = 51;
			} else if (temp >= 6 && temp <= 8) { // g,h,i
				res[i] = 52;
			} else if (temp >= 9 && temp <= 11) {// j,k,l
				res[i] = 53;
			} else if (temp >= 12 && temp <= 14) { // m,n,o
				res[i] = 54;
			} else if (temp >= 15 && temp <= 18) { // p,q,r,s
				res[i] = 55;
			} else if (temp >= 19 && temp <= 21) { // t,u,v
				res[i] = 56;
			} else if (temp >= 22 && temp <= 25) { // w,x,y,z
				res[i] = 57;
			}
		}
		return new String(res);
	}
	public static void main(String[] args) {
		char a = 50;
		System.out.println(getNumberForm("geeksforgeeks"));
	}
}
