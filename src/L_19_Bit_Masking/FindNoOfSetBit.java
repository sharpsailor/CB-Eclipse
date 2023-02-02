package L_19_Bit_Masking;

public class FindNoOfSetBit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 84;
		System.out.println(FastCountSet(n)); 
	}
	public static int FastCountSet(int n) {
		int count =0;
		while(n>0) {
			n=(n&(n-1));
			count++;
		}
		return count;
	}

}
