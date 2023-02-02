package lec7_typeCasting;
import java.util.*;
public class AnyBaseToAnyBase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
//		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		int p =1 ;
		int sum = 0;
		while(n2!=0) {
			int rem = n2%8;
			sum+=rem*p;
			p= p*10;
			n2 = n2/8;
		}
		System.out.print(sum);
	}

}
