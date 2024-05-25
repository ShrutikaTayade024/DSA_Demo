package recursionDemo;

public class recursionM3 {
	
	
	public static void printnum(int i,int n,int sum) {
		  //1.base case
		if(i==n)
		{
			sum+=i;
			System.out.println(sum);
			return;
		}
		
	   //recursion
	sum+=i	;
	printnum(i+1,n,sum);
	    
	   }
		
		public static void main(String[] args) {
			printnum(1,5,0);
		}

	
}
