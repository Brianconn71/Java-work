package postgrad.oop1.code1;

abstract class Car implements Machine {
	
	protected double thePrice;
	
	public Car(double price) {
		this.thePrice = price;
	}
	
	@Override
	public double getPrice() {
		return thePrice;
	}
	
	@Override
	public String toString() {
		return this.getClass().getSimpleName();
	}
	
	public abstract boolean isPractical();
}

class Convertible extends Car implements Desirable{
	Convertible(double price){
		super(price);
	}
	
	@Override
	public void start() {
		System.out.println("Convertible::start()");
	}
	
	@Override
	public void stop() {
		System.out.println("Convertible::stop()");
	}
	
	@Override
	public boolean isPractical() {
		return false;
	}
}

class Hatchback extends Car {
	Hatchback(double price){
		super(price);
	}
	
	@Override
	public void start() {
		System.out.println("Hatchback::start()");
	}
	
	@Override
	public void stop() {
		System.out.println("Hatchback::stop()");
	}
	
	@Override
	public boolean isPractical() {
		return true;
	}
	
}

class Saloon extends Car{
	Saloon(double price){
		super(price);
	}
	
	@Override
	public void start() {
		System.out.println("Saloon::start()");
	}
	
	@Override
	public void stop() {
		System.out.println("Saloon::stop()");
	}
	
	@Override
	public boolean isPractical() {
		return true;
	}
	
}
