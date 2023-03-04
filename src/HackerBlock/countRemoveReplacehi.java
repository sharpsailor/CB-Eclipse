package HackerBlock;
import java.util.*;
public class countRemoveReplacehi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		Remove(str);
	}
	public static void Remove(String str) {
		String s = "";
		for(int i =0;i<str.length();i++) {    
			if((str.charAt(i)=='h' && str.charAt(i+1)=='i')||(str.charAt(i)=='i' && str.charAt(i-1)=='h')) {
				continue;
			}
			s+=str.charAt(i);
		}
		System.out.println(s);
	}

}
