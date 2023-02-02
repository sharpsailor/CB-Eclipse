package lec3;

import java.util.*;

public class pattern_p {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
//		/*
		for (int i = 1; i <= n; i++) {
			for (int s = 1; s <= n - i; s++) { // Space = n-1
				System.out.print(" ");
			}
			for (int j = 1; j <= 2 * i - 1; j++) {
				System.out.print("*");
			}
			
			System.out.println();
		}
//		*/
//		int row =1;
//		int star = 1;
//		int space = n-1;
//		while(row<=n) {
//			int i =1;
//			while(i<=space) {
//				System.out.print(" ");
//			i++;
//			}
//		}
//		int j =1;
//		while(j<=star) {
//			System.out.print("* ");
//			j++;
//		}
//		System.out.println();
//		space--;
//		star+=2;
//		row++;
	}

}
