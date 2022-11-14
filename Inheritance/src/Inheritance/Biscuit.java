package Inheritance;

public class Biscuit {
	private static int getNumberOfBiscuits;
	private int weight;
	private String brand;
	private String maker;
	
	public Biscuit() {
		this.getNumberOfBiscuits = getNumberOfBiscuits;
		this.weight = weight;
		this.brand = brand;
		this.maker = maker;
		getNumberOfBiscuits++;
	}
	
	public Biscuit(String brand, String maker, int weight) {
		this.weight = weight;
		this.brand = brand;
		this.maker = maker;
		getNumberOfBiscuits++;
	}
	
	public String getBrand() {
		return this.brand;
	}
	
	public void setBrand(String aBrand) {
		this.brand = aBrand;
	}
	
	public static int getNumberOfBiscuits() {
		return getNumberOfBiscuits;
	}
	
	public int getWeight() {
		return this.weight;
	}
	
	public void setWeight(int newWeight) {
		this.weight = newWeight;
	}
	
	public String getMaker() {
		return this.maker;
	}
	
	public void setMaker(String aMaker) {
		this.maker = aMaker;
	}
	
	@Override
	public String toString() {
		return "[Maker=" + this.maker + " brand=" + this.brand + " weight=" + this.weight + "]";
	}
	
	public Boolean isOutOfDate() {
		return true;
	}
	

}
