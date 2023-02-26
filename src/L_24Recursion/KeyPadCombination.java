package L_24Recursion;
import java.util.*;
public class KeyPadCombination {
	static String[] codes = {"","abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wx", "yz"};
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "189";
		Print(str,"");
//		System.out.println(getKPC(str));
	}
	 
	public static void Print(String ques, String ans) {
		if(ques.length()==0) {
			System.out.print(ans+" ");
			return;
		}
		char ch = ques.charAt(0);
		String Key = codes[ch-'0'];
		for(int i =0;i<Key.length();i++) {
			Print(ques.substring(1),ans+Key.charAt(i));
		}
	}
//	public static List<String> getKPC(String str) {
//	    if (str==null || str.length() == 0) {
//	      List<String> bres = new ArrayList<>();
//	      bres.add("");
//	      return bres;
//	    }
//	    char ch = str.charAt(0);
//	    String ros = str.substring(1);
//	    List<String> rres= getKPC(ros);
//	    List<String> mres = new ArrayList<>();
//	    String codeforch = codes[ch - '0'];
//	    for (int i = 0; i < codeforch.length(); i++) {
//	      char chcode = codeforch.charAt(i);
//	      for (String val : rres) {
//	        mres.add(chcode + val);
//	      }
//	    }
//	    return mres;
//
//	  }
	
}
