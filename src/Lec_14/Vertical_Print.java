package Lec_14;

public class Vertical_Print {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][] arr = {{2,3,1,7,5},
						{6,8,9,17,18},
						{21,27,34,-5,11},
						{6,36,-3,-7,-8}};
		Display(arr);
	}
public static void Display(int[][] arr) {
		for(int col =0;col<arr[0].length;col++) {
			if(col%2==0) {
				for(int row=0;row<arr.length;row++) {
					System.out.print(arr[row][col]+" ");
				}
			}else {
				for(int row =arr.length-1;row>=0;row--) {
					System.out.print(arr[row][col]+" ");
				}
			}
			System.out.println();
		}
	}

}
