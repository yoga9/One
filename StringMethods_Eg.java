package base;

public class StringMethods_Eg {
public static void main(String[] args) {
	String name = "Yogeshwari";
	System.out.println("Length of the string");
	System.out.println(name.length());    //No of character in a string.
	
	System.out.println("Concatenation(Joining) of String");
	String s1 = "Welcome to This Page ";
	String s2 = "by Yogeshwari Karnan";
	System.out.println(s1.concat(s2));   //string method
	System.out.println(s1+s2);           //+operator
	System.out.println("Welcome to This Page "+"by Yogeshwari Karnan");   //without variables
	System.out.println("Welcome to This Page ".concat("by Yogeshwari Karnan"));
	
	System.out.println("Chk if String is Equals or not");   //Always return boolean values - Comparing 2String Values.
	String s3 = "Hello";
	String s4 = "hello";
	System.out.println(s3.equals(s4));     //Java - Case sensitive values.
    
	System.out.println("If i want to ignore the case, need to match the 2string--By equalsIgnoreCase");
    System.out.println(s3.equalsIgnoreCase(s4));     //it will not consider the case.
    
    System.out.println("I want to chk (verify) particular thing present or not? ---By contains");
    System.out.println(s4.contains("He"));
    
    System.out.println("Substring of the string"); //based upto ur parameter it will extract (substring)values from main string.
    /* W e l c o m e -- substring(starting index,ending index)
     * starting index -- 0 1 2 ...Here starting index(0)
     * ending index -- 1,2,3 ...Here ending index(7)
     */
     System.out.println(s3.substring(0, 3));    // Hel
     System.out.println(s3.substring(2, 5));     // llo
     System.out.println(s3.substring(4, 5));   // o (for last one letter.)
     System.out.println(name.substring(0, 6));  //Yogesh
     
     System.out.println("Replace the Character,(within the) String");
     String s5 = "yalini";
     System.out.println(s5.replace('y', 'm'));
     System.out.println(s5.replace("ini", "zzz"));
}
}
