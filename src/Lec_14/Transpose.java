package Lec_14;

public class Transpose {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][] arr = {{2,3,1,7},
				{6,8,9,17},
				{21,27,34,-5},
				{6,36,-3,-7}};
		Transpose(arr);
		for(int i =0;i<arr.length;i++) {
			for(int j=0;j<arr[0].length;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
	public static void Transpose(int[][]arr) {
		for(int i =0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				int temp = arr[i][j];
				arr[i][j]= arr[j][i];
				arr[j][i]=temp;
			}
		}
	}

}
