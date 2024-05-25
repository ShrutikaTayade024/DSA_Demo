package arrayDemo;

import java.util.Scanner;

public class TwoDArray {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of row & coloumns");
		
 int row=sc.nextInt();
 int col=sc.nextInt();
 // creatin of array
   int nums[][]=new int[row][col];
   
     //input
   System.out.println("input value of array:");
	
 for(int i=0;i<row;i++) {
	 for(int j=0; j<col;j++) {
		 nums[i][j]=sc.nextInt();
	 }
 }
 //print the output
 System.out.println("Array elements are"
 		+ "");
	
 for(int i=0;i<row;i++) {
	 for(int j=0; j<col;j++) {
	System.out.print(nums[i][j]+" ");
	 }System.out.println("");
 }
	
	}

}
