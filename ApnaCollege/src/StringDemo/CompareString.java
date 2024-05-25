package StringDemo;

public class CompareString {

	public static void main(String[] args) {
    String Name1="Shruuu";
    String Name2="Shruuu";
    
    //s1>s2:   +value
    //s1=s2:   0value
    //s1<s2:   -value
    
    if(Name1.compareTo(Name2)==0) {
    	System.out.print("String Are Equal");
    }else {
    	System.out.print("String Are Not Equal");

    }
	}

}
