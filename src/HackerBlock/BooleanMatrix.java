package HackerBlock;
import java.util.Scanner;

public class BooleanMatrix {

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
		int[]row = new int[n];
		int[]col = new int[m];
		for(int i =0;i<n;i++) {
			for(int j = 0;j<m;j++) {
				if(arr[i][j]==1) {
					row[i]=1;
					col[j]=1;
				}
			}
		}
		for(int i =0;i<n;i++) {
			for(int j = 0;j<m;j++) {
				if(row[i]==1||col[j]==1) {
					arr[i][j]=1;
				}
			}
		}
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[0].length;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}

}
