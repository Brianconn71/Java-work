package week8Lambdas;

import java.util.function.Predicate;

public class BasicLambdas {
    public static void main(String[] args) {
//        BasicLambdas bl = new BasicLambdas();
//        bl.predicate();
        System.out.println(check(4, n -> n%2 == 0));//true
        System.out.println(check(7, n -> n%2 == 0));//false

        System.out.println(check("Mr. Joe Bloggs", s -> s.startsWith("Mr.")));// true
        System.out.println(check("Ms. Joe Bloggs", s -> s.startsWith("Mr.")));// false

    }
    public static <T> boolean check(T t, 
            Predicate<T> lambda){
        return lambda.test(t);
    }
//    public static boolean check(Integer i, 
//            Predicate<Integer> lambda){
//        return lambda.test(i);
//    }

    public void predicate(){
        // pre-Java 8
        // anonymous inner class syntax
        Evaluate<Integer> anonInnerRef =
            new Evaluate<Integer>() {
                // this is the anon inner class code
                @Override
                public boolean checkIfNegative(Integer i){
                    return i < 0;
                }
            };
        System.out.println("Anon: "+anonInnerRef.checkIfNegative(-1));// true
        System.out.println("Anon: "+anonInnerRef.checkIfNegative(+1));// false
    
        // Java 8 - lambda expressions
        // Lambda expression depends upon a Functional Interface.
        // A Functional Interface is an interface with 1 abstract method.
        Evaluate<Integer> lambda = i -> i < 0;
        System.out.println("Java 8: "+lambda.checkIfNegative(-1));// true
        System.out.println("Java 8: "+lambda.checkIfNegative(+1));// false
    
        // Java 8 - Predicate interface
        Predicate<Integer> predicate = (i) -> i < 0;
        System.out.println("Java 8 Predicate: "+predicate.test(-1));// true
        System.out.println("Java 8 Predicate: "+predicate.test(+1));// false
    }
}

