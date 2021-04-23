package LambdaConcept;    //UnaryOperatorInterface - 4

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class UnaryOperatorInterface_Eg {
	
	public static void main(String[] args) {
		
		UnaryOperator <Integer> func = x -> x * 7; //where the operand/argument and result are the same type.
		System.out.println("UnaryOperator for thz "+func.apply(4));
		
		//UnaryOperator extends Function...
		Function<Integer,Integer> func1 = x -> x * 8 ;
		System.out.println("By using Function "+func1.apply(9));
		
		System.out.println("Applying UnaryOperator in list ");
		List<String> language = new ArrayList<String>();
		language.add("Java");
		language.add("Python");
		language.add("Ruby");
		language.add("Selinium");
		
		System.out.println(language);
		
		language.replaceAll(name -> name + " YogiYogi");   
		System.out.println(language);
		
		
		
	}
}
