 package L_22_Recursion_C_2;

import java.util.Scanner;

public class subsequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String ques = sc.next();
		PrintSub(ques,"");
	}
	public static void PrintSub(String ques, String ans) {
		if(ques.length()==0) {
			System.out.print(ans+" ");
			return;
		}
		char ch = ques.charAt(0); 
		PrintSub(ques.substring(1),ans);
		PrintSub(ques.substring(1),ans+ch);
	}
	
}