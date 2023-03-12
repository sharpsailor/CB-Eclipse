package L_24Recursion;

import java.util.Scanner;

public class MazePath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.print("\n"+Path(0,0,n-1,n-1,""));
	}
	public static int Path(int cr, int cc, int fr, int fc,String ans) {
		if(cr==fr && cc==fc) {
			System.out.print(ans+" ");
			return 1;
		}
		if(cr>fr|| cc>fc) {
			return 0;
		}
		int a2 =Path(cr+1,cc,fr,fc,ans+"V");
		int a1 = Path(cr,cc+1,fr,fc,ans+"H");
		int a3=0;
		if(cr==cc) {
			a3 =Path(cr+1,cc+1,fr,fc,ans+"D");			
		}
		return a1+a2+a3;
	}

}
