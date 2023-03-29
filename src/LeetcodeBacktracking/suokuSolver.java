package LeetcodeBacktracking;

import java.util.Scanner;

public class suokuSolver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		int n = sc.nextInt();
		int[][] grid = new int[n][n];
		for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                grid[i][j] =sc.nextInt(); 
            }
        }
		Print(grid,0,0);
	}
	public static void Print(int[][]grid , int row,int col) {
		if(col==9) {
			col=0;
			row+=1;
		}
		if(row==9) {
//			System.out.println("***********************");
			Display(grid);
			return;
		}
		if(grid[row][col]!=0) {
			Print(grid,row,col+1);
		}
		else {
			for(int val =1;val<=9;val++) {
				if(isSafe(grid,row,col,val)) {
					grid[row][col]=val;
					Print(grid,row,col+1);
					grid[row][col]=0;
				}
			}
		}
	}
	public static void Display(int [][]grid) {
		for(int i =0;i<grid.length;i++) {
			for(int j =0;j<grid[0].length;j++) {
				System.out.print(grid[i][j]+" ");
			}
			System.out.println();
		}
	}
	public static boolean isSafe(int[][] grid , int row, int col ,int val ) {
		//col
		for(int i =0;i<9;i++) {
			if(grid[i][col]==val) {
				return false;
			}
		}
		//row
		for(int i =0;i<9;i++) {
			if(grid[row][i]==val) {
				return false;
			}
		}
		int r = row-row%3;
		int c = col -col%3;
		for(int i =r;i<r+3;i++) {
			for(int j =c;j<c+3;j++) {
				if(grid[i][j]==val) {
					return false;
				}
			}
		}
		return true;
	}

}
