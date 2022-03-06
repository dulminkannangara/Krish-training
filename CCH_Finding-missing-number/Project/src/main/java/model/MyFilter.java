package model;


public class MyFilter {

	
	public int getMissingNumber(int arr[]) {
		
		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i + 1] != arr[i] + 1) {
				return arr[i] + 1;
			}
		}

		return arr[0] - 1;

	}
	

}
