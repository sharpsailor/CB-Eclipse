package Lec_14;

import java.util.Scanner;

public class upperTriangularMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[][] arr = new int[n][n];
		for(int i =0;i<arr.length;i++) {
			for(int j =0;j<arr[0].length;j++) {
				arr[i][j]= sc.nextInt();
			}
		}
		UpperMatrix(arr);
	}
	public static  void UpperMatrix(int[][]arr) {
		for(int i =0;i<arr.length;i++) {
			for(int j =0;j<arr[0].length;j++) {
				if(i>j) {
					System.out.print("0 ");
				}else {
					System.out.print(arr[i][j]+" ");
				}
			}
			System.out.println();
		}
		
	}

}
