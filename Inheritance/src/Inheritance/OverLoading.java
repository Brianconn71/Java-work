package Inheritance;

public class OverLoading {

	public static void main(String[] args) {
		Tree beach = new Tree();
		System.out.println(beach.getType());
		Tree oak = new Tree("oak");
		System.out.println(oak.getType());
		System.out.println(beach.getType("The tree is "));

	}

}
