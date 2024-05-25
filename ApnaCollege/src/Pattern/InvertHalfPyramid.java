package Pattern;

public class InvertHalfPyramid {

	public static void main(String[] args) {
	int n=5;
	for(int i=n;i>=1;i--)
	{
		for(int j=1;j<=i;j++) {
			System.out.print("*");
		}System.out.println();
		}
	
	System.out.println();
	System.out.println();
	System.out.println();
	System.out.println("Inverted half pyramid 180");
//outer loop
	for(int i=1;i<=n;i++) {
		//printing space
		for(int j=1;j<=n-i;j++) {
			System.out.print(" ");
		}
		//inner for
		for(int j=1;j<=i;j++) {
			System.out.print("*");
		}System.out.println("");
	}
	}

}
