package model;

public class GoldenVoucher extends GiftVoucher{

	@Override
	protected void createPackage() {
		gift.add(new Smartwatch());
		gift.add(new SonyTV());
		
	}

}
