package Lec27_28BackTracking;

import java.util.Iterator;

public class N_queen {
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n =4;
		boolean [][] board = new boolean[n][n];
		Print(board,n,0);
	}
	public static void Print(boolean [][] board, int tq , int row) {
		if(tq ==0) {
			System.out.println("*********************************************");
			Display(board);
			return;
		}
		for(int col =0;col<board[0].length;col++) {
			if(isSafe(board,row,col)) {
				board[row][col]=true;
				Print(board,tq-1,row+1);
				board[row][col]=false;
			}
		}
	}
	public static boolean isSafe(boolean[][]board,int row , int col) {
		int r =row;
		int c = col;
		//up
		while(r>=0) {
			if(board[r][c]==true) {
				return false;
			}
			r--;
		}
		//left diagonal
		r=row;
		while(r>=0 && c>=0) {
			if(board[r][c]==true) {
				return false;
			}
			r--;
			c--;
		}
		//right diagonal
		r=row;
		c=col;
		while(r>=0 && c<board[0].length) {
			if(board[r][c]==true) {
				return false;
			}
			r--;
			c++;
		}
		return true;
	}
	public static void Display(boolean[][]board) {
		for(int i =0;i<board.length;i++) {
			for(int j =0;j<board[0].length;j++) {
				System.out.print(board[i][j]+"  ");
			}
			System.out.println();
		}
	}
}
