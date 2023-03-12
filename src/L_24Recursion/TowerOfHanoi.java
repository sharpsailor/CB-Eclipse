package L_24Recursion;

public class TowerOfHanoi {
	static int count =0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 3;
		toh(n,"A","C","B");
	}
	public static void toh(int n , String src , String des, String hlp) {
		if(n==0) {
			return;
		}
		toh(n-1,src,hlp,des);
		System.out.println("Move " +n+" from "+src+" to "+des);
		toh(n-1,hlp,des,src);
	}
}
