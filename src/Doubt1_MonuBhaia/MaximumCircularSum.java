package Doubt1_MonuBhaia;

import java.util.Scanner;

public class MaximumCircularSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0) {
			int n = sc.nextInt();
			int[] arr = new int[n];
			for(int i = 0;i<n;i++) {
				arr[i]= sc.nextInt();
			}
			System.out.println(Circular_Sum(arr));
		}
	}
	public static int MaximumSum(int[] arr) {
		int ans = Integer.MIN_VALUE;
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
			ans = Math.max(ans, sum);
			if (sum < 0) {
				sum = 0;
			}
		}
		return ans;
	}
	public static int Circular_Sum(int[]arr) {
		int len_sum=MaximumSum(arr);
		int sum = 0;
		for(int i =0;i<arr.length;i++) {
			sum +=arr[i];
			arr[i]*=-1;
		}
		int mid_sum = MaximumSum(arr);
		int curr= sum+mid_sum;
		if(curr == 0) {
			return len_sum;
		}
		return Math.max(len_sum, curr);
	}
}
