package L_21_Recursion;

public class TailRecursiveFactorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(TailFactorial(5,1));
	}
//	public static void tailFactorial(int n) {
//		if(n==1){
//			return n*tailFactorial(n+1); 
//		}
//		tailFactorial(n-1);
//		System.out.println(n);
//	}
	public static int TailFactorial(int n,int ans) {
		if(n==0) {
			return ans;
		}
		return TailFactorial(n-1,ans*n);
	}
}
