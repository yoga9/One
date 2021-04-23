package pack1;         //Access Modifier -- Default,public,protected -- 2

public class A {
    int i = 500;          //Default - can be access only within the Package - no need to specify a.m
    void disp1() {        //Default - can be access only within the Package - no need to specify a.m
    	System.out.println(i);
    }
    
    protected int j = 400;     //we can access(here its not direct access) ths Protected V and M in some other class and packages through Inheritance is possible
    protected void flow() {
    	System.out.println(j);
    }
    
    public int D = 60;       //directly access thz some other class and package, no need to inherited thz class.,
    public void sub(){
    	System.out.println(D);
    }
}
