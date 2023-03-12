package LeetcodeBacktracking;
import java.util.*;
public class Permutationii {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {3,3,0,3};
		boolean[] bool = new boolean[arr.length];
		List<Integer> list  = new ArrayList<>();
		List<List<Integer>> ans = new ArrayList<>();
		Arrays.sort(arr);
		Perm(arr,0,bool,list,ans);
		System.out.println(ans);
	}
	public static void Perm(int[] arr ,int npsf, boolean[] bool, List<Integer>list,List<List<Integer>>ans) {
		if(npsf==arr.length) {
			ans.add(new ArrayList<>(list));
//			System.out.println(list);
			return;
		}
		for(int i=0;i<arr.length;i++) {
			if(bool[i]==false) {
				if (i > 0 && arr[i] == arr[i-1] && !bool[i-1]) {
	                continue;
	            }
				bool[i]=true;
				list.add(arr[i]);
//				System.out.println(list);
				Perm(arr,npsf+1,bool,list,ans);
				bool[i]=false;
				list.remove(list.size()-1);
			}
		}
	}
}
