package Inheritance;

public class Family {

	public static void main(String[] args) {
		Person john = new Person("John", "Dublin", 22);
		Person anne = new Person("Anne", "Galway", 25);
		System.out.println("THE DEFAULTS- gerard depardieu");
		System.out.println(john.getName());
		System.out.println(anne.getName());
		System.out.println(john.getAddress());
		System.out.println(anne.getAddress());
		System.out.println(john.getAge());
		System.out.println(anne.getAge());
		System.out.println(Person.getCount());
		System.out.println("NEW DEETS");
		john.setName("Jack");
		john.setAge(23);
		john.setAddress("Cork");
		System.out.println(john.getName());
		System.out.println(john.getAge());
		System.out.println(john.getAddress());

	}

}
