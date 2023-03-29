package Lec27_28BackTracking;

public class sudoku_solver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] grid = { { 3, 0, 6, 5, 0, 8, 4, 0, 0 }, 
								{ 5, 2, 0, 0, 0, 0, 0, 0, 0 },
								{ 0, 8, 7, 0, 0, 0, 0, 3, 1 },
								{ 0, 0, 3, 0, 1, 0, 0, 8, 0 },
								{ 9, 0, 0, 8, 6, 3, 0, 0, 5 },
								{ 0, 5, 0, 0, 9, 0, 6, 0, 0 },
								{ 1, 3, 0, 0, 0, 0, 2, 5, 0 },
								{ 0, 0, 0, 0, 0, 0, 0, 7, 4 },
								{ 0, 0, 5, 2, 0, 6, 3, 0, 0 } };
			Print(grid, 0, 0);
	}
	public static void Print(int[][]grid , int row,int col) {
		if(col==9) {
			col=0;
			row+=1;
		}
		if(row==9) {
			System.out.println("***********************");
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
				System.out.print(grid[i][j]+"  ");
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
		return true;
	}

}
