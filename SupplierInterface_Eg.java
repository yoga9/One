package LambdaConcept;   //SupplierInterface - 7

import java.util.function.Supplier;

public class SupplierInterface_Eg {
	
	public static void main(String[] args) {
		//take no argument and return a result.
		
		//getText1 -- it takes one parameter as a supplier.
		getText1(() -> "Java");   //there is no arguments over here.
		getText1(() -> "Yogi");   
		getText1(() -> "Learning");
		getText1(() -> "Gradually");
		
	}


	public static void getText1(Supplier<String> text) { // i give one txt over here as the supplier, and thn it give me the length.
		System.out.println("To get the text from supplier "+text.get());
		System.out.println("The length of the text is : " +text.get().length());
	}
}