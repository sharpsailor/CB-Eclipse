package HackerBlock;
import java.util.*;
public class BooleanMatrixWithoutArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[][] arr = new int[n][m];
		for(int i =0;i<arr.length;i++) {
			for(int j =0;j<arr[0].length;j++) {
				arr[i][j]= sc.nextInt();
			}
		}
		boolean  flag;
		for(int i=0;i<n;i++) {
			if(arr[i][0]==1) {
				flag = true;
			}
			for(int j =1; j<m;j++) {
				if(arr[i][j]==1) {
					
				}
			}
		}
	}
	
}
