package base;

public class Array_Eg1 {
 public static void main(String[] args) {
	int a[] = new int[5]; //declaration of array 5 elements.
	a[0] = 10;
	a[1] = 20;
	a[2] = 30;
	a[3] = 40;
	a[4] = 50;                  //suppose elements is n -- last element of index n-1
//	System.out.println(a[3]);
	System.out.println("For loop");
//	for(int i=0; i<=4; i++)                      //max len of array = 4
//	{
//		System.out.println("The elements of an array--for loop is :"+a[i]);       //using thz loop , we read elements from thz array.
//	}
	System.out.println("For each loop");
	for(int i : a) {              // for each -- Loop (only for array--whenever we need to array elements -- preferrable)
		System.out.println("The elements of an array is--for each loop :"+i);         //the 1st element of a is assigned to i thn i is printed,once all elements have been completed thn thz loop will exit.
	}                     //automatic repeatation internally
	System.out.println("The length of the array :" +a.length);
}
}
