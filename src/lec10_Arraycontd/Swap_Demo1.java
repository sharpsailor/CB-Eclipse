package lec10_Arraycontd;

import java.util.Scanner;

public class Swap_Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner sc = new Scanner(System.in);
//			int n = sc.nextInt();
//			int[] arr = new int[n];
//			for(int i =0;i<n;i++) {
//				arr[i] = sc.nextInt();
//			}
			int[] ar = {1,2,3,4,5,6};
			System.out.println(ar[0]+ " "+ar[1]);
			swap(ar,0,1);
			System.out.println(ar[0]+ " "+ar[1]);
	}
	public static void swap(int[]ar,int a, int b ) {
		int temp =ar[a];
		ar[a]=ar[b];
		ar[b] = temp;
	}

}
