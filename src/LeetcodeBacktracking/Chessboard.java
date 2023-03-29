package LeetcodeBacktracking;
import java.util.*;
public class Chessboard {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println("\n"+Chess(n, 0, 0, ""));
	}
	public static int Chess(int n , int cr , int cc , String ans ) {
		if(cr==n-1 && cc==n-1) {
			System.out.print(ans+"{"+cr+"-"+cc+"} ");
			return 1;
		}
		if(cr>=n||cc>=n) {
			return 0;
		}
		int count =0;
//		Knight
		count+=Chess(n,cr+2,cc+1,ans+"{"+cr+"-"+cc+"}K");
		count+=Chess(n,cr+1,cc+2,ans+"{"+cr+"-"+cc+"}K");
		
//		Rook
		if(cc==0||cr==0 ||cc==n-1||cr==n-1) {
			for (int i = 1; i <=n; i++) {
//			Column
				count+=Chess(n, cr, cc + i, ans + "{" + cr + "-" + cc + "}R");
//			Row
				count+=Chess(n,cr+i,cc,ans+"{"+cr+"-"+cc+"}R");
			}
		}
//		Bishop Move
		if(cr==cc|| cr+cc==n-1) {
			for (int i = 1; i <=n; i++) {
				count+=Chess(n,cr+i,cc+i,ans+"{"+cr+"-"+cc+"}R");
			}
		}
		
		return count;

		
	}
}
