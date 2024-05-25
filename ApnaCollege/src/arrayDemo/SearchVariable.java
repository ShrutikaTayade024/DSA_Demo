package arrayDemo;

import java.util.Scanner;

public class SearchVariable {

	public static void main(String[] args) {
 Scanner sc=new Scanner(System.in);
 System.out.println("give the size of array:");
 int size=sc.nextInt();
 
 //array creation
 
 int numbers[]=new int[size];
 
 
    //taking array elements from users
 
 System.out.println("give the array element:");
 
 for(int i=0; i<size; i++) {

	numbers[i]=sc.nextInt();
	
  }
    for(int i=0;i<size;i++)
    {
  	  System.out.println("array Are:"+numbers[i]);
	
    }
    }

}
