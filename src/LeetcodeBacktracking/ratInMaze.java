package LeetcodeBacktracking;

import java.util.Scanner;

public class ratInMaze {
	static boolean f = false;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner sc = new Scanner(System.in);
			int n = sc.nextInt();
			int m = sc.nextInt();
			char[][] maze = new char[n][m];
			for(int i =0;i<n;i++) {
				String str = sc.next();
				for(int j =0;j<m;j++) {
					maze[i][j]=str.charAt(j);
				}
			}
			int[][] ans = new int[n][m];
			MazePath(maze, 1, 1, ans);
			if(!f) {
				System.out.println("-1");
			}
	}
	public static void MazePath(char[][] maze, int cr ,int cc, int[][] ans ) {
		if(cc==maze[0].length-1 && cr==maze.length-1 && maze[cr][cc]!='X') {
			ans[cr][cc]=1;
			System.out.println();
			Display(ans);
			f=true;
			return;
		}
		if(cc<0 || cr<0 || cc>=maze[0].length||cr>=maze.length||maze[cr][cc]=='X') {
			return;
		}
		maze[cr][cc]='X';
		ans[cr][cc]=1;
		int[] c = {0,0,-1,1};
		int[] r = {-1,1,0,0};
		for(int i =0;i<c.length;i++) {
			MazePath(maze, cr+r[i], cc+c[i],ans);
			if(i==c.length) {
				MazePath(maze, cr, cc+c[i], ans);
			}
		}
		maze[cr][cc]='O';
		ans[cr][cc]=0;
		
	}
	public static void Display(int[][]ans) {
		for(int i =0;i<ans.length;i++) {
			for(int j = 0;j<ans[0].length;j++) {
				System.out.print(ans[i][j]+" ");
			}
			System.out.println();
		}
	}
}
