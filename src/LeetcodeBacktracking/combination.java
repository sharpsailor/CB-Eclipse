package LeetcodeBacktracking;
import java.util.*;
public class combination {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 4;
		int k =2;
		List<Integer> list = new ArrayList<>();
		List<List<Integer>> ans = new ArrayList<>();
		printCom(n, k, 0, list, ans, 1);
		System.out.println(ans);
	}
	public static void printCom(int n , int k , int curr,List<Integer> list ,List<List<Integer>> ans,int idx) {
		if(curr==k) {
			ans.add(new ArrayList<>(list));
//			System.out.println(list);
			return;
		}
		for(int i =idx;i<=n;i++) {
			if(i<=n && curr<=k) {
				list.add(i);
				printCom(n,k,curr+1,list,ans,i+1);
				list.remove(list.size()-1);
			}
		}
	}
}
