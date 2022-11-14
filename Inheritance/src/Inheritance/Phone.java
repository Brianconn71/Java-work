package Inheritance;

public class Phone {
	private String phoneNumber;
	private String ownersName;
	private double price;
	
	public Phone() {
		this.phoneNumber = "123456";
		this.ownersName = "Bman";
		this.price = 20.0;
	}
	
	public Phone(String phoneNumber, String ownersName, double price) {
		this.phoneNumber = phoneNumber;
		this.ownersName = ownersName;
		this.price = price;
	}
	
	public String getPhoneNumber() {
		return phoneNumber;
	}
	
	public String getOwnersName() {
		return ownersName;
	}
	
	public double getPrice() {
		return price;
	}
	
	public void setPhoneNumber(String aNumber)
    {
        this.phoneNumber = aNumber;
    }
	public void setOwnersName(String aName)
    {
        this.ownersName = aName;
    }
	public void setPrice(double adouble)
    {
        this.price = adouble;
    }
	

}
