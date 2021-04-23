package oops;               //ConstructorOverloading 4
 /* This Keyword : a,b,c,d - Local class Variable; x,y,z - External Variable(define only for accessing(holding) the class values;   */
public class ConstructorOverloading_Eg {     
      int a = 0;
      int b = 0;
      double c = 0;
      double d = 0;
      ConstructorOverloading_Eg(){        //1
      a = 10;
	  b = 20;
	  c = 50.5;
	}
      /*ConstructorOverloading_Eg(int a, int b){      //constructor confused so that use "This keyword"
      a = a;
      b = b;
      }
      ConstructorOverloading_Eg(int a, int b){      //constructor (No confusion even same variable name)-  so that use "This keyword"
      this.a = a;      //now constructor understand , we explicitly say, left side variable belongs to thz particular class, right side variable belongs to external variable.
      this.b = b;
      }
      */
      ConstructorOverloading_Eg(int x, int y){      //2
          a = x;
          b = y;
          }
      
      ConstructorOverloading_Eg(int x, double y){       //3
          a = x;
          c = y;
          }
      ConstructorOverloading_Eg(int x, int y, double z){      //4
          a = x;
          b = y;
          d = z;                         //4&5 --if data type of the parameter is same, but order of parameter is different.
          }
      ConstructorOverloading_Eg(int x, double y, int z){      //5
          a = x;
          b = z;
          d = y;
          }
      void display() {
    	  System.out.println(a);
    	  System.out.println(b);
    	  System.out.println(c);
    	  System.out.println(d);
      }
      
	public static void main(String[] args) {
		//ConstructorOverloading_Eg co = new ConstructorOverloading_Eg();   //Will call 1st constructor
		//ConstructorOverloading_Eg co = new ConstructorOverloading_Eg(10,5);     //Will call 2nd constructor
		//ConstructorOverloading_Eg co = new ConstructorOverloading_Eg(10,5.5);     //Will call 3rd constructor
		//ConstructorOverloading_Eg co = new ConstructorOverloading_Eg(10,5,55.5);     //Will call 4th constructor
		ConstructorOverloading_Eg co = new ConstructorOverloading_Eg(10,55.5,5);	//Will call 5th constructor
		co.display();
	}
}
