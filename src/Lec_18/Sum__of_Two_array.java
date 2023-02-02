package Lec_18;
import java.util.*;
public class Sum__of_Two_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[]arr1 = new int[n];
		for(int i =0;i<n;i++) {
			arr1[i]=sc.nextInt();
		}
		int m = sc.nextInt();
		int[]arr2 = new int[m];
		for(int j =0;j<m;j++) {
			arr2[j]=sc.nextInt();
		}
	}
	public static void SumOfTwoArray(int[]arr1,int[] arr2,int n ,int m) {
		int i = n-1;
		int j = m-1;
		ArrayList<Integer> list = new ArrayList<>();
		int carry =0;
		while(i>=0 && j >=0) {
			int sum = arr1[i]+ arr2[j]+carry;
			list.add(sum%10);
			carry = sum/10;
			i--;
			j--;
		}
		while(i>=0) {
			int sum = arr1[i]+ carry;
			list.add(sum%10);
			carry = sum/10;
			i--;
		}
		while(j>=0) {
			int sum = arr1[j]+ carry;
			list.add(sum%10);
			carry = sum/10;
			j--;
		}
		if(carry>0) {
			list.add(carry);
		}
		Collections.reverse(list);
		for (int k =0;k<list.size();i++) {
			System.out.print(list.get(k)+", ");
		}
		System.out.print("END");
	}
	public static void Reverse(ArrayList list) {
		
	}

}
