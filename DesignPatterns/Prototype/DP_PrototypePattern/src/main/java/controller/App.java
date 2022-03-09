package controller;

import model.Bus;
import model.Car;

public class App {

	public static void main(String args[]) {

		Car car = new Car("BMW");
		car.setTyre_size(225 - 90);
		Car car2 = (Car) car.getCloneVehicle();
		System.out.println("\n\n~ ~ ~ ~ ~ ~ Without Useing Inbuild Cloneable Interface in Java ~ ~ ~ ~ ~ ~");
		System.out.println("car object -> Model:" + car + " | Tyre Size:" + car.getTyre_size());
		System.out.println("car2 object -> Model:" + car2 + " | Tyre Size:" + car2.getTyre_size());

		car2.setVehicleModel("Mercedes-Benz");
		car2.setTyre_size(255);

		System.out.println("\ncar object -> Model:" + car + " | Tyre Size:" + car.getTyre_size());
		System.out.println("car2 object -> Model:" + car2 + " | Tyre Size:" + car2.getTyre_size());

		Bus bus = new Bus("TATA");
		bus.setTyre_size(1512);
		Bus bus2 = (Bus) bus.getCloneVehicle();
		System.out.println("\n\n~ ~ ~ ~ ~ ~ Useing Inbuild Cloneable Interface in Java ~ ~ ~ ~ ~ ~");
		System.out.println("\nbus object -> Model:" + bus + " | Tyre Size:" + bus.getTyre_size());
		System.out.println("bus2 object -> Model:" + bus2 + " | Tyre Size:" + bus2.getTyre_size());

		bus2.setVehicleModel("ISUZU");
		bus2.setTyre_size(1400);

		System.out.println("\nbus object -> Model:" + bus + " | Tyre Size:" + bus.getTyre_size());
		System.out.println("bus2 object -> Model:" + bus2 + " | Tyre Size:" + bus2.getTyre_size());

	}

}
