package L_19_Bit_Masking;

public class uniqueNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {3,1,2,1};
		System.out.println(Unique_number(arr));
	}
	public static int Unique_number(int[]arr) {
		int ans=0;
		for(int i =0;i<arr.length;i++) {
			ans=ans^arr[i];
		}
		return ans;
	}

}
