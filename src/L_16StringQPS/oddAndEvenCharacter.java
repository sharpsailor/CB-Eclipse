package L_16StringQPS;
import java.util.*;
public class oddAndEvenCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		System.out.println(OddAndEven(str));
		
	}
	public static String OddAndEven(String s) {
		String str = "";
		for(int i =0;i<s.length();i++) {
			
			if(i%2==0) {
				str+=(char)(s.charAt(i)+1);	
			}else {
				str+=(char)(s.charAt(i)-1);
			}
		}
		return str;
	}

}
