package ua.lviv.lgs.amphibia;

public class Main {
	public static void main(String[] args) {
		
//		Frog f = new Frog();
		Amphibia f = (Amphibia) new Frog(); // якщо я правильно розумію, 
											//це приведення до типу Amphibia
		
		f.eat();
		f.sleep();
		f.swim();
		f.walk();
	}
}
