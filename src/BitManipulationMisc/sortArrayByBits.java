package BitManipulationMisc;

import java.util.Scanner;

public class sortArrayByBits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i =0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		sortByOrder(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}
	public static void sortByOrder(int[]arr) {
		int n = arr.length;
		for(int i =0;i<n;i++) {
			int ones = countOne(arr[i]);
			for (int j = 0; j < arr.length; j++) {
				int ontherOne = countOne(arr[j]);
				if(ones<ontherOne || (ones==ontherOne && arr[i]<arr[j])) {
					swap(arr,i,j);
					ones=ontherOne;
				}
			}
		}
	}
	public static int countOne(int val) {
		int count =0;
		while(val!=0) {
			if((val&1)==1) {
				count++;
			}
			val =val>>1;
		}
		return count;
	}
	public static void swap(int[] arr ,int i , int j) {
		int temp = arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
	}
}
