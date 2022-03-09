package model;

public class Car extends Vehicle{

	public Car(String model) {
		super(model);
	}

	@Override
	public Vehicle getCloneVehicle() {
		Car c =new Car(getVehicleModel());
		c.setTyre_size(getTyre_size());
		return c;
	}
	@Override
	public String toString() {
		return "Car : "+getVehicleModel();
	}

}
