package oops;              // Inheritance 4

class A{
	int a, b;
	public void display()            //here , display() --- Method Definition.
	{
		System.out.println(a+b);     //body
	}
}

class B extends A{
	int x, y;
	public void show() {
		System.out.println(x+y);
	}
}

class C extends B{
	int p, q;
	public void make() {
		System.out.println(p+q);
	}
}
public class Inheritance_Eg {
	public static void main(String[] args) {
		
		System.out.println("Class A");
	A obj = new A();  //only A
	obj.a = 100;
	obj.b = 200;
	obj.display();
	
		System.out.println("Class BA -- Single Inheritance");
	B obj1 = new B();  //only B & also A
	obj1.x = 400;
	obj1.y = 600;
	obj1.show();
	
	obj1.a = 60;    //through B acquire A
	obj1.b = 40;
	obj1.display();
	
	  System.out.println("Class CBA  -- Multilevel Inheritance");
	C obj2 = new C();
	obj2.a = 10;
	obj2.b = 20;
	obj2.x = 30;
	obj2.y = 40;
	obj2.p = 50;
	obj2.q = 70;
	obj2.display();
	obj2.show();
	obj2.make();
	}
}
