package application;

public class Car {
	int fuelTank;
	String brand;
	
	void printCardetail() {
		System.out.println("fuel Capacity: "+ this.fuelTank+ "\n brand :" + this.brand +"\n");
	}
	Car(){
		fuelTank = 15;
	}
}
