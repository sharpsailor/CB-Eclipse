package L_24Recursion;
import java.util.*;
public class Permutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n =3;
		String str ="";
		for (int i = 1; i <=n; i++) {
			str+=i;
		}
		System.out.println(str);
//			String str ="123";
			String ans ="";
			Permutation(str, ans);
	}
	public static void Permutation(String ques ,String ans)
	{	if(ques.length()==0) {
			System.out.println(ans);
			return;
		}
		for(int i =0;i<ques.length();i++) {
				String s1 = ques.substring(0,i);
				String s2 = ques.substring(i+1);
				Permutation(s1+s2,ans+ques.charAt(i));
		}
	}
}
