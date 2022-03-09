package pattern;

import model.User;

public abstract class Handler {

	protected Handler next;

	public void setNext(Handler next) {
		this.next = next;
	}
	
	public abstract void process(User user);
	
	
}
