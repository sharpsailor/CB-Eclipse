package L_23Recursion;
import java.util.*;
public class coinToss {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		coinToss(n,"");
	}
	public static void coinToss(int n , String S) {
		if(n==0) {
			System.out.println(S);
			return;
		}
		coinToss(n-1,S+"H");
		coinToss(n-1,S+"T");
	}
}
