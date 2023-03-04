package RecursionDoubts;

import java.util.Scanner;

public class ReplacePi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0) {
			String str = sc.next();
			Replace_Pi(str, "");
			System.out.println();
		}
	}
	public static void Replace_Pi(String ques, String ans) {
		if(ques.length()==0) {
			System.out.println(ans);
			return;
		}
		if(ques.length()>=2&& ques.charAt(0)=='p' && ques.charAt(1)=='i') {
			Replace_Pi(ques.substring(2), ans+"3.14");
		}else {
			Replace_Pi(ques.substring(1), ans+ques.charAt(0));
		}
	}

}
