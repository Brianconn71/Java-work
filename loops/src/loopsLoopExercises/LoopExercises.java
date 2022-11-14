package loopsLoopExercises;

import java.util.Scanner;

public class LoopExercises {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		
//		whileLoop();
		whileLoop2();

	}

	public static void whileLoop2() {
		int n = 5;
		int i = 1;
		int total= 0;
		
		System.out.print("Enter increment amount? ");
		int c  = sc.nextInt();
		
		while (i <= n) {
			total += i;
			i+= c;
			System.out.println(i);
		}
		System.out.println(total);
		
	}

	public static void whileLoop() {
		int n = 5;
		int i = 0;
		int total= 0;
		
		while (i < n) {
			i++;
			total += i;
			System.out.println(i);
		}
		System.out.println(total);
		
	}
	
	

}
