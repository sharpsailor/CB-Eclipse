package lec3;
import java.util.*;
public class Patterns_0 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
//		int i =1;
//	 single row star pattern 
	/*	while(i<=n) {
			System.out.print("* ");
			i++;
		}
		* * * * * * * * * * */
//		Rectangle Star pattern using for loop 
//		for(int i =1;i<=n;i++) {
//			for(int j =1;j<=n;j++) {
//				System.out.print("* ");
//			}
//			System.out.println();
//		}
//		Rectangle Star pattern using while loop
//		int star =sc.nextInt();
//		int x = 1;
//		while(x<=star) {
//			int i =1;
//			while(i<=star) {
//				System.out.print("* ");
//				i++;
//			}
//			x++;
//			System.out.println();
//		}
/*		* * * * * 
		* * * * * 
		* * * * * 
		* * * * * 
		* * * * * 
*/
	/*	for(int i =1;i<=star;i++) {
			for(int j =1;j<=i;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		*/
/*
         * 
         * * 
         * * * 
         * * * * 
         * * * * *          
		 */
		/*
		int x = 1;
		while(x<=star) {
			int i =1;
			while(i<=x) {
				System.out.print("* ");
				i++;
			}
			x++;
			System.out.println();
		}
			* 
			* * 
			* * * 
			* * * * 
			* * * * * 
		  */
		/*for(int i =1;i<=star;i++) {
			for(int j =star;j>=i;j--) {
				System.out.print("* ");
			}
			System.out.println();
		}*/
/*		int x = 1;
		while(x<=star) {
			int i =star;
			while(i>=x) {
				System.out.print("* ");
				i--;
			}
			x++;
			System.out.println();
		}
		* * * * * 
		* * * * 
		* * * 
		* * 
		* 
*/ 
		int n =sc.nextInt();
		int row=1;
		int space =0;
		int star=n;
		while(row<=n) {
		int j = 1;
		while(j<=space) {
			System.out.print("  ");
			j++;
		} 
		int i =1;
		while(i<=star) {
			System.out.print("* ");
			i++;
		}
		System.out.println();
		row++;
		space++;
		star--;
	
	}
	}

}
