package Inheritance;

public class Bank {

	public static void main(String[] args) {
		Customer customerOne = new Customer();
		
		customerOne.setAccountNo(123);
		customerOne.setBalance(1000.00);
		customerOne.setName("James");
		
		System.out.println(customerOne.toString());
		
		Customer customerTwo = new Customer();
		
		customerTwo.setAccountNo(345);
		customerTwo.setBalance(2000.00);
		customerTwo.setName("Kate");
		
		System.out.println(customerTwo.toString());
		
		customerTwo.setAccountNo(348);
		customerTwo.setBalance(2500.00);
		customerTwo.setName("Katy");
		
		System.out.println(customerTwo.toString());
		
		System.out.println(Customer.getCount());

	}

}
