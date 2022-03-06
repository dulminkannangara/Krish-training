package controller;

import java.util.HashMap;
import java.util.Scanner;

import model.MyBubbleSort;
import model.MyFilter;

public class App {

	public static void main(String args[]) {

		Scanner scn = new Scanner(System.in);
		System.out.println("~ ~ ~ ~ ~ Get Character Count ~ ~ ~ ~ ~\n");
		System.out.print("Enter word : ");
		String txt = scn.next();

		MyBubbleSort sort = new MyBubbleSort();
		char output[] = sort.sort(txt);

		MyFilter filter = new MyFilter();
		HashMap<Character, Integer> data = filter.getCharList(output);
		for (char c : filter.getUnicCharArray()) {
			System.out.println(c + " -> " + data.get(c));
		}
		scn.close();

	}

}
