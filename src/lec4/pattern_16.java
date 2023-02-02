package lec4;
import java.util.*;
public class pattern_16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
//		for(int i =1;i<=n;i++) {
//			for(int j =1;j<=n-i;j++) {
//				System.out.print("  ");
//			}
//			for(int j =1;j<=n-i+1;j++) {
//				System.out.print("* ");
//			}
//			System.out.println();
//		}
//		for(int i =n-1;i>=1;i--) {
//			for(int j =1;j<=n-i;j++) {
//				System.out.print("  ");
//			}
//			for(int j =1;j<=n-i+1;j++) {
//				System.out.print("* ");
//			}
//			System.out.println();
//		}
//	Question 15
		int space = n-1;
		int star = n;
		int row = 1;
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
			if(row<n) {
				star--;
				space--;
			}else {
				star++;
				space++;
			}
			System.out.println();
			row++;
		}
	}

}
