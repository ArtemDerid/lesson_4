package ua.lviv.lgs.robot;

public class Application {

	public static void main(String[] args) {
		Robot r = new Robot("� Robot � � ������ ������");
		CoffeRobot cr = new CoffeRobot("� CoffeRobot � � ���� ����");
		RobotDancer rd = new RobotDancer("� RobotDancer � � ������ ������");
		RobotCoocker rc = new RobotCoocker("� RobotCoocker � � ������ �����");
		
		r.work();
		cr.work();
		rd.work();
		rc.work();
		
		Robot [] arrayRobot = {r, cr, rd, rc};
		for(int i = 0; i<4; i++) {
			arrayRobot[i].work();
		}

	}

}
