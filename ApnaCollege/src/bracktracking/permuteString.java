package bracktracking;

public class permuteString {

	public static void PrintPermutation(String str,String permutation, String string)
	{
		if(str.length()==0) {
			System.out.println(permutation);
			return;
			
		}
		for(int i=0;i<=str.length();i++) {
			char currchar=str.charAt(i);
			String newstrng=str.substring(0,i)+str.substring(i+1);
			PrintPermutation(newstrng, permutation+ currchar,string+1);
			
		}
	}
		public static void main(String[] args) {
	

		String str="abc";
		PrintPermutation(str,"","0");
	}

}
