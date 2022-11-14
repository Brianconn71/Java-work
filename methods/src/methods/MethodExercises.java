package methods;

import java.util.Scanner;

public class MethodExercises {
	
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
//		System.out.print("Enter value 1:");
//		int x = sc.nextInt();
//		System.out.print("Enter value 2:");
//		int y = sc.nextInt();
//		
//		int sum = calculateSum(x,y);
//		int product = calculateProduct(x,y);
//		int diff = calculateDiff(x,y);
//		int div = calculateDiv(x,y);
//		
//		System.out.println("The sum of " + x + " and " + y + " is " + sum);
//		System.out.println("The product of " + x + " and " + y + " is " + product);
//		System.out.println("The difference between " + x + " and " + y + " is " + diff);
//		System.out.println("The division between " + x + " and " + y + " is " + div);
		
//		System.out.print("Enter value 1: ");
//		int x = sc.nextInt();
//		System.out.print("Enter value 2: ");
//		int y = sc.nextInt();
//		System.out.print("Enter value 3: ");
//		int z = sc.nextInt();
//		
//		int colume = calcVolume(x, y, z);
//		System.out.println("The volume is " + colume);
		
//		carPark();
//		coordGeometry();
//		System.out.print("opp angle? ");
//		int x1 = sc.nextInt();
//		System.out.print("adj angle? ");
//		int x2 = sc.nextInt();
//		double hyp = calcHyp(x1, x2);
//		System.out.println(hyp);
		
//		intPower(x1, x2);
//		System.out.println(x1 + " to the power of " + x2 + " is " + intPower(x1, x2));
		
		System.out.print("loop da loop? ");
		int x1 = sc.nextInt();
		
		int n = sumTheValues(x1);
		System.out.println("The sum of the " + x1 + " values is " + n);

	}

	public static int sumTheValues(int x1) {
		int total = 0;
		for (int i = 0; i < x1; i++) {
			System.out.print("Value? ");
			int x2 = sc.nextInt();
			total = total + x2;
		}
		return total;
		
	}

	public static int intPower(int x1, int x2) {
		int poer = (int) Math.pow(x1, x2);
		return poer;
		
	}

	public static double calcHyp(double x1, double x2) {
		double dist = Math.sqrt(Math.pow(x1, 2) + Math.pow(x2, 2));
		return dist;
		
	}

	public static void coordGeometry() {
		System.out.print("x1? ");
		double x1 = sc.nextDouble();
		System.out.print("x2? ");
		double x2 = sc.nextDouble();
		System.out.print("y1? ");
		double y1 = sc.nextDouble();
		System.out.print("y2? ");
		double y2 = sc.nextDouble();
		
		System.out.println(calcDistance(x1, x2, y1, y2));
		System.out.println(calcMidpoint(x1, x2, y1, y2));
		System.out.println(calcSlope(x1, x2, y1, y2));
		
		
	}

	public static double calcSlope(double x1, double x2, double y1, double y2) {
		double dist = (y2 - y1) / (x2 - x1);
		return dist;
	}

	public static String calcMidpoint(double x1, double x2, double y1, double y2) {
		return(((x1 + x2) / 2 +
                " , " + (y1 + y2) / 2)) ;
	}

	private static Double calcDistance(double x1, double x2, double y1, double y2) {
		
		double dist = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
		return dist;
		
	}

	public static void carPark() {
		System.out.print("How many cars? ");
		int num = sc.nextInt();
		
		for (int i = 1; i < num+1; i++) {
			System.out.print("How long? ");
			double parkTime = sc.nextDouble();
			double charge = calculateCharges(parkTime);
			System.out.println("car # " + i + " was parked for " + parkTime + " hour(s), and charged " + charge + " euro.");
		}
		
	}

	public static double calculateCharges(double parkTime) {
		double total = 0.0;
		if (parkTime < 1 && parkTime > 0) {
			total = 0.0;
		} else if (parkTime > 1 && parkTime < 8) {
			total = (Math.ceil(parkTime) - 1) * 3;
		} else if (parkTime > 8) {
			total = 21.0;
		}
		
		return total;
	}

	public static int calcVolume(int x, int y, int z) {
		int total = x * y * z;
		return total;
	}

	public static int calculateDiv(int x, int y) {
		int total = x / y;
		return total;
	}

	public static int calculateDiff(int x, int y) {
		int total = x - y;
		return total;
	}

	public static int calculateProduct(int x, int y) {
		
		int total = x * y;
		return total;
	}

	public static int calculateSum(int x, int y) {
		
		int total = x + y;
		return total;
		
	}

}
