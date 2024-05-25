package Sorting;

public class InsertionSort {

	public static void 	printArray(int arr[]) {
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {7,3,4,5,1};
		
		//Inserion sort
	for(int i=0;i<arr.length;i++) {
		int current=arr[i];
		int j=i-1;
		while(j>=0 && current<arr[i]) {
			arr[j+1]=arr[j];
			j--;
			
		}
		//placement
		arr[j+1]=current;
		
	}
	printArray(arr);

	}

}
