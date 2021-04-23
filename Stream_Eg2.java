package StreamsAPI8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Stream_Eg2 {

	public static void main(String[] args) {
		
		//list of Customer Objects :
		
		List<Customer> customerList = Arrays.asList(
				new Customer("Yogi" , 40),
				new Customer("Karnan", 90),
				new Customer("Luxmi" , 30),
				new Customer("Karnan", 60),
				new Customer("Shiva" , 10),
				new Customer("Karnan", 70),
				new Customer("Kavi" , 60)
		);
		//power of Functional Programming here.
		
		System.out.println("StreamFilter");
		
		//1)filter - findAny
		Customer customer1 = customerList.stream()  //Convert list to Stream
				.filter(x -> "Luxmi".equals(x.getName()))   //filter it for Luxmi
				.findAny()   //if it finds then return
				.orElse(null);
		
		System.out.println(customer1.getName() + " " + customer1.getAge());   //Luxmi 30
		
		System.out.println("------");
//		
//		//2)filter - did not findAny..orElse
//		Customer customer2 = customerList.stream()  //Convert list to Stream
//				.filter(x -> "KAvi".equals(x.getName()))   //filter it for KAvi 
//				.findAny()   //if it finds then return
//				.orElse(null);
//				
//		System.out.println(customer2.getName() + " " + customer2.getAge()); //-- NullPointerException  
//				
		System.out.println("------");
		
		//3)filter - with multiple conditions
		Customer customer3 = customerList.stream()
				.filter((x) -> "Karnan".equals(x.getName()) && 70 == x.getAge())
				.findAny()
				.orElse(null);
		
		System.out.println(customer3.getName() + " " + customer3.getAge());
		
		System.out.println("------");
		
		System.out.println("StreamFilterMap");
		
		String customerName = customerList.stream()
				.filter(x -> "Shiva".equals(x.getName()))
				.map(Customer :: getName) //whatever getting from filter u have to map with same Object ryt, And so getname will return string over here so u store it in string type variable.
				.findAny()
				.orElse(null);
		
		System.out.println(customerName);
		
		System.out.println("------");
		
		//Print all the Names from the List:
		
		List<String> customerNewList = customerList.stream()
		.map(Customer :: getName)  //here converting stream into map, mapping with customer with getname.,
		.collect(Collectors.toList());  //collect as a list., collect that particular list by using toList, what type of collection that is -List that is String type ... string(getname)
		
		customerNewList.forEach(System.out :: println);
		
		System.out.println(customerNewList);
		
		customerNewList.forEach(a -> System.out.println(a));
		
		
		
		
	}
}

