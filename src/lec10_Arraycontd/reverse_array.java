package lec10_Arraycontd;

public class reverse_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[]arr = {1,2,5,22,7};
		Reverse(arr);
	}
		public static void Reverse(int[]arr) {
			int i = 0;
			int j = arr.length-1;
			while(i<j) {
				int temp = arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
				i++;
				j--;
			}
			for(int x :arr) {
				System.out.print(x+" ");
			}
		}

}
