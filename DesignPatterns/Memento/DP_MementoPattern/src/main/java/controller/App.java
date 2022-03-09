package controller;

import model.Cart;
import model.Product;

public class App {
	public static Cart cart = new Cart();

	public static void main(String args[]) {

		Product iphone = new Product("iphone 13");
		System.out.println("~ ~ ~ Add Iphone to the cart ~ ~ ~ ");
		addProduct(iphone);
		System.out.println(cart);
		
		Product headset = new Product("headset");
		System.out.println("\n~ ~ ~ Add Headset to the cart ~ ~ ~ ");
		addProduct(headset);
		System.out.println(cart);
		
		Product audioCable = new Product("Audio Cable");
		System.out.println("\n~ ~ ~ Add Audio Cable to the cart ~ ~ ~ ");
		addProduct(audioCable);
		System.out.println(cart);
		
		System.out.println("\n~ ~ ~ Remove Hedset from the cart ~ ~ ~ ");
		removeProduct(headset);
		System.out.println(cart);
		
		System.out.println("\n~ ~ ~ Undo ~ ~ ~ ");
		cart.undo();
		System.out.println(cart);
		System.out.println("\n~ ~ ~ Undo ~ ~ ~ ");
		cart.undo();
		System.out.println(cart);
		System.out.println("\n~ ~ ~ Undo ~ ~ ~ ");
		cart.undo();
		System.out.println(cart);
		System.out.println("\n~ ~ ~ Undo ~ ~ ~ ");
		cart.undo();
		System.out.println(cart);
		System.out.println("\n~ ~ ~ Undo ~ ~ ~ ");
		cart.undo();
		System.out.println("\n~ ~ ~ Undo ~ ~ ~ ");
		cart.undo();
		
		
	}
	
	private static void addProduct(Product product) {
		cart.save();
		cart.addProduct(product);
		
	} 
	private static void removeProduct(Product product) {
		cart.save();
		cart.removeProduct(product);
		
	} 	
	
	
}
