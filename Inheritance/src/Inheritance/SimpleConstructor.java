package Inheritance;

public class SimpleConstructor {

	public static void main(String[] args) {
		for(int i=1; i<=5; i++) {
			System.out.println("Creating Instance " + i + " of Rock");
			Rock rock = new Rock();
		}
		Rock rock = new Rock();
		rock.Rock();

	}

}
