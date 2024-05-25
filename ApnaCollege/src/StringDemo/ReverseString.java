package StringDemo;

public class ReverseString {

	public static void main(String[] args) {
		
		StringBuilder sb=new StringBuilder("HelloWorld");
		
		for(int i=0;i<sb.length()/2;i++) {
			int front=i;
			int back=sb.length()-i-1;
			
			char backchar=sb.charAt(back);
			char frontchar=sb.charAt(front);
			
			sb.setCharAt(front, backchar);
			sb.setCharAt(back, frontchar);
		}
 System.out.print(sb);
	}

}
