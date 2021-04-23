package exceptionhandling;                   //UncheckedException - 1

public class UncheckedException_Eg {             //"Exception" – Super Class
	public static void main(String[] args) {
		
		System.out.println("Program is started");
		int a = 10;
		
		try {                    //Try block - Throws some exception.
			System.out.println(a/0);    //ArithmeticException
		}
		catch(ArithmeticException e) {                //here, u can mention only "Exception" it can handle all kind of exception
			System.out.println(e.getMessage());     //Catch block - handle the exception.
		}
		
		String s = null;     
		try {
	    System.out.println(s.length());    //Exception in thread "main" java.lang.NullPointerException
		}
		catch(NullPointerException e) {
			System.out.println(e.getMessage());
		}
	    
		System.out.println("Program is in progress");
		System.out.println("Program is Completed");
		
		// finally block  --- followed by catch block its a optional.     //Exception is handled or not handled -- it always execute the code we puts.
	/* case1  --> Exception occurs in try..catch block handled, case2 --> Exception occurs in try..catch block not handled,
	Both the case1 & 2 ....finally executes.,
	case3 --> Exception not occured in try...catch block will ignore,here too finally block excecuted */
	
		int arr[] = new int[5];
		try {                 
			arr[10] = 100;
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());    //Actually, print some msg, which is coming from exception
		}
		finally    //Actually, recovery step included here.
		{
			System.out.println("Thz is finally block");
		}
	/* DB Connection Eg....if connect DB through Java Program - 
	 * establish connection to the DB, if the DB is available prgrm 
	 * will establish the connection or else it thrown an exception,
	 * in try--connection details,if connection is there no issues,
	 * otherwise DB not available then it will thrown an error, 
	 * before handling the exception catch block print that exception type..
	 * it wont handle anything, and in the finally block we can specify some other DB connections.	
	 */
		
	}
}
