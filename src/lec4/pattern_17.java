package lec4;
import java.util.*;
public class pattern_17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int row = 1;
		int space=1;
		int star=n/2;
		while(row<=n) {
			int i =1;
			while(i<=star) {
				System.out.print("* ");
				i++; 
			}
			int j =1;
			while(j<=space) {
				System.out.print("  ");
				j++;
			}
			int k =1;
			while(k<=star) {
				System.out.print("* ");
				k++;
			}
			System.out.println();
			if(row<n/2+1) {
				star--;
				space+=2;
			}else {
				star++;
				space-=2;;
			}
			row++;
		}
//		for(int i =1;i<=n;i++) {
//			for(int j = 1;j<=i;j++) {
//				System.out.print("*");
//			}
//			for(int j =1;j<=2*(n-i);j++) {
//				System.out.print(" ");
//			}
//			for(int j = 1;j<=i;j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//		int star = 1;
//		int space = 2*n-3;
//		int row=1;
//		while(row<=n) {
//			int i =1;
//			while(i<=star) {
//				System.out.print("* ");
//				i++;
//			}
//			int j =1;
//			while(j<=space) {
//				System.out.print("  ");
//				j++;
//			}
//			int k =1;
//			if(row==n) {
//				k=2;
//			}
//			while(k<=star) {
//				System.out.print("* ");
//				k++;
//			}
//			star++;
//			space-=2;
//			row++;
//			System.out.println();
//		}
	}

}
