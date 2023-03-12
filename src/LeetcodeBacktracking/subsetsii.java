package LeetcodeBacktracking;
import java.util.*;
public class subsetsii {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,2};
		List<List<Integer>> ans = new ArrayList<>();
		sub(arr,new ArrayList<>(),ans,0);
		System.out.println(ans);
	}
	public static void sub(int[]arr,List<Integer>list ,List<List<Integer>> ans,int idx ) {
		ans.add(new ArrayList<>(list));
		for(int i =idx;i<arr.length;i++) {
			if(i>idx && !list.contains(i)) {
				list.add(arr[i]);
				sub(arr,list,ans,i+1);				
				list.remove(list.size()-1);
			}
		}
	}
}
