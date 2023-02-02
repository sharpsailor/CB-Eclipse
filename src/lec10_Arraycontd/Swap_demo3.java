package lec10_Arraycontd;

public class Swap_demo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {2,3,1,4};
		int []arr1 = {20,13,11,9};
		System.out.println(arr[0]+" "+arr1[0]);
//		System.out.println(arr );
//		System.out.println(arr1);
		swap(arr,arr1,0);
		swap(arr,arr1);
		System.out.println(arr[0]+" "+arr1[0]);
//		System.out.println(arr);
//		System.out.println(arr1);
	}
	public static void swap(int[]arr,int[]arr1) {
		int[] temp = arr;
		arr= arr1;
		arr1=temp;
	}

	public static void swap(int[]arr,int[]arr1,int a) {
		int temp = arr[a];
		arr[a]= arr1[a];
		arr1[a]=temp;
	}
}
