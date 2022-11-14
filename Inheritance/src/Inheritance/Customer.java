package Inheritance;

public class Customer {
	private int accountNo;
	private double balance;
	private String name;
	private static int count = 0;
	
	public Customer() {
		this.accountNo = accountNo;
		this.balance = balance;
		this.name = name;
		count++;
	}
	public Customer(String name, int accountNo, double balance) {
		this.accountNo = accountNo;
		this.balance = balance;
		this.name = name;
		count++;
	}
	public String getName() {
		return this.name;
	}
	public void setName(String aName) {
		this.name = aName;
	}
	public int getAccountNo() {
		return this.accountNo;
	}
	public void setAccountNo(int num) {
		this.accountNo = num;
	}
	public double getBalance() {
		return this.balance;
	}
	public void setBalance(double bal) {
		this.balance = bal;
	}
	public static int getCount() {
		return count;
	}
	@Override
	public String toString() {
		 return "[accountNo=" + this.accountNo + " name=" + this.name + " balance=" + this.balance + "]" ;

	}

}
