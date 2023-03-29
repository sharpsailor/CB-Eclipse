package HackerBlock;

import java.util.Scanner;

public class MaxFrequencyChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		int max = -1;
		char result =0;
		int[] arr = new int[256];
		for (int i = 0; i < str.length(); i++) {
			arr[str.charAt(i)]++;
			
		}
		for(int i =0;i<str.length();i++) {
			if(max<arr[str.charAt(i)]) {
				max = arr[str.charAt(i)];
				result = str.charAt(i);
			}
		}
		System.out.println(result);
	}

}
