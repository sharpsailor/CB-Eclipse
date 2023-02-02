package Lec13contd._Array_2D;
import java.util.*;
public class displayArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int m = scn.nextInt();
		int [][]a = new int[n][m];
		for(int i =0;i<n;i++) {
			for(int j = 0;j<m;j++) {
				a[i][j]=scn.nextInt();
			}
		}
		Display(a);
		
	}
	public static void Display(int[][] a) {
		for(int i =0;i<a.length;i++) {
			for(int j =0;j<a[i].length;j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
	}

}
