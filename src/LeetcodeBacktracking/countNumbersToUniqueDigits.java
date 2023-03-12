package LeetcodeBacktracking;
import java.util.*;
public class countNumbersToUniqueDigits {
	static int count=0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		countUnique(0,(int) Math.pow(10, n));
	}
	public static int countUnique(int curr,int n ) {
		if(n==0) return 1;
		int ans =10;
		int current =9;
		int start =9;
		while(n-->1 && start==9) {
			current*=(start--);
			ans+=current;
		}
		return ans;
	}
}
