package Doubt1;
import java.util.*;
public class pattern_magic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int row = 1;
        int space =-1;
        int star = n;
        while(row<=2*n-1){
            int i = 1;
            while(i<=star){
                System.out.print("*");
                i++;
            }
            int j = 1;
            while(j<=space){
                System.out.print(" ");
                j++;
            }
            int k =1;
            if(row==1 || row==2*n-1){
                k=2;
            }
            while(k<=star){
                System.out.print("*");
                k++;
            }
            if(row <=(2*n-1)/2){
                star--;
                space+=2;
            }else{
                star++;
                space-=2;
            }
            System.out.println();
            row++;
            
        }
	}

}
