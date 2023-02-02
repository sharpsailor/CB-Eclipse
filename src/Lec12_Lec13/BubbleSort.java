package Lec12_Lec13;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {10,5,1,2,8,9,44,5};
		sort(arr);
	}
	public static void sort(int[]arr) {
		for(int i =1;i<arr.length;i++) {
			for(int j =0;j<arr.length-i;j++) {
				if(arr[j]>arr[j+1]) {
					int temp = arr[j];
					arr[j]= arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		for(int x:arr) {
			System.out.print(x+" ");
		}
	}

}
