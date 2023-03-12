package RecursionDoubts;

import java.util.Scanner;

public class SplitArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i =0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println(subSet(arr,0,0,"",0,""));
	}
	public static int subSet(int[]arr , int i,int sum1,String ans1,int sum2 , String ans2) {
		if(i==arr.length) {
			if(sum1==sum2) {
				System.out.println(ans1+" and "+ans2);
				return 1;
			}
			return 0;
		}
		int a1 =subSet(arr,i+1, sum1+arr[i],ans1+arr[i]+" ",sum2,ans2);
		int a2 =subSet(arr,i+1,sum1,ans1,sum2+arr[i],ans2+arr[i]+" ");
		return a1+a2;
	}
}
