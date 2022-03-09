package model;

public class PlatinumVoucher extends GiftVoucher{

	@Override
	protected void createPackage() {
		gift.add(new SonyTV());
		gift.add(new IPhone());
		gift.add(new Smartwatch());
		
	}

}
