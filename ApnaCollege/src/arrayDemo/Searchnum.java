package arrayDemo;

import java.util.Scanner;

public class Searchnum {

	public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
     System.out.println("enter no of row and columns:");
     int row=sc.nextInt();
     int col=sc.nextInt();
     
     int myarr[][]=new int[row][col];
     
     //input rows
     System.out.println("Input values");

     for(int i=0;i<row;i++) {
    	 //colomns
    	 for(int j=0;j<col;j++) {
    		 myarr[i][j]=sc.nextInt();
    	 }
     }
     System.out.println("Searching element:");
   int x=sc.nextInt();
   
   for(int i=0;i<row;i++) {
  	 //colomns
  	 for(int j=0;j<col;j++) {
    if(myarr[i][j]==x) {
    	System.out.println("X found at location:"+i+ " ,"+j+",");
    }
  	 }
   }
	}

}
