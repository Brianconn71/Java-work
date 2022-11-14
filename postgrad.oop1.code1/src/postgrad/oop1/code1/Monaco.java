package postgrad.oop1.code1;

import java.util.ArrayList;

interface Machine {
	void start();
	void stop();
	double getPrice();
}

interface Desirable {
	
}

public class Monaco {

	public static void main(String[] args) {
		ArrayList<Machine> machines = new ArrayList<>();
		
		Machine yacht = new Yacht(500000);
		machines.add(yacht);
		
		Machine saloon = new Saloon(25000);
		machines.add(saloon);
		
		processMachines(machines);

	}
	
	public static void processMachines(ArrayList<Machine> machines) {
		for(Machine machine : machines){
			System.out.print(machine);
			if(machine instanceof Desirable) {
				System.out.println(" - Desirable Item");
			}
			System.out.println();
		}
	}

}
