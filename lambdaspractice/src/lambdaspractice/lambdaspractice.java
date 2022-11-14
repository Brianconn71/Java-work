package lambdaspractice;

interface lambdaSTuff {
	void run();
}

public class lambdaspractice {

	public static void main(String[] args) {
		new overrunCode();
	}

}

class overrunCode implements lambdaSTuff{
	@Override
	public void run() {
		System.out.println("Printing ");
	}
}
