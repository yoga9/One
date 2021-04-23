package oops;           //Static 5

public class Static_Eg {
	int a;         //non-static
	static int b;   //static
	void msg(){      //non-static
		System.out.println("Msg 1 -- Non static method");
	}
	
	static void msg1(){           //static
		System.out.println("Msg 2 --  static method");       //static method - (Direct access)can access only static stuff, but it cant access non-static stuff.
	}
	
	void msg2() {        //4)non-static method (can access evything - no restriction (both static as well as non-static  --direct access) without object.)
		a=500;
		System.out.println(a);
		Static_Eg.b=400;     //specify the class name. (but no need at here - bcoz it precent in same class)
		System.out.println(b);
		msg();
		msg1();
	}
	
public static void main(String[] args) {
	b=100;                        //1)bcz 'main' is a static method -- so it access static stuff directly(line no:22,24-- no need to create any obj) through class name -here ew dont specify class name bcoz this method actually precent in same class. 
	System.out.println(b);
	msg1();
	
////	a = 200;   //2)error --can't make static reference, thz is not accessible directly.
////	msg();      //can't make static reference
	 
	Static_Eg se = new Static_Eg();
	se.a = 200;         //3)static method – can also  access non- static stuff but through object.
	System.out.println(se.a);
	se.msg();
	
	se.msg2();
	
	
}
}
