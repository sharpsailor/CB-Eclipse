package HackerBlock;
import java.util.*;
public class ToggleCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner sc = new Scanner(System.in);
			String str = sc.nextLine();
			System.out.println(toggleCase(str));
	}
	public static String toggleCase(String str) {
		StringBuilder sb = new StringBuilder(str);
		for(int i =0;i<sb.length();i++) {
			char ch = sb.charAt(i);
			if(ch>='a' && ch<='z') {
				char uch = (char)('A'+ch-'a');
				sb.setCharAt(i, uch);
			}else {
				char ich = (char)('a'+ch-'A');
				sb.setCharAt(i, ich);
			}
		}
		return sb.toString();
		}

}
