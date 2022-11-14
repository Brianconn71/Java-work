package lambdasandmethods;

@FunctionalInterface
interface Evaluate<T>{
	boolean checkIfNegative(T t);
}

public class BasicLambdas {

	public static void main(String[] args) {
//		checkIfNegative(T t);

	}
	
//	public static boolean check(T, Predicate<T>) {
//		return true;
//	}
	
	public void predicate() {
		Evaluate<Integer> lambda = i -> {return i < 0;};
		System.out.println("Evaluate: " + lambda.checkIfNegative(-1));
	}

}
