package L_21_Recursion;

public class exponential {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Expo(4,5));
	}
	public static int Expo(int a, int b) {
	if(b==0) {
		return 1;
	}
	return a*Expo(a,b-1);
	}

}
    