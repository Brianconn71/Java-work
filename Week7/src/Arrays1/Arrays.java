package Arrays1;

import java.util.Scanner;

public class Arrays {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
//		exercise();
//		exercise2();
//		histogram();
//		dynamicHistogram();
		frequency();

	}
	
	public static void exercise() {
		int[] a = {10,20,30,40,50};
		
//		Normal loop
		for(int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
		
//		enhanced For loop
		for (int x : a) {
			System.out.println(x);
		}
	}
	
	public static void exercise2() {
		int[] a = new int[5];
		
//		Normal loop
		for(int i = 0; i < a.length; i++) {
			System.out.print("Enter a Value --> ");
			int nextInt = Integer.valueOf(sc.nextInt());
			a[i] = nextInt;
		}

//		Normal loop
		for(int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
		
//		enhanced For loop
		for (int x : a) {
			System.out.println(x);
		}
	}
	
	public static void histogram() {
		int[] n = {19, 3, 15, 7, 11, 9, 13, 5, 17, 1};

		System.out.println("Element\tValue\tHistogram");
		for(int i = 0; i < n.length; i++) {
			System.out.print(i + "\t" + n[i] + "\t");
			for(int k = 0; k < n[i]; k++)
				System.out.print("*");
			System.out.println();
		}
	}
	
	public static void dynamicHistogram() {
		System.out.print("How many elements in array? ");
		int elements = Integer.valueOf(sc.nextInt());
		int[] n = new int[elements];
		
		for(int i = 0; i < n.length; i++) {
			System.out.print("Please enter a Value --> ");
			int nextInt = Integer.valueOf(sc.nextInt());
			n[i] = nextInt;
		}

		System.out.println("Element\tValue\tHistogram");
		for(int i = 0; i < n.length; i++) {
			System.out.print(i + "\t" + n[i] + "\t");
			for(int k = 0; k < n[i]; k++)
				System.out.print("*");
			System.out.println();
		}
	}
	
	public static void frequency() {
		int [] responses = {1,2,6,4,8,5,9,7,8,10,1,6,3,8,6,10,3,8,2,7};
		int[] frequency = {0,0,0,0,0,0,0,0,0,0,0};
		
		for (int i = 0; i < responses.length; i++) {
			frequency[responses[i]]++;
		}
		System.out.println("Rating\tFrequency");
		for (int k = 1; k< frequency.length; k++) {
			System.out.println(k + "\t" + frequency[k]);
		}
	}
}
