package model;

public class Bus extends Vehicle implements Cloneable{
	public Bus(String name) {
		super(name);
	}

	@Override
	public Vehicle getCloneVehicle() {
		Vehicle v=null;
		try {
			v = (Vehicle)this.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return v;
	}
	
	@Override
	public String toString() {
		return "Bus : "+getVehicleModel();
	}

}
