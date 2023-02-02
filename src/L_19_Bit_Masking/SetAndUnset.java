package L_19_Bit_Masking;

public class SetAndUnset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 84;
		System.out.println(SetUnset(n)); 
	}
	public static int SetUnset(int n) {
		int count=0;
		while(n>0) {
			if((n&1)!=0) {
				count++;
			}
			n=n>>1;
		}
		return count;
	}

}
