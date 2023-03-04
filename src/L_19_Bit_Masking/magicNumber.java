package L_19_Bit_Masking;

public class magicNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		System.out.println(magic(n));
	}
	public static int magic(int n) {
		 int mul = 5;
		 int ans =0;
		 while(n>0) {
			 if((n&1)!=0) {
				 ans = ans+mul;
			 }
			 mul =mul*5;
			 n=n>>1;
		 } 
		return ans;
	}
}
