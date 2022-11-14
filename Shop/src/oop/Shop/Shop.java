package oop.Shop;

import java.util.ArrayList;

public class Shop {
	
	public static void main(String[] args) {
		ArrayList<ElectronicDevice> devices = new ArrayList<>();
		
		ElectronicDevice plasma = new Plasma("Sony", "P300");
		devices.add(plasma);
		
		ElectronicDevice laptop = new Laptop("Dell", "Inspiron");
		devices.add(laptop);
		
		processDevices(devices);
	}
	
	public static void processDevices(ArrayList<ElectronicDevice> devices) {
		for(ElectronicDevice device : devices) {
			if(device instanceof HighlyDesirable) {
				System.out.println(device + " - Highly desired");
			} else {
				System.out.println("");
				System.out.println(device);
			}
			
			
		}
	}


}
