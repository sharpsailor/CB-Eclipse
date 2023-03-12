package LeetcodeBacktracking;
import java.util.*;
public class CombinationSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] candidates= {10,1,2,7,6,1,5};
		int target = 8;
		List<Integer> list = new ArrayList<>();
		List<List<Integer>> ans = new ArrayList<>();
		Sum_Com(candidates,target,list,ans,0);
		System.out.println(ans);
	}
	public static void Sum_Com(int[] candidates, int target,List<Integer> list ,List<List<Integer>> ans,int idx){
       if(target==0) {
    	   ans.add(new ArrayList<>(list));
//    	   System.out.println(list);
    	   return;
       }
		for(int i =idx;i<candidates.length;i++){
            if(target>=candidates[i]){
                int canTarget=target-candidates[i];
//                System.out.println(canTarget);
                list.add(candidates[i]);
                Sum_Com(candidates,canTarget,list,ans,idx+1);
                list.remove(list.size()-1);
            }
        }
    }
}
