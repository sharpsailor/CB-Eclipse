package Doubt1_MonuBhaia;
import java.util.*;
public class MurthalParataha {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int Parantha = sc.nextInt();
		int noc = sc.nextInt();
		int[] arr = new int[noc];
		for(int i =0;i<noc;i++) {
			arr[i]= sc.nextInt();
		}
		Arrays.sort(arr);
		System.out.println(minimumTime(arr,Parantha));
	}
	public static int minimumTime(int[] arr , int Parantha) {
		int lo = 0;
		int hi = (arr[arr.length-1]*(Parantha*(Parantha+1)))/2;
		int ans =0;
		while(lo<=hi) {
			int mid = (lo+hi)/2;
			if(isitpossible(arr,mid,Parantha)) {
				ans=mid;
				hi = mid-1;
			}else {
				lo = mid+1;
			}
		}
		return ans;
	}
	public static boolean isitpossible(int[]arr,int mid ,int Parantha) {
		int P= 1;
		int time = 0;
		int tp = 0;
		int i =0;
		while(i<arr.length) {
			if(time+P*arr[i]<=mid) {
				time+=P*arr[i];
				P++;
				tp++;
			}else {
				P=1;
				time=0;
				i++;
			}
			if(tp>=Parantha) {
				return true;
			}
		}
		return false;
	}
	
}
