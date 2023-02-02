package L_21_Recursion;

public class PrintDecreasing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		PrintNum(n);
	}
	public static int PrintNum(int n) {
		if(n==0) {
			return 1;
		}
		System.out.println(n);
		return PrintNum(n-1);
	}

}
 