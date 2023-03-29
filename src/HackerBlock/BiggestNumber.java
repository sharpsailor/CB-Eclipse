package HackerBlock;

import java.util.Scanner;

public class BiggestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0) {
			int n = sc.nextInt();
			int[] arr = new int[n];
			for (int i = 0; i < arr.length; i++) {
				arr[i]=sc.nextInt();
			}
			markOne(arr);
		}
	}
	public static void markOne(int[] arr) {
		int max = 0;
		String str ="";
		for (int i = 0; i < arr.length; i++) {
			if(max<arr[i]) {
				max=arr[i];
				arr[i]=-1;
			}else if(arr[i]==-1) {
				continue;
			}
			str+=max;
		}
		System.out.println(max);
		 System.out.println(str);
	}

}
