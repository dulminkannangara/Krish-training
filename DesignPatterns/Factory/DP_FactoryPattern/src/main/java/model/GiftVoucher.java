package model;

import java.util.ArrayList;

public abstract class GiftVoucher {

	protected ArrayList<Gift> gift = new ArrayList<Gift>();
	
	protected abstract void createPackage();
	
	public GiftVoucher() {
		createPackage();
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Includes of Gift : "+gift;
	}
	
}
