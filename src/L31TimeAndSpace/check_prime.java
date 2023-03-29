package L31TimeAndSpace;

public class check_prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 37;
		System.out.println(IsPrime(n));
	}
	public static boolean IsPrime(int n) {
		int div =2;
		while(div*div<=n) {
			if(n%div==0) {
				return false;
			}
			div++;
		}
		return true;
	}
}
  