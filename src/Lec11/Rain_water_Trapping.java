package Lec11;

public class Rain_water_Trapping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {0,1,0,2,1,0,1,3,2,1,2,1};
		System.out.println(RainWaterTrapping(arr));
		
	}
	public static int RainWaterTrapping(int[] arr) {
		int n = arr.length;
		int[] left  = new int[n];
		left[0] = arr[0];
		for(int i = 1;i<left.length;i++) {
			left[i]= Math.max(left[i-1],arr[i]);
		}
		int []right = new int[n];
		right[n-1]=arr[n-1];
		for(int j = n-2;j>=0;j--) {
			right[j]=Math.max(right[j+1],arr[j] );
		}
		int ans = 0;
		for(int i =0;i<n;i++) {
			ans += (Math.min(left[i],right[i])-arr[i]);
		}
		return ans;
	}

}
