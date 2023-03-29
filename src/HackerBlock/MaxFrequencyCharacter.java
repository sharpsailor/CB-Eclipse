package HackerBlock;
import java.util.*;
public class MaxFrequencyCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		String str = sc.next();
		HashMap<Character,Integer> hm = new HashMap<>();
		for(int i =0;i<str.length();i++){
			char ch = str.charAt(i);
			if(hm.containsKey(ch)) {
				hm.put(ch, hm.get(ch)+1);
			}else {
				hm.put(ch, 1);
			}
		}
		System.out.println(hm.get(hm));
	}
}
