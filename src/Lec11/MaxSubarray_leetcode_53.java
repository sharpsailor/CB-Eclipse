package Lec11;

public class MaxSubarray_leetcode_53 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {-2,1,-3,4,-1,2,1,-5,4};
		System.out.println(maxSubArray(arr));
	}
	public static int maxSubArray(int[] arr) {
		int ans = Integer.MIN_VALUE;
		for(int i =0;i<arr.length;i++) {
			int prevSum=0;
			for(int j =i;j<arr.length;j++) {
				prevSum +=arr[j];
				ans=Math.max(ans, prevSum);
			}
		}
		return ans;
	}

}
