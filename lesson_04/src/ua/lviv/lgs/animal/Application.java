package ua.lviv.lgs.animal;

public class Application {

	public static void main(String[] args) {
		
		Animal a = new Animal("����", 20.1, 8);
		
		System.out.println("����� ������� = " + a.getName() + 
				", �������� ������� = " + a.getSpeed() + 
				"��/���, ³� ������� = " + a.getAge() +" ����");
		
		a.setName("������");
		a.setSpeed(12.5);
		a.setAge(5);
		
		System.out.println("����� ������� = " + a.getName() + 
				", �������� ������� = " + a.getSpeed() + 
				"��/���, ³� ������� = " + a.getAge() +" ����");

	}

}
