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

	public int getMissingNumberCount(int arr[]) {

		int missingCount = 0;
		int temp = 0;
		for (int i = 0; i < arr.length - 1; i++) {
		
			if(arr[i]+1 != arr[i+1]) {
				temp = arr[i]+1;
				do {
					missingCount++;
					temp++;
					if(temp == arr[i+1]){
						break;
					}
				}while(true);
				
			}
			
		}
		return missingCount;

	}

}
