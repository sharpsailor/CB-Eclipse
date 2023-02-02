package Lec_14;

public class SpiarlMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [][] arr = {{2,3,1,7,5},
				{6,8,9,17,18},
				{21,27,34,-5,11},
				{6,36,-3,-7,-8}};
		SpiralDisplay(arr);
	}
	public static void SpiralDisplay(int[][]arr) {
		int minr =0;
		int minc =0;
		int maxr = arr.length-1;
		int maxc = arr[0].length-1;
		int tne = 4*5;
		int cnt = 0;
		while(cnt<tne) {
//			Top Wall 
			for(int i = minr ,j = minc;j<=maxc && cnt<tne ;j++) {
				System.out.print(arr[i][j]+" ");
				cnt++;
			}
			minr++;
//			right Wall
			for(int i =minr ,j = maxc;i<=maxr && cnt<tne ;i++) {
				System.out.print(arr[i][j]+" ");
				cnt++;
			}
			maxc--;
//			Bottom wall
			for(int i = maxr,j=maxc;j>=minc && cnt<tne ;j--) {
				System.out.print(arr[i][j]+" ");
				cnt++;
			}
			maxr--;
//			left wall 
			for(int i = maxr, j= minc;i>=minr && cnt<tne ;i--) {
				System.out.print(arr[i][j]+" ");
				cnt++;
			}
			minc++;
		}
		
		}
}
