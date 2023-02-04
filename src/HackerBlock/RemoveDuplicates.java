package HackerBlock;

import java.util.Scanner;

public class RemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		
	}
	public static String Compression1(String str) {
		String s = str.charAt(0)+"";
		for(int i =1;i<str.length();i++) {
			char curr = str.charAt(i);
			char prev = str.charAt(i-1);
			if(curr!=prev) {
				s+=curr;
			}
		}
		return s;
	}

}
