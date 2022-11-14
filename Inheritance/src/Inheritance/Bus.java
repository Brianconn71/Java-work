package Inheritance;

public class Bus {
	private int numberOfSeats;
	private int busCount;
	private Driver driver;
	private String make;
	
	public Bus() {
		this.numberOfSeats = numberOfSeats;
		this.make = make;
		this.driver = driver;
		busCount++;
	}
	public Bus(String make, int numberOfSeats, Driver driver) {
		this.numberOfSeats = numberOfSeats;
		this.make = make;
		this.driver = driver;
		busCount++;
	}
	public Driver getDriver() {
		return driver;
	}
	public void setDriver(Driver aDriver) {
		this.driver = aDriver;
	}
	public int getNumberOfSeats() {
		return this.numberOfSeats;
	}
	public void setNumberOfSeats(int aNum) {
		this.numberOfSeats = aNum;
	}
	public String getMake() {
		return this.make;
	}
	public void setMake(String aMake) {
		this.make = aMake;
	}
	public int getBusCount() {
		return this.busCount;
	}
	@Override
	public String toString() {
		String driverName;
		if (driver==null){
			driverName=" no driver assigned";
		}
		else{
		driverName=" Driver "+driver.getName()+" ";}
		return "[Make=" + this.make + " number of seats=" + this.numberOfSeats + driverName + "]";
	}
	

}