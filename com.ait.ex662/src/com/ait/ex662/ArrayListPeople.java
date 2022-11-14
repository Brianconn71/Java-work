package com.ait.ex662;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListPeople {

	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		while(userchoice() != 3)
		userChoice();
		
		
	}
	public static int userChoice() {
		ArrayList<Person> people = new ArrayList<Person>();
		System.out.println("What do You want to do?");
		String [] myArray = {"Add", "update", "delete a person", "delete everyone", "find a person", "display", "exit"};
		
		for(int i = 0; i<myArray.length;i++) {
			System.out.println((i + 1) + ".\t" + myArray[i]);
		}
		int dec = sc.nextInt();
		
		if (dec == 1) {
			add(people);
			
			
		}
		return dec;
	}
	
	public static void add(ArrayList<Person> people) {
		System.out.print("Enter name");
		String name = sc.next();
		int index = personThereAlready(name, people);
		if(index > -1) {
			System.out.println(name + " is already there ya flute");
		} else {
			System.out.print("Enter age");
			int age = sc.nextInt();
			Person newPerson = new Person(age, name);
			people.add(newPerson);
		}
		
	}
	
	public static int personThereAlready(String name, ArrayList<Person> people) {
		int index =  -1;
		for(int i = 0; i < people.size(); i++) {
			Person person = people.get(i);
			if (person.getName().equalsIgnoreCase(name)) {
				index = 1;
				break;
			}
		}
		return index;
	}
	
	public static void update(ArrayList<Person> people) {
		
	}
	
	public static void deletePerson(ArrayList<Person> people) {
		
	}
	
	public static void deleteEveryone(ArrayList<Person> people) {
		
	}
	
	public static void findPersonByName(ArrayList<Person> people) {
		
	}
	
	public static void display(ArrayList<Person> people) {
		
	}

}
