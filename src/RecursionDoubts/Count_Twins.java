package RecursionDoubts;

import java.util.Scanner;

public class Count_Twins {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String ques = sc.next();
		System.out.println(Twin(ques));
	}
	public static int Twin(String ques) {
		if(ques.length()<=2) {
			return 0;
		}
		int ans =0;
		if(ques.charAt(0)==ques.charAt(2)) {
			ans=1+Twin(ques.substring(1));
		}else {
			ans=Twin(ques.substring(1));
		}
		return ans;
	}
}
