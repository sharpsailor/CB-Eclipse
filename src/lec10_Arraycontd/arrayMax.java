package lec10_Arraycontd;

import java.util.Scanner;

public class arrayMax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	Scanner sc = new Scanner(System.in);
//	int n = sc.nextInt();
//	int[] arr = new int[n];
//	for(int i =0;i<n;i++) {
//		arr[i] = sc.nextInt();
//	}
	int[]arr = {1,2,5,22,7};
//	int max = arr[0];
	int max = Integer.MIN_VALUE;
	for(int i =0;i<arr.length;i++) {
		if(max<arr[i]) {
			max=arr[i];
		}
	}
	System.out.println(max);

	}
}
