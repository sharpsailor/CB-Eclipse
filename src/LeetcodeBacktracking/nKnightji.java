package LeetcodeBacktracking;

public class nKnightji {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public static void Knight(boolean[][]board , int cr ,int cc , String ans) {
		if()
		if(cc==board.length) {
			cc=0;
			cr++;
		}
		if(cr>=board.length) {
			return;
		}
		if(isSafe(board,cr,cc)) {
			board[cr][cc]=true;
			Knight(board, cr, cc+1, ans+"{"+cr+"-"+cc+"}");
			board[cr][cc]=false;
		}
		Knight(board, cr, cc+1, ans);
	}
	private static boolean isSafe(boolean[][] board, int cr, int cc) {
		// TODO Auto-generated method stub
		
		return false;
	}
}
