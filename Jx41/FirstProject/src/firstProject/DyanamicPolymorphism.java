package firstProject;



	class Vehicle{
		public void move() {
			System.out.println("moves on road");
		}
	}
	
	class Car extends Vehicle{
		
	}
	class Jeep extends Vehicle{
		
	}
	public class DyanamicPolymorphism {
	public static void main(String[] args) {
		
		Vehicle v=new Car();
		v.move();
		v=new Jeep();
		v.move();
		

	}

}
