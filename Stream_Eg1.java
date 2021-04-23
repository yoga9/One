package StreamsAPI8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Stream_Eg1 {
/* Stream - Applied of any collections concept.
	1)List object - Applied Stream - it create a (stream), then applied (filter)  - it will take one predicate,
	then u sorted, to (mapped) it, finally (collect) particular list, then get ur final value.
	(ie) Starting - u have 50 elements, finally u get  - 20 elements based on ur conditions. */
	
	public static void main(String[] args) {
		
	List<String> productList1 = Arrays.asList("Macbook", "Iphone", "Shoes", "Battery Charger", "Bat");
	
	System.out.println("The list are "+productList1);
	
	System.out.println("-------");
	
	productList1.forEach(a -> System.out.println(a));
	
	System.out.println("-------");

	List<String> result = productList1
					.stream()
					.filter(a -> ! a.equals("Shoes"))  //exclude the particularly shoes over here
					.collect(Collectors.toList());
	
	result.forEach(a -> System.out.println(a));
	
	System.out.println("-------");

    System.out.println(result);   //[Macbook, Iphone, Battery Charger, Bat]

    System.out.println("-------");
    
    List<String> result1 = productList1
			.stream()
			.filter(a -> ! a.equals("Bat"))  //exclude the particularly Bat over here
			.collect(Collectors.toList());
    
    result1.forEach(System.out :: println);



}
}
