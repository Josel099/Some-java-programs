package firstProject;

class Animal {
	public void eat() {
		System.out.println("Animal eats");
	}
}

class Dog extends Animal {

}

class Vehicle {
	public void Travel() {
		System.out.println("vehicle travels");
	}
}

class Car extends Vehicle {

}

public class InheritenceTest {

	public static void main(String[] args) {

		Dog d = new Dog();
		d.eat();

		Car c = new Car();
		c.Travel();

	}

}
