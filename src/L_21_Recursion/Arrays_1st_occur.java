package L_21_Recursion;

public class Arrays_1st_occur {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int []arr = {2,3,4,2,5,7,2};
		 System.out.println(Index(arr,8 ,0));
	}
	public static int Index(int[]arr,int item,int n) {
		if(n ==arr.length-1) {
			return -1;
		}
		if(arr[n]==item) {
			return n;
		}
			return Index(arr,item,n+1);
	}

}
