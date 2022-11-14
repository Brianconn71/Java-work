package week8Lambdas;

@FunctionalInterface
interface Printable{
	String print(String t);
}

public class Lambasexample {

	public static void main(String[] args) {
		Cat mycat = new Cat();
		
		Printable y = (t) -> "hi" ;
		
		printThing(y);

	}
	
	static void printThing(Printable thing) {
		thing.print(" Hi");
	}

}
