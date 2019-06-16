package ua.lviv.lgs.car;

public class Cab {
	
	private String cabType;

	public String getCabType() {
		return cabType;
	}

	public void setCabType(String cabType) {
		this.cabType = cabType;
	}

	public Cab(String cabType) {
		super();
		this.cabType = cabType;
	}
	
	public void ChangeCabType(String changedType) {
		this.cabType = changedType;
	}

	@Override
	public String toString() {
		return "Cab [cabType=" + cabType + "]";
	}
	
	
}
