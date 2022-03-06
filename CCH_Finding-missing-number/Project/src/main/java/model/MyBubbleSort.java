package model;

public class MyBubbleSort {

	public int[] sort(String test_arr) {
		int arr[] = getIntArr(test_arr);
		if (arr == null) {
			return arr;
		}
		int length = arr.length;
		int temp = 0;

		for (int i = 0; i < length - 1; i++) {
			for (int j = 0; j < length - 1 - i; j++) {
				if (arr[j] > arr[j + 1]) {
					temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}

		}
		return arr;
	}

	private int[] getIntArr(String test) {

		String splityArr[] = test.split(",");
		int arr[] = null;

		if (splityArr.length == 1) {
			return arr;
		}
		arr = new int[splityArr.length];

		for (int i = 0; i < splityArr.length; i++) {
			try {
				arr[i] = Integer.parseInt(splityArr[i]);
			} catch (Exception e) {
				arr = null;
				break;
			}
		}
		return arr;
	}

}
