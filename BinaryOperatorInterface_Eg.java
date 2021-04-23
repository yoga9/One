package LambdaConcept; //BinaryOperatorInterface - 2

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;

public class BinaryOperatorInterface_Eg {

	public static void main(String[] args) {
	
//BiFunction for the case where two operands and the result are all of te same type.
	//Instead of using BiFunction , directly using (BinaryOperator it extend Bifunction so apply method comes from BiFunction.,)
		BinaryOperator<Integer> func = (x,y) -> x+y;
		int res = func.apply(10, 20);
	    System.out.println("By using BinaryOperator "+res);
	    
	    BiFunction<Integer,Integer,Integer> func1 = (x,y) -> x+y;
		int res1 = func1.apply(100, 200);
		System.out.println("By using BiFunction "+res1); //way1 to print
	    System.out.println("By using BiFunction " +func1.apply(100, 200)); //way2 to print
	
	
	
	}

}
