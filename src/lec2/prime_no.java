package lec2;
import java.util.*;
public class prime_no {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		/*int n = sc.nextInt();
		int i =2;
		int count =0;
		while(i<n) {
			if(n%i==0) {
		count+=1;
		break;
			}
		i+=1;
		}
		if(count>0) {
			System.out.println("Not Prime");
		}else {
			System.out.println("Prime");
		}
		*/
//		Sum of digits
		/*int d = sc.nextInt();
		int sum =0;
		while(d!=0) {
			int r = d%10;
			sum =sum+r;
			d/=10;
		}
		System.out.println(sum);*/
//		Reverse 
		int d = sc.nextInt();
		int sum =0;
		while(d!=0) {
			int r = d%10;
			sum =sum*10+r;
			d/=10;
		}
		System.out.println(sum);
	}

}
