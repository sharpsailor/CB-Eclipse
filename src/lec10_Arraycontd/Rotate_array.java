package lec10_Arraycontd;

public class Rotate_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,3,4,5,6,7};
		int k =3;
		rotateArray(arr,k);
		for(int x:arr) {
			System.out.print(x+" ");
		}
	}
//	Reversal algorithm for rotation of array
	public static void rotateArray(int[]arr,int k) {
		int n = arr.length;
		k=k%n;
		Reverse(arr,0,n-k-1);
		Reverse(arr,n-k,n-1);
		Reverse(arr,0,n-1);
		
	}
	public static void Reverse(int[]arr,int i ,int j) {
		while(i<j) {
			int temp = arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
			i++;
			j--;
			}
		}
	public static void Rotate(int[]arr,int k ) {
		k=k%arr.length;
		while(k-->0) {
			int temp =arr[arr.length-1];
			for(int i =arr.length-2;i>=0;i--) {
				arr[i+1]=arr[i];
			}
			arr[0]= temp;	
		}
		
	}

}
