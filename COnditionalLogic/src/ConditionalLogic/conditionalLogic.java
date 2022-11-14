package ConditionalLogic;

import java.util.Scanner;

public class conditionalLogic {
	
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		
//		preAndPostDifference();
//		booleanLogicShortCircuitOps();
//		booleanBitwiseOps();
//		compareStrings();
//		boolean aOk = admitToFilm(5,4);
//		System.out.println(aOk);
		ifMonth();
	}
	
	public static void ifMonth() {
		final int JAN=1, FEB=2, MAR=3;
		
		try {
			System.out.println("Enter a month (1..6) --> ");
			int month = sc.nextInt();
			
			if (month == JAN) {
				System.out.println("Jan");
			} else if (month == FEB) {
				System.out.println("Feb");
			} else if (month == MAR) {
				System.out.println("mar");
			} else {
				System.out.println("Month is out of range: " + month);
			}
		} catch(Exception e) {
			System.out.println("Exception caught");
			e.printStackTrace();
		}
		
	}

	public static boolean admitToFilm(int cert, int age) {
//		if(age >= cert) {
//			return true;
//		} else {
//			return false;
//		}
		// ternary operator
		boolean isOk = age >= cert ? true :false;
		
		return isOk;
		
	}

	public static void preAndPostDifference() {
		int x = 5;
		int y = 10;
		
		System.out.println("The value of x is " + x);
		System.out.println("The value of ++x is " + ++x);
		System.out.println("The value of x++ is " + x++);
		System.out.println("The value of x is " + x);
		
		System.out.println("The value of y is " + y);
		System.out.println("The value of --y is " + --y);
		System.out.println("The value of y-- is " + y--);
		System.out.println("The value of y is " + y);
	}
	
	public static void booleanLogicShortCircuitOps() {
		System.out.print("Enter number 1: ");
		int num1 = Integer.valueOf(sc.nextInt());
		System.out.print("Enter number 2: ");
		int num2 = Integer.valueOf(sc.nextInt());
		
		if (num1 < 0 && num2++ < 0) {
			System.out.println(num2);
		} else if(num1 > 0 && num2++ > 0) {
			System.out.println(num2);
		} else if (num1 == 0 || num2++ == 0) {
			System.out.println(num2);
		} else if (num1 < 0 || num2++ < 0) {
			System.out.println(num2);
		}
		
		System.out.println(num2);
	}
	
	public static void booleanBitwiseOps() {
		// ok so basically with a single & or | we dont care if a parameter is true or false we are still adding to it so x++ still gets counted
		System.out.print("Enter number 1: ");
		int num1 = Integer.valueOf(sc.nextInt());
		System.out.print("Enter number 2: ");
		int num2 = Integer.valueOf(sc.nextInt());
		
		if (num1 < 0 & num2++ < 0) {
			System.out.println(num2);
		} else if(num1 > 0 & num2++ > 0) {
			System.out.println(num2);
		} else if (num1 == 0 | num2++ == 0) {
			System.out.println(num2);
		} else if (num1 < 0 | num2++ < 0) {
			System.out.println(num2);
		}
		
		System.out.println(num2);
	}
	
	public static void compareStrings() {
		System.out.print("Enter s1: ");
		String s1 = sc.next();
		System.out.print("Enter s2: ");
		String s2 = sc.next();
		
		System.out.println("Using == returns " + (s1 == s2));
		// brackets is needed around s1 == s2 due to the order of precedence
		
		System.out.println("Using equals() returns " + s1.equals(s2));
		
		String name1 = "Sean"; // String literal, into SCP
		String name2 = "Sean";
		System.out.println(name1 == name2);
		
		String name3 = "john"; // goesm into string constant pool for sharing
		String name4 = new String("john"); // object goes into the heap
		System.out.println(name3 == name4);
		
	}

}
