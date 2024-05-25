package StringDemo;

public class StringBuilderDemo {
	public static void main(String args[]) {
		StringBuilder sb=new StringBuilder("tony");
	System.out.println(sb);
	
	//charAt
	 System.out.println(sb.charAt(1));
	 
	 //set char at index 0
	sb.setCharAt(1, 'i');
	 System.out.println(sb);
	 
	 //insert at index
	 sb.insert(2, 'n');
	 System.out.println(sb);
	 
	 //delete at index
	sb.delete(3, 4);
	 System.out.print(sb);
	}
}
