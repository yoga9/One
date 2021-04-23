package interfaces;           //MultipleInheritance 3

interface A
{
	int a = 20;
	void display();
}
interface B
{
	int b = 30;
	void show();
}
public class InterfaceMultipleInheritance_Eg implements A, B{

	@Override
	public void show() {              // here, we must give public, bcoz in interface by default it is public method..here if we wont give means , it through error bcoz here it is default method.
		// TODO Auto-generated method stub
		System.out.println("The value of a is "+a);
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("The value of b is "+b);
	}
	
	public static void main(String[] args) {
		InterfaceMultipleInheritance_Eg mi = new InterfaceMultipleInheritance_Eg();
		mi.display();
		mi.show();
	}

}
