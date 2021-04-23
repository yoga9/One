package interfaces;          //Final 1

final class Test{
	final int a = 10;    //value of a is 'constant'
	final void check(){
		// a = 20;      //Not valid
		   System.out.println("The value of a is : " +a);
	}
}

class check12 extends Test{      //if the class is final we cant override that class  -- here error, we cant extend that class into subclass.
	void check(){               //if i put 'final' in front of Test class method  ---here indicate error.  --bcoz cant override that method.
		System.out.println("check is overridden");
}
}

public class Final_Eg {
	public static void main(String[] args) {
		Test t = new Test();
		t.check();
		check12 c = new check12();
		c.check();
	}
}
