package base;

public class Array_Eg2 {
 public static void main(String[] args) {
	String s[] = new String[3];   //static(fixed) - we specify size of string array.
	s[0] = "Yogeshwari";
	s[1] = "Karnan";
	s[2] = "Luxmi"; 
	System.out.println(s.length);
	for(String i : s) {
		System.out.println("The elements are :" +i);
	}
	
	int number[] = {20, 40, 60, 80, 100};     //Here no limit u can add(store) any no of values into an array
     for(int n : number)//here u didn't specify size, so it automatically(dynamically) allocate the space in ur m/y  - based upon ur no of elements u added.
     {
    	 System.out.println("The elements are "+n);
     }
      System.out.println("The sum of all the elements in an array");
     int sum = 0;
     for(int n1 : number) {
    	 sum = sum+n1;
    	 //System.out.println("The sum of the elements :"+sum);
    	 
     }
     System.out.println("The sum of the elements :"+sum);
     
     System.out.println("Object Array");
     Object o[] = new Object[5];
     o[0] = 10;
     //o[1] = ‘G’;
    // o[2] = “Welcome”;
     o[3] = 55.5;             //double
     o[4] = true;
     
     Object o1[] = {10,20.55,false,"Welcome",'V'};
     for(Object o111 : o1) {
    	 System.out.println(o111);
     }
     
     System.out.println("Two Dimensional Array - For Loop");
     int d[][] = new int[2][3];         //6 elements in an array.
     d[0][0] = 3;
     d[0][1] = 4;
     d[0][2] = 5;
     
     d[1][0] = 6;
     d[1][1] = 7;
     d[1][2] = 8;
     
     //for loop = 1st for loop = incrementing the row, 2nd inside 1st = incrementing the colms of every row.
      for(int i=0;i<=1;i++) {
    	  for(int j=0;j<=2;j++) {             //for every we have no of columns
    		 System.out.print(d[i][j]+ " ");
    	  }
    	  System.out.println();
      }
      
      System.out.println("Two Dimensional Array - For each Loop");
      for(int i1[] : d) {          //here i1 have currently 1st row value....thn 2nd row,3rd row.
           for (int j1 : i1) {      //here 1st row value stored in j1
        	   System.out.print("2D array by For-each loop "+j1+" ");
           }System.out.println();
      }
      
      
      System.out.println("Two Dimensional Array - Object type");
      Object Od[][] = new Object[2][3];         //6 elements in an array.
       Od[0][0] = 1;
       Od[0][1] = "Yoga";
       Od[0][2] = 98.5;
      
       Od[1][0] = 2;
       Od[1][1] = "Vizhal";
       Od[1][2] = 99.5;
       System.out.println("Two Dimensional Array - Object type For each Loop");
       for(Object i111[] : Od) {          //here i1 have currently 1st row value....thn 2nd row,3rd row.
           for (Object j111 : i111) {      //here 1st row value stored in j1
        	   System.out.print(j111+" ");
           }System.out.println();
      }
       
   System.out.println("Two Dimensional Array");  
   int unlimited[][] = { {40,50}, {60, 70}, {80,50} };   //3rows,2coloums
        for(int k[] : unlimited) {
        	for(int y : k) {
        		System.out.print(y+ " ");
        	}System.out.println();
        }
      }}
