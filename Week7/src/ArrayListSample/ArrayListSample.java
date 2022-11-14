package ArrayListSample;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListSample {

	public static void main(String[] args) {
//		arrayListStringLiterals();
//		arrayListFromScanner();
//		arrayListWithLoops();
//		arrayListInteger();
		arrayListPerson();

	}
	
	public static void arrayListStringLiterals() {
		ArrayList<String> jane = new ArrayList<String>();
		jane.add("Zoe");
		jane.add("Paul");
		jane.add("Alan");
		jane.add("Thomas");
		System.out.println(jane);
	}
	
	public static void arrayListFromScanner() {
		Scanner sc = new Scanner(System.in);
		
		ArrayList<String> jane = new ArrayList<String>();
		System.out.print("Enter a name to be added --> ");
		String nextOne = sc.next();
		jane.add(nextOne);
		System.out.print("Enter a name to be added --> ");
		String nextTwo = sc.next();
		jane.add(nextTwo);
		System.out.print("Enter a name to be added --> ");
		String nextThree = sc.next();
		jane.add(nextThree);
		System.out.print("Enter a name to be added --> ");
		String nextFour = sc.next();
		jane.add(nextFour);
		System.out.println(jane);
	}
	
	public static void arrayListWithLoops() {
		Scanner sc = new Scanner(System.in);
		ArrayList<String> jane = new ArrayList<String>();
		while(true)
		{
			System.out.print("Enter a name to be added  (x to exit) --> ");
			String nextOne = sc.nextLine();
			if (nextOne.equals("x")) {
				break;
			} else {
				jane.add(nextOne);
			}
		}
		System.out.println(jane);
		for (String x : jane) {
			System.out.println("The name is " + x);
		}
	}
	
	public static void arrayListInteger() {
		ArrayList<Integer> myList = new ArrayList<Integer>(3);
		Scanner sc = new Scanner(System.in);
		while(true)
		{
			System.out.print("Enter an integer to be added  (-1 to exit) --> ");
			int next = Integer.valueOf(sc.nextInt());
			if (next == -1) {
				break;
			} else {
				myList.add(next);
			}
		}
		System.out.println(myList);
		for (int x : myList) {
			System.out.println("The number is " + x);
		}
	}
	
	public static void arrayListPerson() {
		ArrayList<Person> myList = new ArrayList<Person>();
		Scanner sc = new Scanner(System.in);
		while(true)
		{
			System.out.print("Enter name --> ");
			String name = sc.next();
			System.out.print("Enter address --> ");
			String address = sc.next();
			System.out.print("Enter age --> ");
			int age = Integer.valueOf(sc.nextInt());
			Person person = new Person(age, name, address);
			myList.add(person);
			
			System.out.print("Do you wish to create more people (y/n) -->");
			String nextOne = sc.next();
			if (nextOne.equalsIgnoreCase("n")) {
				break;
			}
		}
		for (Person x : myList) {
			System.out.println(x);
		}
	}

}
