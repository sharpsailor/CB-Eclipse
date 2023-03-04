//package HackerBlock;
//import java.util.*;
//public class BooleanMatrixWithoutArray {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
//		int m = sc.nextInt();
//		int[][] arr = new int[n][m];
//		for(int i =0;i<arr.length;i++) {
//			for(int j =0;j<arr[0].length;j++) {
//				arr[i][j]= sc.nextInt();
//			}
//		}
//	}
//	public static void BooleanMatrix(int[][]arr,int n ,int m) {
//		boolean row_flag = false;
//		boolean col_flag=false;
//		for(int i =0;i<n;i++) {
//			for(int j =0;j<m;j++) {
//				if(i==0 && arr[i][j]==1) {
//					row_flag = true;					
//				}
//				if(j==0 && arr[i][j]==1) {										
//					col_flag = true;
//				}
//				if(arr[i][j]==1) {
//					arr[i][0]=1;
//					arr[0][j]=1;
//				}
//			}
//		}
//		for(int i =1;i<n;i++) {
//			for(int j =)
//		}
//		
//		
//	}
//	
//}
