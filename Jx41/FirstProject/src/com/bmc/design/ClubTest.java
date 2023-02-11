package com.bmc.design;


class Club{
	private Vehicle vehicle;
	public Club() {
		
	}
	
	public Club(Vehicle vehicle) {
		super();
		this.vehicle=vehicle;
	}
	public Vehicle getVehicle() {
		return vehicle;
	}
	public void setVehicle(Vehicle vehicle) {
		this.vehicle=vehicle;
	}
	public void goTrip() {
		vehicle.move();
		
	}
}


abstract class Vehicle {
	public abstract void move();
}
  
class Jeep extends Vehicle{
	public void move() {
		System.out.println("Travel by riding");
	}
	class Bike extends Vehicle{
		public void move() {
			System.out.println("travel by riding");
		}
	}
}



public class ClubTest {
	
public static void main(String[] args) {
	Club club = new Club(new Bike());
	club.goTrip();
}	

}
