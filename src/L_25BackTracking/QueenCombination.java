package L_25BackTracking;

public class QueenCombination {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 4;
		boolean[] board = new boolean[n];
		int tq =2;
		QueensCom(board, tq, "", 0,0);
	}
//	total queen = tq
//	QPSF = queen place so far 
//	ans = to print the queens with respect to board
//	Boolean  board - track placed  queens 
	public static void  QueensCom(boolean[]board, int tq , String ans,int qpsf,int idx) {
			if(qpsf==tq) {
				System.out.println(ans);     
				return;
			}
			for(int i =idx;i<board.length;i++) {
				// call tabhi jab false ho 
				if(board[i]==false) {
					 board[i]=true;
					 QueensCom(board, tq, ans+"b"+i+"q"+qpsf, qpsf+1,i+1);
					 board[i]=false;
				}
			}
	}
}
