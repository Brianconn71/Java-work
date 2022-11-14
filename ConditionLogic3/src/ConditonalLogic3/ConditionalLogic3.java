package ConditonalLogic3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ConditionalLogic3 {
	
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		//preAndPostDifference();
//		booleanLogicShortCircuitOps();
//		booleanBitwiseOps();
//		compareStrings();
//		ternaryOperator();
//		switchVowelOrConsonant();
//		ifMonth();
//		ifGrade();
		switchMathOperation();

	}

	public static void switchMathOperation() {
		double answer = 0.0;
		boolean charOk = true;
		
		System.out.print("Enter double 1: ");
		double num1 = sc.nextDouble();
		
		System.out.print("Enter double 2: ");
		double num2 = sc.nextDouble();
		
		System.out.print("Enter a character: ");
		char char1 = sc.next().charAt(0);
		
		switch (char1) {
		case '+':
			answer = num1 + num2;
			System.out.println(answer);
			break;
		case '/':
			answer = num1 / num2;
			System.out.println(answer);
			break;
		case '*':
			answer = num1 * num2;
			System.out.println(answer);
			break;
		case '-':
			answer = num2 - num1;
			System.out.println(answer);
			break;
		default:
			
		}
		
	}

	public static void ifGrade() {
		try {
			System.out.print("Enter a mark between 1 - 100: ");
			int mark = sc.nextInt();
			
			if(mark >= 70 && mark <= 100) {
				System.out.println("A");
			} else if (mark >= 60 && mark <= 69) {
				System.out.println("B");
			} else if (mark >= 50 && mark <= 59) {
				System.out.println("C");
			} else if (mark >= 40 && mark <= 499) {
				System.out.println("D");
			} else {
				System.out.println("Fail");
			}
			
		} catch (Exception e) {
			System.err.println("ASHits htt the fan here");
			e.printStackTrace();
		}
		
	}

	public static void ifMonth() {
		
		
		final int jan =1, feb=2, mar=3;
		
		try {
			System.out.print("Enter a mnth: ");
			int month = sc.nextInt();
			if (month == 1) {
				System.out.println("January");
			} else if (month == 2) {
				System.out.println("February");
			} else if (month == 3) {
				System.out.println("March");
			} else {
				System.out.println("Number out of range");
			}
			
		} catch (Exception e) {
			System.err.println("Exception Caught");
			System.out.println(e);  
			
		}
		
	}

	public static void switchVowelOrConsonant() {
		System.out.print("Enter a character: ");
		char letter = sc.next().charAt(0);
		
		if ((letter >= 'a' && letter <= 'z')
                || (letter >= 'A' && letter <= 'Z')) { // letter is OK
            switch (letter) {
                case 'a':
                case 65:
                case 'e':
                case 69:
                case 'i':
                case 'I':
                case 'o':
                case 'O':
                case 'u':
                case 'U':
                    System.out.println(letter + " is a vowel");
                    break;
                default:
                    System.out.println(letter + " is a consonant");
                    break;
            }
        } else {
            System.err.println("Invalid letter : " + letter);
        }
		
	}

	public static void ternaryOperator() {
		boolean isHappy = true;
		
		String mood = isHappy ? "Iam happy" : "I am not happy";
		System.out.println(mood);
		
		System.out.print("Enter num 1: ");
		int num1 = sc.nextInt();
		System.out.print("Enter num 2: ");
		int num2 = sc.nextInt();
		
		int minVal = num1 > num2 ? num2 : num1;
		
		System.out.println(minVal);
		
	}

	public static void compareStrings() {
		System.out.print("Enter string 1: ");
		String s1 = sc.nextLine();
		System.out.print("Enter string 2: ");
		String s2 = sc.nextLine();
		
		System.out.println("Using == returns " + (s1 == s2));
		System.out.println("Using equals() returns " + s1.equals(s2));
		
		String name1 = "sean";
		String name2 = "sean";
		System.out.println(name1 == name2);
		
		String name3 = "pat";
		String name4 = new String("pat");
		System.out.println(name3 == name4);
		
	}

	public static void booleanBitwiseOps() {
		System.out.print("Enter num 1: ");
		int num1 = sc.nextInt();
		System.out.print("Enter num 2: ");
		int num2 = sc.nextInt();
		
		if (num1 < 0 & num2++ < 0) {
			System.out.println(num2);
		} else if (num1 > 0 & num2++ > 0) {
			System.out.println(num2);
		} else if (num1 == 0 | num2++ == 0) {
			System.out.println(num2);
		} else if (num1 < 0 | num2++ < 0) {
			System.out.println(num2);
		}
		System.out.println(num2);
		
	}

	public static void booleanLogicShortCircuitOps() {
		System.out.print("Enter num 1: ");
		int num1 = sc.nextInt();
		System.out.print("Enter num 2: ");
		int num2 = sc.nextInt();
		
		if (num1 < 0 && num2++ < 0) {
			System.out.println(num2);
		} else if (num1 > 0 && num2++ > 0) {
			System.out.println(num2);
		} else if (num1 == 0 || num2++ == 0) {
			System.out.println(num2);
		} else if (num1 < 0 || num2++ < 0) {
			System.out.println(num2);
		}
		System.out.println(num2);
		
	}

	public static void preAndPostDifference() {
		int x = 5;
		int y = 10;
		
		System.out.println("The value of x is: " + x);
		System.out.println("The value of ++x is: " + ++x);
		System.out.println("The value of x++ is: " + x++);
		System.out.println("The value of x is: " + x);
		System.out.println("The value of y is: " + y);
		System.out.println("The value of --y is: " + --y);
		System.out.println("The value of y-- is: " + y--);
		System.out.println("The value of y is: " + y);
	}

}
