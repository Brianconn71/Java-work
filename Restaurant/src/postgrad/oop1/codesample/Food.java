package postgrad.oop1.codesample;

import java.util.ArrayList;

interface Tagged {

}

public class Food {

	public static void main(String[] args) {
		ArrayList<Restaurant> machines  =  new ArrayList<>();
		
		Restaurant japanese = new Japanese("japanese Restaurant");
		machines.add(japanese);
		
		Restaurant chinese = new Chinese("chinese Restaurant");
		machines.add(chinese);
		
		checkAll(machines);
		whileCondition();

	}
	public static void checkAll(ArrayList<Restaurant> machines) {
		for(Restaurant x : machines) {
			System.out.print(x);
			if(x instanceof Tagged) {
				System.out.println("- Tagged");
			}
			System.out.println();
			}
	}
	
	public static void whileCondition() { // tricky loop -> similar 
		boolean change = true;
		int a = 0;
		while(change) {
			if(false || a++>2) { 
				System.out.println(a);
				change = false;
			}				
		}		
	}

}


