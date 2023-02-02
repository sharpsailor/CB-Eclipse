package lec2;
import java.util.*;
public class loops {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = 100;
		int i =1;
//		While loops syntax
	/*	while(i<=n) {
			System.out.println(i);
			i+=1;
		}
		*/
//		Sum till n 
		int count=0;
		while(i<=n) {
			count+=i;
			i++;
		}
		System.out.println(count);
//		Post and Pre increments
		int a =15;
//	   System.out.println(a);
//	   System.out.println(a++);
//	   System.out.println(a);
//	   int c =a++ + a-- + 8 - a-- - a++;
//	   int c =a++ + a-- + 8 + a-- - a++ -a++;
//	   System.out.println(c);
//		System.out.println(++a);
		int c = ++a - --a + ++a - a-- + a++ + --a; 
		System.out.println(c);
	}

}
