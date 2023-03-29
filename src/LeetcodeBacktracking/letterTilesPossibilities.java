package LeetcodeBacktracking;

public class letterTilesPossibilities {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str ="AAABBC";
		String ans ="";
		System.out.print(Possibilities(str,ans));
	}
	public static int  Possibilities(String ques, String ans) {
		int count =0;
		for (int i = 0; i < ques.length(); i++) {
			char ch = ques.charAt(i);
			boolean bool = false;
			for(int j =i+1;j<ques.length();j++) {
				if(ques.charAt(j)==ch) {
					bool = true;
					break;
				}
			}
			if(bool == false) {
				String s1 = ques.substring(0,i);
				String s2 = ques.substring(i+1);
				count+=Possibilities(s1+s2, ans+ch)+1;
			}
		}
		return count;
	}
} 
