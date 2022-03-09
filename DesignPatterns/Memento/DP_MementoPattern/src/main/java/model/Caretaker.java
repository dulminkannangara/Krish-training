package model;

import java.util.Stack;

public class Caretaker {

	private final Stack<MementoCart> mementoStack = new Stack<MementoCart>();

	public void addMementoCart(MementoCart memento) {
		mementoStack.push(memento);
	}

	public MementoCart getMementoCart() {
		return mementoStack.pop();
	}

}
