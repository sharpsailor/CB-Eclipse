package L_24Recursion;
import java.util.*;
public class Lexico_Counting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int n = sc.nextInt();
		Counting(0, n);
	}
	public static void Counting(int curr, int n) {
		if(curr>n) {
			return;
		}
		System.out.println(curr);
		int i =0;
		if(curr==0) {
			i=1;
		}
		for(;i<=9;i++) {
			Counting((curr*10)+i, n);
		}
	}
}
