package L31TimeAndSpace;

public class PrimeSieveEratosthenes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 100;
		Prime_sieve(n);
	}
	public static void Prime_sieve(int n) {
//		jiss index pe false agaya vo Prime -hai 
		boolean [] prime = new boolean[n+1];
		prime[0]=true;//prime number nahi h
		prime[1]=true;//prime number nahi h
		for(int i =0; i*i<=prime.length ;i++) {
			if(prime[i]==false) {
				for(int j =2;j*i<prime.length;j++) {
					prime[j*i]=true;//marked prime nhi hai
				}
			}
		}
		for(int i =0;i<prime.length;i++) {
			if(prime[i]==false) {
				System.out.print(i+"  ");
			}
		}
	}
}
 