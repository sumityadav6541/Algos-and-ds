package algos.Algos_and_ds.easy;

public class Shape {

	/*
	 * from any vertex 'v1' find square of distance(d1, d2, d3) of all other nodes v2, v3 and v4,
	 * if any two distances are equal(say d1==d2) and third one must be equal to any previous one's double(d3==2*d1). 
	 * if above condition satisfies then if distance(v2, v3) is equals to d3.
	 * we can say that given points (v1,v2,v3,v4) forms a square.
	 * */
	public static boolean isSquare(int x1, int y1, int x2, int y2, int x3, int y3, int x4, int y4){
		
		int d1,d2,d3;
		d1 = getDistanceSquare(x1, y1, x2, y2);
		d2 = getDistanceSquare(x1, y1, x3, y3);
		d3 = getDistanceSquare(x1, y1, x4, y4);
		
		if(d1==d2 && d3 == 2*d1)
			return getDistanceSquare(x2, y2, x3, y3) == d3;
		else if(d1==d3 && d2 == 2*d1)
			return getDistanceSquare(x2, y2, x4, y4) == d2;
		else if(d2==d3 && d1==2*d2)
			return getDistanceSquare(x3, y3, x4, y4) == d1;
		return false;

	}
	
	/* int[] rec1 = {x1 , y1, x2 , y2}
	 * */
	public static boolean isRectangleOverlaps(int[] rec1, int[] rec2){
		if(rec1[0]> rec2[2] || rec2[0] > rec1[2] )// x1 > x4 or x3 > x2
			return false;
		
		else if(rec1[3]> rec2[1] || rec2[3] > rec1[1] )// y2 > y3 or y4 > y1
			return false;
		
		return true;
	}

	private static int getDistanceSquare(int x1, int y1, int x2, int y2) {
		return (x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2);
	}
	
	//TODO: write unit tests for the above methods
	public static void main(String[] args) {
		// test cases for isSquare
		System.out.println(isSquare(0, 0, 0, 10, 10, 10, 10, 0)); // it should be a square
		System.out.println(isSquare(20, 20, 20, 10, 10, 20, 10, 10)); // it should be a square
		System.out.println(isSquare(10, 10, 10, 10, 20, 10, 20, 30)); // not a square

		// test cases for isRectangleOverlaps
		System.out.println(isRectangleOverlaps(new int[] {0,10,10,0}, new int[] {5,5,15,0})); // overlaps
		System.out.println(isRectangleOverlaps(new int[] {0,2,1,1}, new int[] {-2,-3,0,2}));  // do not overlaps
	}
}