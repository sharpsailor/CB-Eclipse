package Doubt1;
import java.util.*;
public class armstrong_numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
						
		}

	public static int countDigit(int n ) {
		int c =0;
		while(n!=0) {
		n/=10;
		c++;
		}
		return c ;
	}

}
