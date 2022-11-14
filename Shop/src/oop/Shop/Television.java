package oop.Shop;

abstract public class Television implements ElectronicDevice {
	private String theMake;
	private String theModel;
	
	public Television(String aMake, String aModel){
		this.theMake = aMake;
		this.theModel = aModel;
	}
	
	@Override
	public String getTheMake() {
		return theMake;
	}
	
	@Override
	public String getTheModel() {
		return theModel;
	}
	
	@Override
	public String toString() {
		return getTheMake() + " " + getTheModel();
	}
}

class Plasma extends Television implements HighlyDesirable {

	Plasma(String aMake, String aModel) {
		super(aMake, aModel);
	}
	
	@Override
	public void turnOn() {
		System.out.println("Plasma::turnOn()"); 
	}
	
	@Override
	public void turnOff() {
		System.out.println("Plasma::turnOff()"); 
	}
}

class Led extends Television{

	Led(String aMake, String aModel) {
		super(aMake, aModel);
	}
	
	@Override
	public void turnOn() {
		System.out.println("Led::turnOn()"); 
	}
	
	@Override
	public void turnOff() {
		System.out.println("Led::turnOff()"); 
	}
}