package HackerBlock;
import java.util.*;
public class UniqueNumber2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i =0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
	}
	public static void unique(int[] arr ) {
		int xxor = 0;
		for(int val:arr) {
			xxor= xxor^val;
		}
		int rsbm = xxor & -xxor;
		int x =0;
		int y =0;
		for(int val:arr) {
			if((val&rsbm)==0) {
				x=x^val;
			}else {
				y  = y^val;
			}
		}
		if(x>y) {
			System.out.println(y);
			System.out.println(x);
		}else {
			System.out.println(x);
			System.out.println(y);
		}
	}

}
