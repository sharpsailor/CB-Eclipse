package lec3;
import java.util.*;
public class pattern_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for (int i = 1; i <= n; i++) {
			for (int s = 1; s <= n - i; s++) { // Space = n-1
				System.out.print("  ");
			}
			for (int j = 1; j <= 2 * i - 1; j++) {
				if(j%2==1) {
					System.out.print("* ");					
				}else {
					System.out.print("! ");
				}
			}
			
			System.out.println();
		}
		
	}

}
