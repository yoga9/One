package accessModifiers;                //Access Modifier -- Private,Default  -- 1 

class K {
    private int i = 40;     //Private - can be access only within the class
    private void memo() {     //Private - can be access only within the class
		System.out.println(i);
	}
    int r = 50;          //Default - can be access only within the Package - no need to specify a.m
    void disp() {        //Default - can be access only within the Package - no need to specify a.m
    	System.out.println(r);
    }
	
}


public class AccessModifier_Eg {
	public static void main(String[] args) {
		K obj = new K();
		//obj.i = 30;   // error : The field K.i is not visible , cant access since it is private.
		//obj.memo();    // error : The method memo() from the type K is not visible, cant access since it is private.
		
		obj.r = 70; //it will execute
		obj.disp();  //it will execute
		
		
		
		
	}
}
