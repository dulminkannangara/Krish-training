package model;
import java.util.HashMap;

public  class Frog{
	private String name;
	private HashMap<Integer,Jump> jump;
	
	public Frog(String name){ 
		this.name = name;
		this.jump = new HashMap<>();
	}

	public void addJump(int distance, int time){
		jump.put(jump.size() +1,new Jump(distance, time));
	}

	public Jump getJump(int key){
		return this .jump.get(key);
	} 
}