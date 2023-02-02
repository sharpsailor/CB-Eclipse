package Lec8;

public class global_local {
	static int val =100;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int p = 9;
		fun(8,5);
		System.out.println(val);
	}
	public static void fun(int x , int y ) {
			x = x+9;
			System.out.println(x);
			
			System.out.println(val);
			int val = 9; 
			val = val + 9; // Changing value locally 
//		global_local.val =global_local.val +9;  changing value globally here 
			System.out.println(val);
	}

}
