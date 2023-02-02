package lec5;
import java.util.*;
public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.print(fibonacci(n));
		
	}
	public static int fibonacci(int n ) {
		int a = 0;
		int b=1;
//		n-=1;
		while(n!=0) {
			int temp = a+b;
			a= b;
			b=temp;
			n--;
		}
		return b;
	}
}
