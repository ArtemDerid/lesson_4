package ua.lviv.lgs.car;

public class Application {

	public static void main(String[] args) {
		
		Cab cab = new Cab("Pickup");
		Helm helm = new Helm(10, "Round");
		Wheel wheel = new Wheel(15.3, "winter", "GoodYear");
		
		Car car = new Car("BMW", 8, cab, helm, wheel);
		System.out.println(car);
		
		car.currentAge(5);
		car.setName("Mercedes");
		cab.ChangeCabType("Hatcback");
		helm.changeBrand("Circle");
		wheel.changeManufacturer("BadYear");
		
		System.out.println(car);
		System.out.println(helm.increaseHelmSize());
		System.out.println(wheel.largeWheel());

	}

}
