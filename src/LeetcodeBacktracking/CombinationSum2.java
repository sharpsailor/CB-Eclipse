package LeetcodeBacktracking;
import java.util.*;
public class CombinationSum2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] candidates= {2,3,5,6};
		int target = 8;
		List<Integer> list = new ArrayList<>();
		List<List<Integer>> ans = new ArrayList<>();
		Sum_Com(candidates,target,list, ans,0);
		System.out.println(ans);
	}
	public static void Sum_Com(int[]candidates,int target,List<Integer> list,List<List<Integer>> ans, int idx) {
		if(target==0) {
			ans.add(new ArrayList<>(list));
//			System.out.println(ans);
			return ;
		}
		
		for(int i = idx;i<candidates.length;i++) {
			if(i>idx && candidates[i]==candidates[i-1]) {
				continue;
			}
			if(candidates[i]<=target) {
				int canTarget= target-candidates[i];
				list.add(candidates[i]);
				Sum_Com(candidates,canTarget,list,ans,i);
				list.remove(list.size()-1);
			}
		}
	}
}
