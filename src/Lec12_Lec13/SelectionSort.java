package Lec12_Lec13;
import java.util.*;
public class SelectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i =0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		Sort(arr);
	}
	public static void Sort(int[]arr) {
		int n = arr.length;
		for(int i =0;i<n-1;i++) {
			int min = i;
			for(int j =i+1;j<n;j++) {
				if(arr[j]<arr[min]) {
					min = j;
				}
			}
			if(min!=i) {
				int temp = arr[min];
				arr[min]= arr[i];
				arr[i]=temp;
			}
		}
		for(int x:arr) {
			System.out.println(x);
		}
	}

}
