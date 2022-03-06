package controller;

import java.util.Scanner;
import model.MyBubbleSort;
import model.MyFilter;

public class App {

	public static void main(String args[]) {
		Scanner scn = new Scanner(System.in);		
		MyBubbleSort sorting = new MyBubbleSort();
		MyFilter filter = new MyFilter();

		System.out.println("~ ~ ~ ~ ~ ~ ~ ~ Find Missing Number ~ ~ ~ ~ ~ ~ ~ ~\n");
		System.out.println("Enter number sequence (Eg : 10,1,2,22,11)");
		String input = scn.next();
		int sortArr[] = sorting.sort(input);
		if(sortArr==null) {
			System.out.println("\nInvalid Number sequence");
			System.out.println("Enter number sequence again (Eg : 10,1,2,22,11)");
		}
		
		while (sortArr == null && scn.hasNext()) {
			input = scn.next();
			sortArr = sorting.sort(input);
			if(sortArr != null) {
				break;
			}
			System.out.println("\nInvalid Number sequence");
			System.out.println("Enter number sequence again (Eg : 10,1,2,22,11)");
		
		}
		scn.close();

		int missing_num = filter.getMissingNumber(sortArr);
		System.out.println("\n~ ~ ~ Answer ~ ~ ~");
		if (missing_num == sortArr[0] - 1) {
			System.out.println(
					"In this sequence, first or last number can be missing! \nIf missing number is First number -> First Missing Number is "
							+ missing_num + "\nIf missing number is Last number -> Last Missing Number is "
							+ (sortArr[sortArr.length - 1] + 1));
		} else {
			System.out.println("Number " + missing_num + " is missing from the sequence!");
		}

	}

}
