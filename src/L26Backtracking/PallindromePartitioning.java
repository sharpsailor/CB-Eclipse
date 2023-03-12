package L26Backtracking;
import java.util.*;
public class PallindromePartitioning {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			String ques ="NITIN";
			List<String> list = new ArrayList<>();
			List<List<String>> ans = new ArrayList<>();
			Partitioning(ques, list,ans);
			System.out.println(ans);
	}
	public static void Partitioning(String ques, List<String> list,List<List<String>> ans) {
		if(ques.length()==0) {
//			System.out.println(list);
			ans.add(new ArrayList<>(list));
//			System.out.println(ans);
			return;
		}
		for(int i =1;i<=ques.length();i++) {
			String str = ques.substring(0,i);
			if(Pallindrome(str)) {
				list.add(str);
				Partitioning(ques.substring(i), list,ans);				
				list.remove(list.size()-1);
			}
		} 
	}	
	public static boolean Pallindrome(String str) {
		int i =0;
		int j =str.length()-1;
		while(i<j) {
			if(str.charAt(i)!=str.charAt(j)) {
				return false;
			}
			i++;
			j--;
		}
		return true;
	}
}
