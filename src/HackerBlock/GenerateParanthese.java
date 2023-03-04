package HackerBlock;
import java.util.*;
public class GenerateParanthese {
	public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ValidParenthesis(n,0,0,"");
    }
    public static void ValidParenthesis(int n , int open ,int close , String s){
        if(open==n && close == n){
            System.out.println(s);
            return;
        }
        if(close<open){
            ValidParenthesis(n,open,close+1,s+")");
        }
        if(open<n){
            ValidParenthesis(n,open+1,close,s+"(");
        }
    }
}
