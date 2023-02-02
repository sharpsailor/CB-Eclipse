package lec5;
import java.util.*;
public class GCD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner sc = new Scanner(System.in);
			int n1 = sc.nextInt();
			int n2 = sc.nextInt();
			while(n1%n2!=0) {
				int rem = n1%n2;
				n1 = n2;
				n2 = rem;
			}
			System.out.print(n2);
	}

}
