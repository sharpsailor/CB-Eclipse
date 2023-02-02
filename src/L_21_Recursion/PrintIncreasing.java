package L_21_Recursion;

public class PrintIncreasing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		PrintNum(n);
	}
	public static void PrintNum(int n) {
		if(n==0) {
			return;
		}
		PrintNum(n-1);
		System.out.println(n);
	}
}
