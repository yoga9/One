package oops;            

class Bank{                    // Example 1                      
	int getRateOfInterest() {             //Overrridden the same method, but body has been changed.
		return 0;
		
	}
}
class SBI extends Bank{
	int getRateOfInterest() {
		return 10;
		
	}
}
class INDIAN extends Bank{
	int getRateOfInterest() {
		return 20;
		
	}
}
class AXIS extends Bank{
	int getRateOfInterest() {
		return 30;
		
	}
}

class Vehicle{                      // Example 2
	void run() {
		System.out.println("Vehicle is running");
	}
}
class Bike extends Vehicle{
	void run() {
		System.out.println("Bike is running");
	}
}
public class MethodOverriding_Eg {
	public static void main(String[] args) {

		System.out.println("Inheritance with Overriding");
		SBI obj1 = new SBI();
		System.out.println(obj1.getRateOfInterest());
		INDIAN obj2 = new INDIAN();
		System.out.println(obj2.getRateOfInterest());
		AXIS obj3 = new AXIS();
		System.out.println(obj3.getRateOfInterest());
		
		Vehicle v = new Vehicle();
		v.run();
		Vehicle v1 = new Bike();
		v1.run();
		Bike b = new Bike();
		b.run();
	    
	}
}
