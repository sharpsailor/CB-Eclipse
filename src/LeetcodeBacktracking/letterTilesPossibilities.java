package LeetcodeBacktracking;

public class letterTilesPossibilities {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str ="AAABBC";
		String ans ="";
		System.out.println(Possibilities(str,ans));
	}
	public static int Possibilities(String ques, String ans) {
		if(ques.length()==0) {
//			System.out.println(ans);
			return 1;
		}
		char ch = ques.charAt(0);
		int a1 =	Possibilities(ques.substring(1), ans);
		int a2 =   Possibilities(ques.substring(1), ans+ch);
		return a1+a2;
	}
}
