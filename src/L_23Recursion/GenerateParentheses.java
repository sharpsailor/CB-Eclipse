package L_23Recursion;
import java.util.*;
public class GenerateParentheses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n =3;
		List<String> list = new ArrayList<>();
		ValidateParenthese(n, 0, 0, "",list);
	}
//	public static void ValidateParenthese(int n , int open ,int close, String ans) {
//		if(open==n&& close==n) {
//			System.out.print(ans+" ");
//			return;
//		}
//		if(open<n) {
//			ValidateParenthese(n, open+1, close, ans+"(");
//		}
//		if(close<open) {
//			ValidateParenthese(n, open, close+1, ans+")");
//		}
//	}
	public static void ValidateParenthese(int n , int open ,int close,String ans, List <String>list) {
		if(open==n&& close==n) {
			list.add(ans);
			return ;
		}
		if(open<n) {
			ValidateParenthese(n, open+1, close, ans+"(",list);
		}
		if(close<open) {
			ValidateParenthese(n, open, close+1, ans+")",list);
		}
	}

}
