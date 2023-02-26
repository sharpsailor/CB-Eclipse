package L_24Recursion;

public class Duplicate_Permutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ques = "abca";
		String ans ="";
		PrintAns(ques,ans);  
	}
	public static void PrintAns(String ques, String ans) {
		if(ques.length()==0) {
			System.out.println(ans);
			return;
		}
		for(int i =0;i<ques.length();i++) {
			char ch = ques.charAt(i);
			boolean flag =false;
			for(int j =i+1;j<ques.length();j++) {
				if(ques.charAt(j)==ch) {
					flag = true;
					break;
				}
			}
			if(!flag) {
				String s1 = ques.substring(0,i);
				String s2 = ques.substring(i+1);
				PrintAns(s1+s2,ans+ch);
			}
		}
	}

}
