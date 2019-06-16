package ua.lviv.lgs.car;

public class Car {
	
	private String name;
	private int age;
	private Cab cab;
	private Helm helm;
	private Wheel wheel;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Cab getCab() {
		return cab;
	}
	public void setCab(Cab cab) {
		this.cab = cab;
	}
	public Helm getHelm() {
		return helm;
	}
	public void setHelm(Helm helm) {
		this.helm = helm;
	}
	public Wheel getWheel() {
		return wheel;
	}
	public void setWheel(Wheel wheel) {
		this.wheel = wheel;
	}
	
	public Car(String name, int age, Cab cab, Helm helm, Wheel wheel) {
		super();
		this.name = name;
		this.age = age;
		this.cab = cab;
		this.helm = helm;
		this.wheel = wheel;
	}
	
	public int currentAge(int newAge) {
		return this.age = newAge;
	}
	
	@Override
	public String toString() {
		return "Car [name=" + name + ", age=" + age + ", cab=" + cab + ", helm=" + helm + ", wheel=" + wheel + "]";
	}
	
	

}
