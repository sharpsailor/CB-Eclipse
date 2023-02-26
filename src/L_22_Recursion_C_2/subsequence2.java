package L_22_Recursion_C_2;

public class subsequence2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ques ="abcd";
		String ans = "";
		subsequence(ques, ans);
	}
	public static void subsequence(String ques, String ans) {
		if(ques.length()==0) {
			System.out.println(ans+" ");
			return;
		}
		char ch  = ques.charAt(0);
		subsequence(ques.substring(1), ans);
		subsequence(ques.substring(1), ans+ch);
	}

}
