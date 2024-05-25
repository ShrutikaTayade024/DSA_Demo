package Pattern;

public class HollowRectangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int n=4 ;
    int m=5;
    
    for(int i=1;i<=n;i++)
    {
    	//inner loop for coloumn
    	for(int j=1;j<=m;j++)
    	{
    		
    	if(i==1||j==1||i==n||j==n) {	
    		System.out.print("*");
    	}else
    	{
    		System.out.print("  ");
    	}
	    }
    	System.out.println();

    }
   
    
	}}
