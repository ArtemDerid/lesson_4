package ua.lviv.lgs.robot;

public class Robot {

	private String speech;

	public Robot(String speech) {
		super();
		this.speech = speech;
	}

	public void work() {
		System.out.println(speech);
	}

}
