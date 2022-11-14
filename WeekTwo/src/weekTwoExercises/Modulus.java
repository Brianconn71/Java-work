package weekTwoExercises;

import java.util.Scanner;

public class Modulus {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter x: ");
		int val1 = Integer.valueOf(sc.nextInt());
		
		System.out.print("Enter y: ");
		int val2 = Integer.valueOf(sc.nextInt());
		
		if(val1 % val2 == 0) {
			System.out.println(val1 + " is a multiple of " + val2);
		} else {
			System.out.println(val1 + " is not a multiple of " + val2);
		}

	}

}
