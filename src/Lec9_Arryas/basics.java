package Lec9_Arryas;

import java.util.Scanner;

public class basics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++) {
			arr[i]= sc.nextInt();
		}
		Display(arr);
	}
	public static void Display(int[] arr) {
		for(int x : arr) {
			System.out.print(x+" ");
		}
	}

}
