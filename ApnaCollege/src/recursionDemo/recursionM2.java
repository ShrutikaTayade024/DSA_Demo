package recursionDemo;

public class recursionM2 {
	
	
	public static void printnum(int n) {
		  //1.base case
	    if(n==6)
	    	return;
	    
	    //2.print n
	    System.out.println(n);
	    
	    //3.Recursion
	    printnum(n+1);
	    
	    
	   }
		
		public static void main(String[] args) {
			printnum(1);
		}

	
}
