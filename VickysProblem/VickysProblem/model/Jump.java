 package model;

public  class Jump{
	private int distance;
	private int time;

	public Jump(int distance, int time){
		this.distance = distance;
		this.time = time;
	}
	
	public int getDistance(){
		return this.distance;
	}
	
	public int getTime(){
		return this.time; 
	}
  
}