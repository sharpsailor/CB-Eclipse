package L_23Recursion;

import java.util.Scanner;

public class coinTosswithoutHead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		coinTossNoHead(n,"");
	}
	public static void coinTossNoHead(int n , String S) {
		
			if(n==0) {
				System.out.println(S);
				return;
			}
			if(S.length()==0 ||S.charAt(S.length()-1)!='H') {
				coinTossNoHead(n-1,S+"H");
		}
		coinTossNoHead(n-1,S+"T");
	}

}
   