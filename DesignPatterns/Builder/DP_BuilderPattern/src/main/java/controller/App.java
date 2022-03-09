package controller;

import model.Animal;

public class App {

	public static void main(String args[]) {
		
		Animal.Builder builder = new Animal.Builder();
		
		Animal dog = builder.setName("rayan").setCategory("bullmastiff").
				setColour("brown").setNumOfLegs(4).setLifetime(10).build();
		System.out.println("\n\n"+dog+"\n\n");
		
		
	}	
	
}
