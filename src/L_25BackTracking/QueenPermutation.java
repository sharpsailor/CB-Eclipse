package L_25BackTracking;

public class QueenPermutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 4;
		boolean[] board = new boolean[n];
		int tq =2;
		QueensPer(board, tq, "", 0);
	}
//	total queen = tq
//	QPSF = queen place so far 
//	ans = to print the queens with respect to board
//	Boolean  board - track placed  queens 
	public static void  QueensPer(boolean[]board, int tq , String ans,int qpsf) {
			if(qpsf==tq) {
				System.out.println(ans);
				return;
			}
			for(int i =0;i<board.length;i++) {
				// call tabhi jab false ho 
				if(board[i]==false) {
					 board[i]=true;
					 QueensPer(board, tq, ans+"b"+i+"q"+qpsf, qpsf+1);
					 board[i]=false;
				}
			}
	}
}
