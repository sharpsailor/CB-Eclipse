package RecursionDoubts;

import java.util.*;

public class DicitonaryOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
			String ans ="";
			ArrayList<String> list = new ArrayList<>();
			Permutation(str, ans,str,list);
			Collections.sort(list);
			for(int i =0;i<list.size();i++) {
				System.out.println(list.get(i));
			}
	}
	public static void Permutation(String ques ,String ans,String org,ArrayList<String>list)
	{	if(ques.length()==0) {
			if(ans.compareTo(org)>0)
			{
				list.add(ans);
			}
			return;
		}
		for(int i =0;i<ques.length();i++) {
				String s1 = ques.substring(0,i);
				String s2 = ques.substring(i+1);
				Permutation(s1+s2,ans+ques.charAt(i),org,list);
		}
	}

}
