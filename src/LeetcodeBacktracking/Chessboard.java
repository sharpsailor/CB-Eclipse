package LeetcodeBacktracking;
import java.util.*;
public class Chessboard {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		boolean[][] board = new boolean[n][n];
		board[0][0]= true;
		Chess(board,0,0, "{0,0}",n);
	}
	public static void Chess(int n , int cr , int cc , String ans ) {
		if(cr==n-1 && cc==n-1) {
			System.out.println(ans+"{"+cr+"-"+cc+"} ");
			return 1;
		}
		if(cr>=n)
//		Knight
		Chess(n,cr+2,cc+1,ans+"{"+cr+"-"+cc+"}K");
		Chess(n,cr+1,cc+2,ans+"{"+cr+"-"+cc+"}K");
		
//		Rook
//		Column
	for (int i = 0; i < =n; i++) {
		
	}
		
	}
}
