package exceptionhandling;         //Exception - 1

public class Exception_Eg {
	public static void main(String[] args) {
		
		System.out.println("Started");
	//	Thread.sleep(2000);        //But here it is syntatically, logically crt...Unhandled exception type InterruptedException -- Identified by the compiler - Checked exception
		System.out.println("Stopped");
		
//		int i = 10;
//		System.out.println(i/0); //Exception in thread "main" java.lang.ArithmeticException: / by zero -- at run tym its gives exception, sytatically its crt, but logically its not crt -- UnChecked exception 
//	
//	    String s = null;     //Exception in thread "main" java.lang.NullPointerException
//	    System.out.println(s.length());
	    
//	    String s1 = "12345";     //here no error
//	    int i = Integer.parseInt(s1);
//	    System.out.println(i);
//	    
//	    String s11 = "123s45";  
//	    int j = Integer.parseInt(s11); //Exception in thread "main" java.lang.NumberFormatException: For input string: "123s45"
//	    System.out.println(j);
//	    
	    int arr[] = new int[5]; //put some value at 10 th locatiion...Exception 
	    arr[10] = 40;  //here compiler not knows the error..at the run tym it throughs exception, Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 10
	    
	
	
	
	
	}
}
