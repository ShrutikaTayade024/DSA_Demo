package Sorting;

public class Selection_Sort {

	public static void printarray(int arr[]) {
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]+"");
 
		}
		}
	public static void main(String[] args) {

		int arr[]= {7,8,2,1,5,3};
		//SELECTION SORT
		for(int i=0;i<arr.length-1;i++) {
			int Smallest=i;
			for(int j=i+1;j<arr.length-i-1;j++) {
				if(arr[Smallest]>arr[j]) {
					Smallest=j;
					
				}
			}
			int temp=arr[Smallest];
			arr[Smallest]=arr[i];
			arr[i]=temp;
		}
		printarray(arr);
	}

}
