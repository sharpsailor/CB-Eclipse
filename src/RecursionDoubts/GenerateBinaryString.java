package RecursionDoubts;

import java.util.Scanner;

public class GenerateBinaryString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0) {
			String str = sc.next();
			BinaryString(str, "");
			System.out.println();
		}
	}
	public static void BinaryString(String ques, String ans) {
		if(ques.length()==0) {
			System.out.print(ans+" ");
			return;
		}
		char ch = ques.charAt(0);
			if(ch=='?') {
				BinaryString(ques.substring(1),ans+'0');
				BinaryString(ques.substring(1),ans+'1');				
			}else {
				BinaryString(ques.substring(1),ans+ch);
			}
	}
}