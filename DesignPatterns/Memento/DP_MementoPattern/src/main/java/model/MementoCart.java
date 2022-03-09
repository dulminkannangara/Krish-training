package model;

import java.util.ArrayList;

public class MementoCart {
	private final ArrayList<Product> list;

	public MementoCart(ArrayList<Product> list) {
		this.list = list;
	}
	
	public ArrayList<Product> getList() {
		return list;
	}
	
}
