package LambdaConcept;

//SAM - Single Abstract Method-
@FunctionalInterface     // SAM  -- Lambda cant be applied if its have more than one AM in FI.
public interface WebPage {
	
	void header(String value);

	//void t1(); //The target type of this expression must be a functional interface -- not allowed especially if it a FI
}


//interface WebPageYoga {
//	void header(String value,int age);
//}