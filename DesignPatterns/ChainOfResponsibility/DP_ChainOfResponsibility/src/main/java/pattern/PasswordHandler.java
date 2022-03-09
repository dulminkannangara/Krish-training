package pattern;

import model.User;

public class PasswordHandler extends Handler{

	@Override
	public void process(User user) {
		if(user.getPassword()==null) {
			System.out.println("enter password!");
		}else if(!chekUpercase(user.getPassword())){
			System.out.println("Password must include at least one uppercase letter !");
		}else if(!chekSpecialCharacter(user.getPassword())) {
			System.out.println("Password must include at least one Special Character !");
		}else if(user.getPassword().length()<6) {
			System.out.println("Password must include more than 6 Characters !");
		}else {
			System.out.println("Success !");
		}
		
	}
	
	private boolean chekUpercase(String password) {
		
		for(int i =0; i < password.length(); i++) {
			if(Character.isUpperCase(password.charAt(i))) {
				return true;
			}
		}
		return false;
	}
	
	private boolean chekSpecialCharacter(String password) {
		
		for(int i =0; i < password.length(); i++) {
			if (!(password.charAt(i) >= 'A' && password.charAt(i) <= 'Z') && !(password.charAt(i) >= 'a' && password.charAt(i) <= 'z')) {
		        return true;
		    }
		}
		return false;
	}
	
	
	

}
