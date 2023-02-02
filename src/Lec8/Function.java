package Lec8;

public class Function {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello");
		int a = 7;
		int b = 9;
		Addition(a,b);
		sub(b,a);
	}
	public static void Addition(int a , int b) {
		int c = a+b;
		System.out.println(c);
	}
	public static void sub(int a , int b ) {
		int c = a-b;
		System.out.println(c);
	}

}
