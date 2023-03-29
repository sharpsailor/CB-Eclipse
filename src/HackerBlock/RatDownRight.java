package HackerBlock;

import java.util.Scanner;

public class RatDownRight {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		char[][]ch = new char[n][m];
		for(int i=0;i<n;i++) {
			String str = sc.next();
			for(int j =0;j<m;j++) {
				ch[i][j]=str.charAt(j);
			}
		} 
		int[][] ans = new int[n][m];
		Print(ch, 0,0,ans);
	}
	public static boolean Print(char[][]maze , int cr , int cc , int[][] ans) {
		if(cr==maze.length-1&&cc==maze[0].length-1&&maze[cr][cc]!='X') {
			ans[cr][cc]=1;
			Display(ans);
			return true;
		}
		if(cc>=maze[0].length||cr>=maze.length||maze[cr][cc]=='X') {
			return false;
		}
		maze[cr][cc]='X';
		ans[cr][cc]=1;
		if(Print(maze, cr, cc+1, ans)){
			return true;
		}
		if(Print(maze,cr+1,cc,ans)){
			return true;
		}
		maze[cr][cc]='O';
		ans[cr][cc]=0;
		return false;
	}
	public static void Display(int[][] ans)
	{
		for(int i=0;i<ans.length;i++) {
			for (int j = 0; j < ans[0].length; j++) {
				System.out.print(ans[i][j]+" ");
			}
			System.out.println();
		}
	}
}
