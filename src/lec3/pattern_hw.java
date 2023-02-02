package lec3;
import java.util.*;
public class pattern_hw {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
//		Question -7
		int n = sc.nextInt();
	/*	for(int i =1;i<=n;i++) {
			for(int j =1;j<=n;j++) {
				if(j ==1 || j==n || i==1 || i==n) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}*/
//		Question-21
		/*for(int i =1;i<=n;i++) {
			for(int j =1;j<=i;j++) {
				System.out.print("*");
			}
			for(int j =1;j<=2*(n-i);j++) {
				System.out.print(" ");
			}
			for(int j =1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}*/
//		Question-22
		/*for(int i =n;i>=1;i--) {
			for(int j =1;j<=i;j++) {
				System.out.print("*");
			}
			for(int j =1;j<=2*(n-i);j++) {
				System.out.print(" ");
			}
			for(int j =1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		*/
//		Question-23
		/*for (int i = 1; i <= n; i++) {
			for (int s = 1; s <= n - i; s++) { // Space = n-1
				System.out.print(" ");
			}
			for (int j = 1; j <= 2 * i - 1; j++) {
				System.out.print("1");
			}
			
			System.out.println();
		}
		*/
//		Question -24
		/*int count =1;
		for (int i = 1; i <= n; i++) {
			for (int s = 1; s <= n - i; s++) { // Space = n-1
				System.out.print(" ");
			}
			for (int j = 1; j <= 2 * i - 1; j++) {
						System.out.print(count);					
				}
			count++;
			System.out.println();
		}
		*/
//		Question -25
//		int count =1;
//		for (int i = 1; i <= n; i++) {
//			for (int s = 1; s <= 2*(n - i); s++) { // Space = n-1
//				System.out.print("  ");
//			}
//			for (int j = 1; j <= 2 * i - 1; j++) {
//						System.out.print(count+" ");					
//						count++;
//				}
//			System.out.println();
//		}
//		Question-26
		for (int i = 1; i <= n; i++) {
			for (int s = 1; s <= n - i; s++) { // Space = n-1
				System.out.print("  ");
			}
			for (int j = 1; j <= 2 * i - 1; j++) {
				System.out.print(j+" ");
			}
			
			System.out.println();
		}
//		int j =1;
//		for(int i = 1;i<2*n-i;i++) {
//			for(j =1;j<=i;j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//			if(j>=n) {
//				for(j=n-1;j>=1;j--) {
//					System.out.print("*");
//				}
//				System.out.println();
//			}
//		}
//		for(int i =1;i<=n;i++) {
//			for(int j =1;j<=i;j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//		for(int i =n-1;i>=1;i--) {
//			for(int j =1;j<=i;j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		/*
		int row = 1;
		int star=1;
		while(row <=2*n-1) {
			int i=1;
			while(i<=star) {
			System.out.print("*");
			i++;
			}
		if(row<n) {
			star++;
		}else {
			star--;
		}
		row++;
		System.out.println();
		}
		*
		**
		***
		****
		*****
		****
		***
		**
		*
		*/
		/*
		int row = 1;
		int star = 1;
		int space =n-1;
		while(row<=2*n-1) {
			int i =1;
			while(i<=space) {
				System.out.print(" ");
				i++;
			}
			int j =1;
			while(j<=star) {
				System.out.print("*");
					j++;
			}
			System.out.println();
			if(row<n) {
				star++;
				space--;
			}
			else {
				star--;
				space++;
			}
			row++;
		}
		*
		**
		***
		****
		*****
		****
		***
		**
		*

		*/
		
		
		
	}

}
