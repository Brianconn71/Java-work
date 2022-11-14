package Inheritance;

public class Person {
	
	private int age;
	private String name;
	private String address;
	private static int count = 0;
	
	public Person(String name, String address, int age) {
		this.age = age;
		this.name = name;
		this.address = address;
		count++;
	}
	public String getName() {
		return name;
	}
	public void setName(String aName) {
		this.name = aName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int anAge) {
		this.age = anAge;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String anAddress) {
		this.address = anAddress;
	}
	public static int getCount() {
		return count;
	}

}
