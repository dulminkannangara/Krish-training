package controller;

import model.Factory;
import model.GiftVoucher;
import model.VoucherTypes;

public class App {

	public static void main(String args[]) {
		
		GiftVoucher voucher1 = Factory.getVoucher(VoucherTypes.GOLDEN);
		System.out.println(voucher1);

		GiftVoucher voucher2 = Factory.getVoucher(VoucherTypes.PLATINUM);
		System.out.println(voucher2);
		
	}	
	
}
