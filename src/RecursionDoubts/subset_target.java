package RecursionDoubts;
import  java.util.*;

public class subset_target {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i =0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		int target = sc.nextInt();
		System.out.println("\n"+subSet(arr,0,"",target,0));
	}
	public static int subSet(int[]arr , int i, String ans,int target,int sum) {
		if(i==arr.length) {
			if(sum==target) {
				System.out.print(ans+"  ");
				return 1;
			}
			return 0;
		}
		int a1 =subSet(arr,i+1, ans+arr[i]+" ",target,sum+arr[i]);
		int a2 =subSet(arr,i+1,ans,target,sum);
		return a1+a2;
	}
}
