package Doubt1_MonuBhaia;
import java.util.*;
public class nextPermutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0) {
			int n = sc.nextInt();
			int[] arr = new int[n];
			for(int i = 0;i<n;i++) {
				arr[i]= sc.nextInt();
			}
			Permutation(arr);
		}
		
	}
	public static void Permutation(int[]arr) {
		int p =0,q=0;
		int n = arr.length;
		for(int i =n-2;i>=0;i--) {
			if(arr[i]<arr[i+1]) {
				p = i;
				break;
			}
		}
		for (int i = n-1; i>=0;i--) {
			if(arr[i]>arr[p]) {
				q=i;
				break;
			}
		}
		if(p==0 && q==0) {
			Reverse(arr,0,n-1);
			return;
		}
		int temp = arr[p];
		arr[p]=arr[q];
		arr[q]=temp;
		Reverse(arr,p+1,n-1);
		for(int x:arr) {
			System.out.print(x+" ");
		}
		System.out.println();
	}
	public static int[] Reverse(int[]arr,int i ,int j) {
		while(i<j) {
			int temp = arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
			i++;
			j--;
		}
		return arr;
	}
}
