package LambdaConcept;      //ConsumerInterface - 6

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerInterface_Eg {
//take one argument and return no result.
	//which consume something which return nothing.
	
	public static void main(String[] args) {
		
		Consumer<String> func = x -> System.out.println(x);
		func.accept("This is Yogi here :)");
	
	    System.out.println("Using Consumer in List");
	    List<Integer> intList = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
	    intList.forEach( x-> System.out.println(x));      //Using Lambda expression.
	    
	    intList.forEach(System.out :: println);    //Using Method Reference - forEach Method - will always take one consumer.
 	    
	    
	}
}
