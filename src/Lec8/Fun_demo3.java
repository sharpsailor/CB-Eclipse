package Lec8;

public class Fun_demo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello");
		int a = 7;
		int b = 9;
		System.out.println(Addition(a,b));
		System.out.println(sub(b,a));
	}
	public static int Addition(int a , int b) {
		int c = a+b;
		return c;
	}
	public static int sub(int a , int b ) {
		int c = a-b;
		return c;
	}

}
