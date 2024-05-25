package Sorting;

public class Bubble_Sort {

	public static void  printArr(int arr[]) {
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+"");
	}}
		public static void main(String[] args)  {
	int arr[]= {7,8,3,1,2};
		
		 //buble sort
		 for(int i=0;i<arr.length-1;i++) {//n-1
			 
			 for(int j=0;j<arr.length-i-1;j++) {
				 if(arr[j]>arr[j+1]) {
					 //swap
					 int temp=arr[j];
					 arr[j]=arr[j+1];
					 arr[j+1]=temp;
					 
				 }
			 }
		 }
		 
		 printArr(arr);
	}
	
	}


//public static void main(String[] args) {
//	int myarr[]= {1,3,6,2,5,3};
//	
//	for(int i=0;i<myarr.length;i++) {
//		for(int j=0;j<myarr.length-i+1;j++) {
//			if(myarr[j]<myarr[j+1]) {
//				//swap
//				int temp=myarr[j];
//				myarr[j]=myarr[j+1];
//				myarr[j+1]=temp;
//				
//			}
//	}