package exceptionhandling;                 // //checkedException - 2

public class CheckedException_Eg {        // 1sec-1000ms
	
	void m1() throws InterruptedException          // By using  "throws" keyword at method level.
	{
		Thread.sleep(6000);
		System.out.println("Hello");
	}
	
	public static void main(String[] args) throws InterruptedException  {
		System.out.println("Program is Started");
		System.out.println("Program is in Progress");
//		try {                          //try-catch appiled at stmnt level
//			Thread.sleep(5000);      
//		}
//		catch(InterruptedException e) {     //especially for checked exception -- catch block stmnt is not executed.
//			e.printStackTrace();
//		}
//		
//		
		
			Thread.sleep(6000); // why we put thz line in try- catch block, if the multiple thread is executed ...suppose m/y is not free at the tym, it will wait for this much tym.
		
		System.out.println("Program is Completed");
		System.out.println("Program is exited");
		
		
		
	}
}
