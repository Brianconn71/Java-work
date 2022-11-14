package postgrad.oop1.code1;

abstract class Boat implements Machine {
	
	protected double thePrice;
	
	public Boat(double price) {
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

}

class Canoe extends Boat{
	Canoe(double price) {
		super(price);
	}
	
	@Override
	public void start() {
		System.out.println("Canoe::start()");
	}
	
	@Override
	public void stop() {
		System.out.println("Canoe::stop()");
	}
	
}

class Yacht extends Boat implements Desirable{
	Yacht(double price){
		super(price);
	}
	
	@Override
	public void start() {
		System.out.println("Yacht::start()");
	}
	
	@Override
	public void stop() {
		System.out.println("Yacht::stop()");
	}
	
}

class Kayak extends Boat{
	Kayak(double price){
		super(price);
	}
	
	@Override
	public void start() {
		System.out.println("Kayak::start()");
	}
	
	@Override
	public void stop() {
		System.out.println("Kayak::stop()");
	}
	
}
