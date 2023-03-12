package RecursionDoubts;

import java.util.Scanner;

public class canYouReadThis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		ReadLine(str);
	}
	public static void ReadLine(String str) {
		String S ="";
		for(int i =0;i<str.length();i++) {
			char ch  =str.charAt(i);
			if((ch>='A' || ch<='Z' )&& (str.charAt(1)>='a' ||str.charAt(1)<='z')) {
				S+=ch;
			}
		}
		System.out.println(S);
	}

}
