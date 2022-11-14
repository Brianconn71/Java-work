package oop.ShopII;

import java.util.ArrayList;

public class Shop {

	public static void main(String[] args) {
		ArrayList <ElectronicDevice> devices = new ArrayList<>();

		ElectronicDevice plasma = new Plasma("Sony", "P300");
		devices.add(plasma);
		
		ElectronicDevice laptop = new Laptop("Dell", "Inspiron");
		devices.add(laptop);
		
		processDevices(devices);
	}
	public static void processDevices(ArrayList<ElectronicDevice> devices) {
		for( ElectronicDevice device : devices) {
			System.out.print(device);
			if(device instanceof HighlyDesirable) {
				System.out.println(" -Highly Desirable");
			}
			System.out.println("\n");
		}
	};
}
