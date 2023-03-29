 package LeetcodeBacktracking;

import java.util.Scanner;
public class N_Knights {
	static int Count = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		boolean[][] maze = new boolean[n][n];
		Print(maze, n,0);
		System.out.println(Count);
	}
	public static void Print(boolean [][] board, int tq , int row) {
		if(tq ==0) {
//			System.out.print(" ");
			Display(board);
			Count+=1;
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
		// Upper right
		int r = row;
		int c = col;
		while(r>=0 && c<board[0].length) {
			if(board[r][c]==true) {
				return false;
			}
			r-=2;
			c++;
		}
//		upper left
		r=row;
		c=col;
		while(r>=0 && c>=0) {
			if(board[r][c]==true) {
				return false;
			}
			r-=2;
			c--;
		}
//		right upper
		r = row;
		c=col;
		while(r>=0 && c<board[0].length) {
			if(board[r][c]==true) {
				return false;
			}
			r--;
			c+=2;
		}
//		left
		r = row;
		c = col;
		while(c>=0 && r>=0) {
			if(board[r][c]==true) {
				return false;
			}
			c-=2;
			r--;
		}
		return true;
	}
	public static void Display(boolean [][]board) {
		for(int i =0;i<board.length;i++) {
			for(int j =0;j<board[0].length;j++) {
				if(board[i][j]==true) {
					System.out.print("{"+i+"-"+j+"}"+" ");
				}
			}
//			System.out.println();
		}
		System.out.print(" ");
	}

}
