package LambdaConcept;   //LambdaExpMethodReference - 8

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class LambdaExpMethodReference_Eg {
	
	public static void main(String[] args) {
		
	
		/*Public interface Iterable<T> ---> Iterable - Interface., Having --- forEach method - directly apply particular collection
		 *  -- it will take one consumer., */
		
		List<String> namesList = Arrays.asList("Tom", "Jerry", "Peter", "Manasa");
		
		System.out.println("Five ways of Printing the values fro ArrayList (Collection)");
		
		for(int i = 0 ; i<namesList.size() ; i++) {
			System.out.println(namesList.get(i));     //Using for loop
		}
		System.out.println("------");
		
		for(String s : namesList) {
			System.out.println(s);
		}
		
		System.out.println("------");
		
		
		//1) way - Internal implementation with the anonymous class:        //JDK - 1.8
		namesList.forEach(new Consumer<String>() { //here create anonymous class with the help of the consumer interface..after the starting brace(block) it behave lyk a overriden class.

			@Override
			public void accept(String t) {  //implements the accept method here.
				// TODO Auto-generated method stub
				System.out.println(t);
			}
			
		});
		
		System.out.println("------");
		
		
		//2) Replace the entire above concept by using Lambda Expression:        //JDK - 1.8
		//Consumer -- it will take parameter and return void method.
		namesList.forEach(str -> System.out.println(str));
		
		System.out.println("------");
		
		
		//3) make more short --Replace Lambda Expression by Using Method References:         //JDK - 1.8
		namesList.forEach(System.out :: println);
		
		
	}
}
