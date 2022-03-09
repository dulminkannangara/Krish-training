package pattern;

import model.User;

public class MobileHandler extends Handler{

	@Override
	public void process(User user) {
		if(user.getMobile()==null) {
			System.out.println("Enter mobile number !");
		}else if(user.getMobile().length()!=10){
			System.out.println("Invalid mobile number ! ");
		}else {
			next.process(user);
		}
		
	}

	
	
	
}
