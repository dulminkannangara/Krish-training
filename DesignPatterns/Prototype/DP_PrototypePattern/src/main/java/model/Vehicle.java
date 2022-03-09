package model;

public abstract class Vehicle {
	private String model;
	private int tyre_size;

	public Vehicle(String model) {
		setVehicleModel(model);
	}

	public String getVehicleModel() {

		return model;
	}

	public void setVehicleModel(String model) {

		this.model = model;
	}
	
	

	public int getTyre_size() {
		return tyre_size;
	}

	public void setTyre_size(int tyre_size) {
		this.tyre_size = tyre_size;
	}

	public abstract Vehicle getCloneVehicle();
}
