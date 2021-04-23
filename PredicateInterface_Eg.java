package LambdaConcept;   //PredicateInterface - 5

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicateInterface_Eg {

		public static void main(String[] args) {
			
			Predicate<Integer> func = x -> x > 5; //always denoting a boolean value.
			
			List<Integer> arr = Arrays.asList(1,2,3,4,5,6,7,8,9,10);  //converting one array to Arraylist
			
			List<Integer> arrList = arr.stream().filter(func).collect(Collectors.toList()); //it will return a list of integer over here.
			System.out.println("The new Collectionlist1 by using predicate : " +arrList);
		
		    //Predicate with && :
			List<Integer> arrList1 = arr.stream().filter(x -> x > 5 && x < 9).collect(Collectors.toList());
			System.out.println("The new Collectionlist2 by using predicate : "+arrList1);
			
			//Predicate with negate() :
			List<String> str = Arrays.asList("Yogeshwari", "Yoga", "Yogi", "Luxmi", "Karnan");
			
			Predicate<String> namesExp = x -> x.startsWith("Yog");
			List<String> newNameList = str.stream().filter(namesExp.negate()).collect(Collectors.toList());
		    System.out.println("The new Collectionlist3 by using predicate : "+newNameList);
		    
		    
		
		}
}
