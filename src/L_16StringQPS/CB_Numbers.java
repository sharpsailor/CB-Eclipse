package L_16StringQPS;
import java.util.*;
public class CB_Numbers {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		System.out.println(PrintSubstring(str));
	}
	public static int PrintSubstring(String str) {
		int count =0;
		boolean[] visited = new boolean[str.length()];
		for(int len = 1;len<=str.length();len++) {
			for(int si =0;si<=str.length()-len;si++) {
				int ei = si+len;
				String s = str.substring(si,ei);
//				Integer.parseInt(s); string to int
//				Long.parseLong(s;)  string to long
				if(isCBNumber(Long.parseLong(s)) && isVisited(visited,si,ei-1)==false) {
					for (int i = si; i <=ei-1; i++) {
						visited[i]=true;
					}
					count++;
				}
			}
		}
		return count;
		
	}
	public static boolean isVisited(boolean[] visited, int si , int ei) {
		for(int i =si ;i<=ei;i++) {
			if(visited[i]==true) {
				return true;
			}
		}
		return false;
	}
	public static boolean isCBNumber(long n) {
		int [] arr = {2,3,5,7,11,13,17,19,23,29};
		if(n==0 || n==1) {
			return false;
		}
		for(int i = 0;i<arr.length;i++) {
			if(arr[i]==n) {
				return true;
			}
		}
		for(int i =0;i<arr.length;i++) {
			if(n%arr[i]==0) {
				return false;
			}
		}
		return true;
	}

}
