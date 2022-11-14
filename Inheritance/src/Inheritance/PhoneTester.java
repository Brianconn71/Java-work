package Inheritance;

public class PhoneTester {

	public static void main(String[] args) {
		Phone samsung = new Phone();
		System.out.println("THE DEFAULTS- gerard depardieu");
		System.out.println(samsung.getPhoneNumber());
		System.out.println(samsung.getOwnersName());
		System.out.println(samsung.getPrice());
		Phone iPhone = new Phone("999", "John", 88.50);
		System.out.println("NEW DEETS");
		System.out.println(iPhone.getPhoneNumber());
		System.out.println(iPhone.getOwnersName());
		System.out.println(iPhone.getPrice());
		iPhone.setOwnersName("Paddy");
		iPhone.setPhoneNumber("112");
		iPhone.setPrice(112.56);
		System.out.println("UPDATED DEETS");
		System.out.println(iPhone.getPhoneNumber());
		System.out.println(iPhone.getOwnersName());
		System.out.println(iPhone.getPrice());

	}

}
