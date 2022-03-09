package model;

public class Factory {

	public static GiftVoucher getVoucher(VoucherTypes type) {
		switch (type) {
		case GOLDEN:
			return new GoldenVoucher();

		case PLATINUM:
			return new PlatinumVoucher();

		default:
			return null;
		}
	}

}
