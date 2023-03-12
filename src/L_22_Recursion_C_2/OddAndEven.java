package L_22_Recursion_C_2;
import java.util.*;
public class OddAndEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if((n%2)!=0) {
			Odd(n);
		}else {
			Odd(n-1);
		}
		even(2,n);
	}
	public static void Odd(int n ) {
		if(n<=0) {
			return;
		}
		System.out.println(n);
		Odd(n-2);
	}
	public static void even(int curr, int n) {
		if(curr>=n) {
			return;
		}
		System.out.println(curr);
		even(curr+2,n);
	}
 
}
   