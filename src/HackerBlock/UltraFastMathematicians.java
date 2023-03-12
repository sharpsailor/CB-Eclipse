package HackerBlock;

import java.util.Scanner;

public class UltraFastMathematicians {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0) {
			String n = sc.next();
			String m = sc.next();
			XOR(n,m);
		}
	}
	public static void XOR(String n ,String m) {
		String s ="";
		for(int i =0;i<n.length();i++) {
			char ch = n.charAt(i);
			char ch1 = m.charAt(i);
			s+=(ch^ch1);
		}
		System.out.println(s);
	}

}
