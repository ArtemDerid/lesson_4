package ua.lviv.lgs.car;

public class Helm {
	
	private int helmSize;
	private String Brand;
	
	public int getHelmSize() {
		return helmSize;
	}
	public void setHelmSize(int helmSize) {
		this.helmSize = helmSize;
	}
	public String getBrand() {
		return Brand;
	}
	public void setBrand(String brand) {
		Brand = brand;
	}
	
	public Helm(int helmSize, String brand) {
		super();
		this.helmSize = helmSize;
		Brand = brand;
	}
	
	public int increaseHelmSize() {
		 return this.helmSize+3;
	}
	public void changeBrand(String newBrand) {
		this.Brand = newBrand;
	} 
	
	@Override
	public String toString() {
		return "Helm [helmSize=" + helmSize + ", Brand=" + Brand + "]";
	}
	
	

}
