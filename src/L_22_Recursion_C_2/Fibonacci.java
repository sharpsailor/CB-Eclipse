package L_22_Recursion_C_2;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(fibonacci(5));
	}
	public static int fibonacci(int n) {
		if(n==0 || n==1) {
			return n;
		}
		int f1 = fibonacci(n-1);
		int f2 = fibonacci(n-2);
		return f1+f2;
	}

}       