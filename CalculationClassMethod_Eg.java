package oops;                  //Types of methods used. 2

public class CalculationClassMethod_Eg {
  int a, b ; 
  
  void sum() {         //1) method - without parameters, 4)method - without return any values
	System.out.println("The Sum is (1st method) :"+(a+b));  
  }
  
  void sum1(int x, int y) {     //2) method - with parameters (takes parameter from outside)
	  a=x;
	  b=y;
	  System.out.println("The Sum is (2nd method) :"+(a+b));
  }
  
  int sum2() {    //3)method - return some values
	  return (a+b);
}
  
  
  public static void main(String[] args) {
	CalculationClassMethod_Eg calc = new CalculationClassMethod_Eg();
	calc.a = 10;           //1)
	calc.b = 20;
	calc.sum();
	
	calc.sum1(100, 200);  // 2)here passing the variables and getting the output happening same tym
	
	calc.a = 300;           //3)
	calc.b = 20;
	int result = calc.sum2();
	System.out.println("The Sum is (3rd method) : " +result);
}
}
