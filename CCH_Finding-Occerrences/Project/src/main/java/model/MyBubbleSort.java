package model;

public class MyBubbleSort {

	public char[] sort(String text) {
		text = text.toLowerCase();
		char arr[] = text.toCharArray();
		
		int length = arr.length;
		char temp = 0;

		for (int i = 0; i < length - 1; i++) {
			for (int j = 0; j < length - 1 - i; j++) {
				
				if(arr[j]>arr[j+1]){
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
				
			}

		}
		return arr;
	}


}
