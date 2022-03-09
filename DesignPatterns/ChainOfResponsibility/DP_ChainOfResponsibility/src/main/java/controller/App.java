package controller;

import model.User;
import pattern.MobileHandler;
import pattern.NameHandler;
import pattern.PasswordHandler;

public class App {

	public static void main(String args[]) {
		NameHandler nameHandler = new NameHandler();
		MobileHandler mobileHandler = new MobileHandler();
		PasswordHandler passwordHandler = new PasswordHandler();	
		
		nameHandler.setNext(mobileHandler);
		mobileHandler.setNext(passwordHandler);
		
		User user1 = new User();
		System.out.println("Without adding any values");
		nameHandler.process(user1);
		
		System.out.println("\nset Name : Dulmin1111111111111111111111111111111111111111111");
		user1.setName("Dulmin1111111111111111111111111111111111111111111");
		nameHandler.process(user1);
		
		System.out.println("\nsetName : Dulmin");
		user1.setName("Dulmin");
		nameHandler.process(user1);
		
		System.out.println("\nset Mobile : 07612");
		user1.setMobile("07612");
		nameHandler.process(user1);
		
		System.out.println("\nset Mobile : 0761234567");
		user1.setMobile("0761234567");
		nameHandler.process(user1);
		
		System.out.println("\nset Password : abc");
		user1.setPassword("abc");
		nameHandler.process(user1);
		
		System.out.println("\nset Password : abcA");
		user1.setPassword("abcA");
		nameHandler.process(user1);
		
		System.out.println("\nset Password : 1a@A");
		user1.setPassword("1a@A");
		nameHandler.process(user1);
		
		System.out.println("\nset Password 123abc@ABC");
		user1.setPassword("123abc@ABC");
		nameHandler.process(user1);
		
		
	}
	
}
