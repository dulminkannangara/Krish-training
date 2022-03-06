package model;

import java.util.ArrayList;
import java.util.HashMap;

public class MyFilter {

	private HashMap<Character, Integer> data = new HashMap<Character, Integer>();
	private ArrayList<Character> unicCharArr = new ArrayList<Character>();

	public HashMap<Character, Integer> getCharList(char arr[]) {

		for (int i = 0; i < arr.length; i++) {
			
			if(data.get(arr[i])!=null){
				data.put(arr[i], data.get(arr[i])+1);
			}else {
				unicCharArr.add(arr[i]);
				data.put(arr[i], 1);
			}
		}
		
		return data;
	}
	
	public ArrayList<Character> getUnicCharArray(){
		return unicCharArr;
		
	}

}
