package L_16StringQPS;

public class GoodString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printSubstring("cdexaeiezlbua");
	}
	public static void printSubstring(String str) {
		int count = 0;
		int max = 0;
		for(int i=0;i<str.length();i++) {
			 char Str1 =str.charAt(i);
			 if(printLongestSubstring(Str1)) {
				 count++;
			 }else {
				 max = Math.max(max, count);
				 count=0;
			 }
			}
		max = Math.max(max, count);
		System.out.println(max);
		}
	public static boolean printLongestSubstring(char ch)  {
			 if(ch == 'a' || ch == 'e'|| ch =='i'|| ch == 'o'|| ch =='u') {
				 return true;
			 }
		return false;
	}

}
