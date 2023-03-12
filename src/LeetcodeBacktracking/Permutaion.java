package LeetcodeBacktracking;
import java.util.*;
public class Permutaion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {1,2,3};
		boolean[] bool = new boolean[arr.length];
		List<Integer> list = new ArrayList<>();
		List<List<Integer>>ans = new ArrayList<>();
		Perm(arr,bool,0,list,ans);
		System.out.println(ans);
	}
	public static void Perm(int [] arr ,boolean[]bool,int npfs,List<Integer>list , List<List<Integer>>ans) {
		if( npfs==arr.length)
		{
			ans.add(new ArrayList<>(list));
//			System.out.println(list);
			return;
		}
		for(int i =0;i<arr.length;i++) {
			if(bool[i]==false) {
				bool[i]=true;
				list.add(arr[i]);
				Perm(arr,bool,npfs+1,list,ans);
				bool[i]=false;
				list.remove(list.size()-1);
			}
		}
	}
}
