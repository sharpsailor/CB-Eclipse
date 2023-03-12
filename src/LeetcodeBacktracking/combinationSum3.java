package LeetcodeBacktracking;
import java.util.*;
public class combinationSum3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k = 3;
		int n =9;
		List<Integer> list = new ArrayList<>();
		List<List<Integer>> ans = new ArrayList<>();
		ComSum(n, k, 0, list, ans, 1);
		System.out.println(ans);
	}
	public static void ComSum(int n , int k , int curr,List<Integer> list , List<List<Integer>> ans,int idx) {
		if(curr==k && n==0&& !Duplicates(ans,list)) {
			ans.add(new ArrayList<>(list));
			System.out.println(list);
			return;
		}
		for(int i =idx;i<=9;i++) {
			if(i<=n && curr<=k && !list.contains(i) ) {
				list.add(i);
				ComSum(n-i, k, curr+1, list, ans,idx+1);
				list.remove(list.size()-1);
			}
		}
	}
	public static boolean Duplicates(List<List<Integer>>ans,List<Integer>list) {
		for(List<Integer> l : ans) {
			boolean isDuplicate = true;
			for(int i =0;i<l.size();i++) {
				if(l.get(i)!=list.get(i)) {
					isDuplicate=false;
					break;
				}
			}
			if(isDuplicate) {
				return true;
			}
		}
		return false;
	}
}
