package LambdaConcept;

@FunctionalInterface
public interface Page {    //Page is not a functional interface -- FI doesnt have two AM.
		public void greet();  //one abstract method - FI
		// public void greeting();
		
		public static void test() {   //FI allows static and default method.
			
		}

		default void display() {
			
		}




}



