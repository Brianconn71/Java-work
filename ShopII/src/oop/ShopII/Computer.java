package oop.ShopII;

abstract class Computer implements ElectronicDevice {
	private String theMake;
	private String theModel;
	
	public Computer(String aMake, String aModel) {
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
	
	public boolean login(String user, String pass) {
		return true;
	}
	
	public boolean logoff() {
		return true;
	}
}

class Laptop extends Computer implements HighlyDesirable {
	Laptop(String aMake, String aModel){
		super(aMake, aModel);
	}
	
	@Override
	public void turnOn() {
		System.out.println("Laptop::turnOn()"); 
	}
	
	@Override
	public void turnOff() {
		System.out.println("Laptop::turnOff()"); 
	}
	
	@Override
	public boolean login(String user, String pass) {
		System.out.println("Laptop::login()");
		return true;
	}
	
	@Override
	public boolean logoff() {
		System.out.println("Laptop::logoff()");
		return true;
	}
}

class Ipad extends Computer{
	Ipad(String aMake, String aModel){
		super(aMake, aModel);
	}
	
	@Override
	public void turnOn() {
		System.out.println("Ipad::turnOn()"); 
	}
	
	@Override
	public void turnOff() {
		System.out.println("Ipad::turnOff()"); 
	}
	
	@Override
	public boolean login(String user, String pass) {
		System.out.println("Ipad::login()");
		return true;
	}
	
	@Override
	public boolean logoff() {
		System.out.println("Ipad::logoff()");
		return true;
	}
}
