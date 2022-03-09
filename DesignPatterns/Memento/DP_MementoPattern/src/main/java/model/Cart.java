package model;

import java.util.ArrayList;

public class Cart {

	private ArrayList<Product> list = new ArrayList<Product>();
	private final Caretaker caretaker = new Caretaker();
	
	public void addProduct(Product product) {
		list.add(product);
	}
	
	public void removeProduct(Product product) {
		list.remove(product);
	}

	public void save() {
		caretaker.addMementoCart(new MementoCart((ArrayList<Product>)list.clone()));
	}
	
	public void undo() {
		if(!list.isEmpty()){
			list = caretaker.getMementoCart().getList();	
		}else {
			System.out.println("Cart is empty! You can't undo!");
		}
		
	}

	@Override
	public String toString() {
		return "Cart [list=" + list + "]";
	}
	
	
}
