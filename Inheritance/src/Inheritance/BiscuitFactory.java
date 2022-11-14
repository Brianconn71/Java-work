package Inheritance;

public class BiscuitFactory {

	public static void main(String[] args) {
		Biscuit biscuit = new Biscuit();
		
		biscuit.setBrand("Kimberley");
		biscuit.setMaker("Jacobs");
		biscuit.setWeight(15);
		System.out.println(biscuit.toString());
		
		Biscuit biscuit2 = new Biscuit("McVities"  , "Digestive", 20);
		
		System.out.println(biscuit2.toString());
		
		biscuit2.setBrand("WholeWheat");
		biscuit2.setMaker("Cadbury");
		biscuit2.setWeight(25);
		
		System.out.println(biscuit2.toString());
		
		System.out.println(Biscuit.getNumberOfBiscuits());
	}

}
