package oops;                    //Class & methods. 1

public class EmployeeMethods_Eg {
	  int empId;
	  String empName;
	  int salary;
	  int deptNo;
	  
	  void display() {
		  System.out.println(empId);
		  System.out.println(empName);
		  System.out.println(salary);
		  System.out.println(deptNo);
	  }
	  
//	  Employee_Eg(int id, String name, int sal, int dno){    //2)Constructor - kind of method,same name as a class name.
//		  empId = id;            //if u want to get those values from outside u defined that datetype & different variable name here, incase same variable name as class name use THIS keyword otherwise confused.
//		  empName = name;
//		  salary = sal;     //Constructor-will never return any values, it always used for  intialise the values, not for writing logics,(By default) not for returning any values.
//		  deptNo = dno;
//	  }
	 void setData(int id, String name, int sal, int dno)      //3)Using Methods
	 {
		  empId = id;            //thz method take the parameters from outside and assigned that parameters to class variables.
		  empName = name;
		  salary = sal;
		  deptNo = dno;
		 
	 }
	public static void main(String[] args) {
//		  Employee_Eg emp1 = new Employee_Eg();       //Thz is obj for 1st employee
//		  emp1.empId = 101;        //1) Using Objects - Directly access the obj specify variable name and (assign the values to class variable using obj).
//		  emp1.empName = "Ramya";
//		  emp1.salary = 10000;
//		  emp1.deptNo = 10;
//		  emp1.display();
		
//		  Employee_Eg emp2 = new Employee_Eg();       //Thz is obj for 2nd employee
//		  emp2.empId = 102;
//		  emp2.empName = "Shiva";
//		  emp2.salary = 10000;
//		  emp2.deptNo = 10;
//		  emp2.display();
		  /* Employee emp1 = new Employee();
		     * Employee  --> class Name, emp1 --> reference variable of obj , Employee() --> instantiation(without thz it wont allocate m/y for particular obj)
		      emp1,emp2  -- both are physical obj, so allocate the different m/y */
	    
	//2)Assign values to class variables using constructor; once defined constructor method need to call that, it automatically calls(invoked) at the tym of obj creation, but we don't need to use obj for intialise the values.	  
	      
//	      Employee_Eg emp3 = new Employee_Eg(201, "Deepz", 20000, 15);    //here,at the tym of instantiation - we pass those values. 
//	      emp3.display();
//	      Employee_Eg emp4 = new Employee_Eg(202, "Frank", 20000, 15);
//	      emp4.display();
	 
	//3)Assigning values to class variables using methods or Intialise the class variables using methods.
		 EmployeeMethods_Eg emp5 = new EmployeeMethods_Eg();      //call the method here using obj as emp5;
		 emp5.setData(301, "Berlin", 50000, 20);
		 emp5.display();
		 EmployeeMethods_Eg emp6 = new EmployeeMethods_Eg();
		 emp6.setData(302, "Vennila", 60000, 30);
		 emp6.display();
	
	}
	  
		  
	
}
