package LeetcodeBacktracking;
import java.util.*;
public class Wordsearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		char[][] board= new char[n][m];
		for(int i =0;i<n;i++) {
			String str =sc.next();
			for(int j = 0;j<m;j++) {
				board[i][j]=str.charAt(j);
			}
		}
		String word = sc.next();
		System.out.println(wordSearching(board, n, m, word));
	}
	public static boolean wordSearching(char[][]board,int cr , int cc,String word) {
		if( word.length() ==0) {
			return true;
		}
		
		if(cc<0||cr<0||cr>board.length||cc>board[0].length) {
			return false;
		}
		char ch =word.charAt(0);
		int [] r = {-1,1,0,0,1}; 	
		int [] c= {0,0,1,-1,1};
			if(board[cr][cc]==ch) {
				for(int i =0;i<r.length;i++) {
					wordSearching(board, cr+r[i], cc+c[i], word);				
				}				
			}
			return true;
	}
}
