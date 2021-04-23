package LambdaConcept;         //FunctionInterface - 2

import java.util.function.Function;

public class FunctionInterfaceConcept_Eg {

		public static void main(String[] args) {
			
			
			
			Function<String,Integer> func = x -> x.length();  //left side - body of particular definition.
			
			int len = func.apply("Yogeshwari Karnan");  //apply -- only one abstract method in Function Interface.
			System.out.println("The length of the string :"+len);
			
			//Chaining function:
			Function<Integer,Integer> func1 = x -> x * 2;
			
			int result = func.andThen(func1).apply("Hello world");  // 0-10 -- 11 calculated by func,andthen it given to the func1 , so..ans is 22
			System.out.println(" The chaining of 2 function is "+result);
			
		}
}
