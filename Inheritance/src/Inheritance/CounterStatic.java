package Inheritance;

public class CounterStatic {

	private static int counter;
	
	public CounterStatic() {
		counter++;
	}
	public int getCount() {
		return counter;
	}
	
	public static int getCounter() {
		return counter;
	}
}
