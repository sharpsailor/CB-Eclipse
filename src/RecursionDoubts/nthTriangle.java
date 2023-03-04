package RecursionDoubts;
import java.util.*;
public class nthTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(Triangle(n, 0, 0));
	}
	public static int Triangle(int n ,int  i, int sum ) {
		if(i==n) {
			return sum;
		}
		 return Triangle(n, i+1,sum+i+1);
	}
}
