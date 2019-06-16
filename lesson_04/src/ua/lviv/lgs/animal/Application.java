package ua.lviv.lgs.animal;

public class Application {

	public static void main(String[] args) {
		
		Animal a = new Animal("Вовк", 20.1, 8);
		
		System.out.println("Назва тварини = " + a.getName() + 
				", Швидкість тварини = " + a.getSpeed() + 
				"км/год, Вік тварини = " + a.getAge() +" років");
		
		a.setName("Собака");
		a.setSpeed(12.5);
		a.setAge(5);
		
		System.out.println("Назва тварини = " + a.getName() + 
				", Швидкість тварини = " + a.getSpeed() + 
				"км/год, Вік тварини = " + a.getAge() +" років");

	}

}
