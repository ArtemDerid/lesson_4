package ua.lviv.lgs.car;

public class Wheel {
	
	private double diameter;
	private String spec;
	private String manufacturer;
	
	public double getDiameter() {
		return diameter;
	}
	public void setDiameter(double diameter) {
		this.diameter = diameter;
	}
	public String getSpec() {
		return spec;
	}
	public void setSpec(String spec) {
		this.spec = spec;
	}
	public String getManufacturer() {
		return manufacturer;
	}
	
	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}
	
	public Wheel(double diameter, String spec, String manufacturer) {
		super();
		this.diameter = diameter;
		this.spec = spec;
		this.manufacturer = manufacturer;
	}
	
	public double largeWheel() {
		return this.diameter*2;
	}
	
	public void changeManufacturer(String newManufacturer) {
		this.manufacturer = newManufacturer;
	} 
	
	@Override
	public String toString() {
		return "Wheel [diameter=" + diameter + ", spec=" + spec + ", manufacturer=" + manufacturer + "]";
	}
	
	

}
