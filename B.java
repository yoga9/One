package pack2;           //Access Modifier --- Default  -- 3

import pack1.A;    // if we imported pack A error is gone.

public class B extends A {   //create object for B and call that protected V & M
	public static void main(String[] args) {
		//A obj = new A();    //A cannot be resolved to a type...try to access the class A method in thz class -- error 
	   // obj.i = 80;  //here..The field A.i is not visible...it, allow as to create the object, but still it is not allow as to access thev & m, bcoz if we dont specify anything-- default(V & M) so it only accessible within the package.
	
	   // obj.j = 90;  //The field A.j is not visible -- error, cant access since it is protected.
	   // obj.flow();   //The method flow() from the type A is not visible, cant access since it is protected.
	    
	    B obj1 = new B(); //extended class A, so we can access its V and M here.
	    obj1.j = 70;
	    obj1.flow();
	    
	    A obj3 = new A();   // here no need to extend class A , just create obj for A class and access it, bcoz it is "public".
	    obj3.D = 100;
	    obj3.sub();
	}
}
