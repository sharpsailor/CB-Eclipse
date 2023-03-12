package RecursionDoubts;
import java.util.*;
public class PlayingWithBits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0) {
			int n1 = sc.nextInt();
			int n2 = sc.nextInt();
			int count =0;
			for(int i =n1;i<=n2;i++) {				
			count+=	Count(i);			
			}
			System.out.println(count);
		}
	}
	public static int Count(int n) {
		int count =0;
		while(n>0) {
			if((n&1)!=0) {
				count++;
			}
			n=n>>1;
		}
		return count;
	}

}
