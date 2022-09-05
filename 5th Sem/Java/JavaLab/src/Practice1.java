//Q1. WAP to implement the concept of Method overriding while using an abstract class name Vehicle and 3 derive class from it named as Car, Bus and Scooter.
abstract class Vehicle{  
  abstract void run();  
}  
class Scooter extends Vehicle{
	@Override
	void run() {
		System.out.println("Scooter is a 2 whiller vehical");
	}
}

class Car extends Vehicle{
	@Override
	void run() {
		System.out.println("Car is a 4 whiller vehical");
	}
}

class Bus extends Vehicle{
	@Override
	void run() {
		System.out.println("Bus can be 4 as well as 6 whiller vehical");
	}
}


public class Practice1 {

	public static void main(String[] args) {
		Vehicle obj = new Scooter();
		Vehicle obj1 = new Car();
		Vehicle obj2 = new Bus();
		obj.run();
		obj1.run();
		obj2.run();
	}

}
