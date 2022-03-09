package pattern;

import model.User;

public class NameHandler extends Handler{

	@Override
	public void process(User user) {
		if(user.getName()==null){
			System.out.println("User name cannot be null !");
		}else if(user.getName().length() > 20){
			System.out.println("User name cannot have more than 20 characters !");
		}else {
			next.process(user);	
		}
	}

}
