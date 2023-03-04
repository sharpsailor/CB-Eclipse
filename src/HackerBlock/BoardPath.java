package HackerBlock;
import java.util.*;
public class BoardPath {
	static int count=0; 
    public static void main(String args[]) {
        // Your Code Here
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int face = sc.nextInt();
        PrintPath(0,face,"",size);
        System.out.println();
        System.out.println(count);
    }
    public static void PrintPath(int curr, int des,String ans,int size) { 
		if(curr == des) {
			System.out.print(ans+" ");
            count++;
			return ;
		}
		if(curr>des) {
			return ;
		}
		for(int i  =1;i<=size;i++) {
		PrintPath(curr+i,des,ans+i,size-1);
		}
    }
}
