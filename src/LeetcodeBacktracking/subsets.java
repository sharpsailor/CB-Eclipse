package LeetcodeBacktracking;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class subsets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,1,2};
		Arrays.sort(arr);
		List<List<Integer>> ans = new ArrayList<>();
		sub(arr,ans,new ArrayList<>(),0);
		System.out.println(ans);
	}
	public static void sub(int[]arr ,List<List<Integer>> ans,List<Integer>list,int idx ) {
			ans.add(new ArrayList<>(list));
//			System.out.println(ans);
			for(int i =idx;i<arr.length;i++) {
				list.add(arr[i]);
				sub(arr,ans,list,i+1);
				list.remove(list.size()-1);
			}
		}

}
