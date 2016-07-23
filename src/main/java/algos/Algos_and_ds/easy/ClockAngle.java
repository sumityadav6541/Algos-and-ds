package algos.Algos_and_ds.easy;

public class ClockAngle {
	public static int getAngle(int hour, int min){
		min = min==60 ? 0:min;
		
		int minAngle = (int)(((double)min/60)*360);
		int hourAngle = (int)(((double)hour/12)*360) + (int)(0.5*min);
		minAngle = getSmallerAngle(minAngle);
		hourAngle = getSmallerAngle(hourAngle);
		return maxDiff(hourAngle,minAngle);
	}
	
	private static int maxDiff(int hourAngle, int minAngle) {
		return hourAngle > minAngle ? hourAngle-minAngle : minAngle-hourAngle;
	}

	private static int getSmallerAngle(int angle) {
		return angle <= 180 ? angle : 360-angle;
	}

	public static void main(String[] args) {
		System.out.println(getAngle(9,60));
		System.out.println(getAngle(3,30));
	}
}
