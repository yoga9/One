package LambdaConcept;       //Lambda - 1

public class Lambda_Eg {
	public static void main(String[] args) {
		
		//WebPage w = new WebPage(); //Cannot instantiate the type WebPage--Can't create obj for interface.
		WebPage w = new WebPage() {  //ryt hand side & body -- behave lyk a class , so dont want to create seperate class
			
			@Override
			public void header(String value) {
				// TODO Auto-generated method stub
				System.out.println("Hi " +value);
			}
		};
		w.header("Google");
	
		WebPage w1 = new WebPage() {    //most of the things of exactly same over here and above,only the buisness logic is diferent.
			
			@Override
			public void header(String value) {
				// TODO Auto-generated method stub
				System.out.println("Hi " +value);
			}
		};
	w1.header("FaceBook");
	
	//To avoid thx overrides several tyms  -- use lambda
	System.out.println("Using Lambda  -- Lambda is nothing body of the method");
	
		WebPage w2 = (String value) -> {        //Type 1 - to write
		System.out.println("Hi " +value);  //if i add another method in thz interface, error - The target type of this expression must be a (only one abstract method)functional interface
		};
		w2.header("Linkdin");
		
		WebPage w3 = (value) -> System.out.println("Hi " +value.toUpperCase()); //Type 2 - to write
		w3.header("Linkdin Hello");
		
		WebPage w4 = (n) -> System.out.println("Hi " +n.length()); //Type 3 - to write
		w4.header("Linkdin Hello");
		
//		WebPageYoga w5 = (value1,age1) -> System.out.println("Hi my Name is "+value1 + "and age is " +age1);
//		w5.header("Tom ", 40);
//		
	
	}
}
