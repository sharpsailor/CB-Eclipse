package L_22_Recursion_C_2;

public class subsequenceCountWithRecursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ques ="abcd";
		String ans = "";
		System.out.println("\n"+subsequence(ques, ans));
	}

	public static int subsequence(String ques, String ans) {
		if(ques.length()==0) {
			System.out.println(ans+" ");
			return 1;
		}
		char ch  = ques.charAt(0);
		int a1 =subsequence(ques.substring(1), ans);
		int a2 =subsequence(ques.substring(1), ans+ch);
		return a1+a2;
	}

}
