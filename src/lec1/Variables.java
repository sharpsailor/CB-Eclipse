package lec1;
import java.util.*;
// Lecture 1 on Variables,Arithmetic_Operators 
public class Variables {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
//		int a = 8;
//		int b = 9;
//		int c = a+b;
//		System.out.println(c);
//		System.out.println(a+b);
//		c+=3;
//		Commment 
//		System.out.println(c);
//		Comparison based Operator 
//		Question one SImple Interest 
/*		int P = 1000;
		int R = 5;
		int t = 2;
		int s = ((P*R*t)/100);
		System.out.println(s);
		*/
// Area of Triangle 
/*		int a = sc.nextInt();
		int b = sc.nextInt();
		if(a>b) {
			System.out.println(a);
		}else {
			System.out.println(b);
		}
		*/
//		Checking for above 18
		/* System.out.println("Enter the age");
		int age = sc.nextInt();
		if(age>=18) {
			System.out.println("You can vote");
		}else {
			System.out.println("You cant vote");
		}
		*/
//		Check for odd and even
/*		System.out.println("Enter the number");
		int a = sc.nextInt();
		if(a%2==0) {
			System.out.println("the number is even");
		}else {
			System.out.println("The number is odd");
		}
	*/	
//		Max of 3 numbers 
	/*	int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		if(a>b && a>c) {
			System.out.println("The number greater is "+a);
		}else if(b>c && b>a) {
			System.out.println("The number greater is "+b);
		}else {
			System.out.println("The number greater of all is "+c);
		}
		*/
//		Divisibilty by 3 and 4
	/*	int x = sc.nextInt();
		if(x%3==0 && x%4==0) {
			System.out.println("X is divisble by both 3 and 4");
		}else {
			System.out.println("No x is not divisble by both 3 and 4");
		} */
//		Grade check 
		/*int M = sc.nextInt();
		if(M>=70 ) {
			System.out.println("Grade A ");
		}else if (M<70 && M>=60) {
			System.out.println("Grade B ");
		}else if (M<60 && M>=50) {
			System.out.println("Grade C ");
		}else if (M<50 && M>=40) {
			System.out.println("Grade D ");
		}else if (M<40 && M>=35) {
			System.out.println("Fail");
		}
		*/
//		Loops 
//		Print 1 to 5
		/*
		 * int n = sc.nextInt();
		for(int i =1;i<=n;i++) {
			System.out.println(i);
		}*/
//		Add 1 to 5
		/*int count=0;
		for(int i =1;i<=5;i++) {
		count+=1;
		}
		System.out.println(count);
		*/
//		Print table for 6
		/*for(int i =1;i<=10;i++) {
			System.out.println(6*i);
		}*/
//		Print 13 table skipping numbers divisible by 4
		/*int n = 13;
		for(int i =1;i<=10;i++) {
			if(i%4==0) {
				i+=1;
			}
				System.out.println(n*i);
		}
		*/
//		Assignment questions
//		Hello World 10 times
		/*for(int i =1;i<=10;i++) {
			System.out.println("Hello World");
		}
		*/
//		Print even numbers till 1000
		/*for(int i =1;i<=1000;i++) {
			if(i%2==0) {
				System.out.println(i);
			}
		}*/
//		Print all odd numbers till 1000
		/*for(int i =1;i<=1000;i++) {
			if(i%2==1) {
				System.out.println(i);
			}
		*/
//		find roots using a quadratic equation
/*		int a = sc.nextInt();
		int b = sc.nextInt();
		int c =sc.nextInt();
		int d = -(b*b)-(4*a*c);
		int r = -(b/(2*a));
		int r1 = r + sqrt((d)/2*a);
		int r2 = r - sqrt((d)/2*a);
		if(d>0) {
			System.out.println("root1"+r1+" "+"root2"+r2);
		}else if(d<0) {
			System.out.println("Imaginary roots");
		}else {
			System.out.println(r);
		}
		*/
	}

	private static int sqrt(int i) {
		// TODO Auto-generated method stub
		return 0;
	}

}
