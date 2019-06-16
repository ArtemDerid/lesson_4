package ua.lviv.lgs.robot;

public class Application {

	public static void main(String[] args) {
		Robot r = new Robot("я Robot Ц € просто працюю");
		CoffeRobot cr = new CoffeRobot("я CoffeRobot Ц € варю каву");
		RobotDancer rd = new RobotDancer("я RobotDancer Ц € просто танцюю");
		RobotCoocker rc = new RobotCoocker("я RobotCoocker Ц € просто готую");
		
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
