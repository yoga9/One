package oops;            //MethodOverloading 3  

public class MethodOverloading_Eg {
	int a,b,c;
	double d;
	double e;
	void sum() {       //No parameters
		a=40;
		b=50;
		System.out.println(a+b);
	}
	void sum(int x, int y) {      //pass 2 parameters - wid same datatype.
		a=x;
		b=y;
		System.out.println(a+b);
	}
	void sum(int x, double y) {      //pass 2 parameters - wid different datatype.
		a=x;
		d=y;
		System.out.println(a+d);
	}
	void sum(int x, int y, int z) {      //pass 3 parameters - wid same datatype.
		a=x;
		b=y;
		c=z;
		System.out.println(a+b+c);
	}
	void sum(int x, double y, double z) {      //pass 3 parameters - wid different datatype.
		a=x;
		d=y;
		e=z;
		System.out.println(a+b+c);
	}
public static void main(String[] args) {
	MethodOverloading_Eg mo = new MethodOverloading_Eg();
	mo.sum();
	mo.sum(5, 5);
	mo.sum(10, 10.5);
	mo.sum(4, 5, 6);
	mo.sum(10, 10.5, 10.5);
}
}
