package L_16StringQPS;

public class Pallindrome {
	public static boolean isPallindromeSubstring(String str ) {
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
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str ="abcd";
		printSubstring(str);
	}

	public static void printSubstring(String str) {
		int count=0;
		for(int i=0;i<str.length();i++) {
			for(int j =i+1;j<=str.length();j++) {
			String s1 = str.substring(i,j);
			if(isPallindromeSubstring(s1)) {
				count++;
			}
			}
		}
		System.out.println(count);
	}
 
}
