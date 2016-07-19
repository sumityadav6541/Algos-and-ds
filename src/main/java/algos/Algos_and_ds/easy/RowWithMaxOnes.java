package algos.Algos_and_ds.easy;

public class RowWithMaxOnes {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		boolean[][] arr = { { true, true, true, true }, { false, false, true, true }, { true, true, true, true },
				{ false, false, false, false } };

		System.out.println(getMaxOnes(arr));
		/*
		 * for(int i=0 ; i<4; i++) System.out.println(getFirstOneIndex(arr[i],
		 * 0, 3));
		 */
	}

	private static int getMaxOnes(boolean[][] arr) {
		int index = getFirstOneIndex(arr[0], 0, arr[0].length - 1);
		int temp;
		if (index != 0) {
			for (int j = 1; j < arr[0].length; j++) {
				temp = getFirstOneIndex(arr[j], 0, index - 1);
				if (index > temp) {
					index = temp;
					if (index == 0)
						break;
				}
			}
		}
		return arr[0].length - index;
	}

	private static int getFirstOneIndex(boolean[] b, int left, int right) {
		if (left == right) {
			if (b[left]) {
				return left;
			} else {
				return left + 1;
			}

		} else if (left < right) {
			int mid = left + (right - left) / 2;
			if (b[mid] && !b[mid - 1]) { // F T
				return mid;
			} else if (b[mid] && b[mid - 1]) { // T T
				return getFirstOneIndex(b, left, mid - 1);
			} else { // F
				return getFirstOneIndex(b, mid + 1, right);
			}
		}
		return -1;
	}
}
