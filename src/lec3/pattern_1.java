package lec3;
import java.util.*;
public class pattern_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int r = 1;
		int s = 0;
		while(r<=n) {
			int i =1;
			while(i<=s) {
				System.out.print("  ");
				i++;
			}
			int j =1;
			while(j<=n) {
				System.out.print("*");
				j++;
			}
			System.out.println();
			s++;
			r++;
			n--;
		}
	}

}
