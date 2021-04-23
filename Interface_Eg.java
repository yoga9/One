package interfaces;   //Interface 2

interface TestInterface{
	int a = 10;    //bcz by defaulty in interface 'a' is static as well as final (cant change that value - it is constant), so changed to italic.
	void display();    //by default its a (by default) Methods are public ., abstract method., only it have definition not any body at here.
}
public class Interface_Eg implements TestInterface{      //here we have extended evything from interface to class, so use "implements" keyword
	
	@Override
	public void display() {      //we must implemented interface method in its immmediate class, we shouldn't leave as it is...
		// TODO Auto-generated method stub
		System.out.println("The value of a is "+a);
	}
	
public static void main(String[] args) {
	
//	 TestInterface obj = new  TestInterface();      //Cannot instantiate the type TestInterface ---error
//	 obj.display();
	
	Interface_Eg  obj1 = new Interface_Eg () ;
	obj1.display();
	 
	TestInterface obj = new Interface_Eg();     //it will works
	obj.display();
	
	}
}
