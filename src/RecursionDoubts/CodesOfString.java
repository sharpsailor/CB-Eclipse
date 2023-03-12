package RecursionDoubts;
import java.util.*;
public class CodesOfString {

	 public static void main(String args[]) {
	        // Your Code Here
	        Scanner sc = new Scanner(System.in);
	        String s = sc.next();
	        ArrayList<String> list = new ArrayList<>();
	        Codes_Of_String(s,"",list);
	        System.out.print(list);
	    }
	    public static   void  Codes_Of_String(String ques,String ans,ArrayList<String> list) {
			if(ques.length()==0) {
				list.add(ans);
				return;
			}
			char ch = ques.charAt(0);
			Codes_Of_String(ques.substring(1),ans+(char)(ch+48),list);
			if(ques.length()>=2) {
				String s1= ques.substring(0,2);
				int num = Integer.parseInt(s1);
				if(num<=26) {
					Codes_Of_String(ques.substring(2),ans+(char)(96+num),list);
				}
			}
			
		}
}
