package L_21_Recursion;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		System.out.println(Factorial(n));
	} 
	public static int Factorial(int n ) {
//		if(n==1) {
//			return 1;
//		}
//		return n*Factorial(n-1);
		return n==1 ?1 :n*Factorial(n-1);
	}

}
