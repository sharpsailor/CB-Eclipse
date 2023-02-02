package Hw;
import java.util.*;
public class HW2_Patterns {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		/*int row = n;
		int star = n/2+1;
		int space = -1;
		while(row<=n) {
			int i =1;
			while(i<=row) {
				System.out.print("* ");
			i++;
			}
			int j =1;
			while(j<=space) {
				System.out.print("  ");
				j++;
			}
			if(i<=n/2+1) {
				star++;
				space+=2;
			}else {
				star--;
				space-=2;
			}
			row++;
			System.out.println();
		}*/

// Trinagle number pattern
	/*
        	1
		2	3	2
	3	4	5	4	3
4	5	6	7	6	5	4
	 * */
	int row = 1;
	int space=n-1;
	int count=1;
	while(row<=n) {
		int i =1;
		while(i<=space) {
			System.out.print("	");
			i++;
		}
		int j=1;
		while(j<=count) {
			System.out.print(count+"	");
			j++;
		}
		
		
	}
			
	}
}
/*import java.util.*;
public class Main {
    public static void main(String args[]) {
        // Your Code Here
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        int row=1;
        int star=n/2+1;
        int space=-1;

        while(row<=n)
        {
            int i=1;
            while(i<=star)
            {
                System.out.print("*     ");
                i++;
            }
            int j=1;
            while(j<=space)
            {
                System.out.print("      ");
                j++;
            }
            int k=1;
            if(row==1 || row==n)
            {
                k=2;
            }
            while(k<=star)
            {
                System.out.print("*     ");
                k++;
            }
            if(row<n/2+1)
            {
                star--;
                space+=2;
            }
            else
            {
                star++;
                space-=2;
            }
            System.out.println();
            row++;
        }
    }
}
 * */
