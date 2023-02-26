package L_23Recursion;

public class dice_boardPath { 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int des = 4;
		int curr =0;
		PrintPath(0,des,"");
	}
	public static int PrintPath(int curr, int des,String ans) { 
		if(curr == des) {
			System.out.print(ans+" ");
			return  1;
		}
		if(curr>des) {
			return 0 ;
		}
		int count=0;
		for(int i  =1;i<=3;i++) {
		count=	PrintPath(curr+i,des,ans+i);
		}
		return count;
//	int a1=	PrintPath(curr+1,des,ans+1);
//	int a2=	PrintPath(curr+2,des,ans+2);
//	int a3=	PrintPath(curr+3,des,ans+3);
//		return a1+a2+a3;
	}
}
