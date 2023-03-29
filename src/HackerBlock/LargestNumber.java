package HackerBlock;

import java.util.Arrays;
import java.util.Scanner;

public class LargestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Array ko sort karna hai+ Lexico graphically bade ko piche
		Scanner sc= new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0) {
			int n = sc.nextInt();
			String[] arr = new String[n];
			for (int i = 0; i < arr.length; i++) {
				arr[i]=sc.next();
			}
			NumLargest(arr);
		}
	}
	public static void NumLargest(String[] nums) {
		for(int i =0;i<nums.length;i++) {
			for (int j = i+1; j < nums.length; j++) {
				if((nums[j]+nums[i]).compareTo(nums[i]+nums[j])>0) {
					String temp = nums[i];
					nums[i]=nums[j];
					nums[j]= temp;
				}
			}
		}
		for (int i = 0; i < nums.length; i++) {
			System.out.print(nums[i]);
		}
		System.out.println();
	}
}
