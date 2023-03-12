package HackerBlock;

import java.util.*;
public class removehi{
public static void main(String[] args) {
	String str="abchibi";
	Scanner scn=new Scanner(System.in);
//	String str=scn.next();
System.out.println(CountremoveHi(str,""));
removeHi(str, "");
}  
 public static int CountremoveHi(String ques,String ans) {
	 int a1=0;
	 if(ques.length()==0){
//		System.out.println(ans+" ");
		return 1; 
	 }
	
	
	 if(ques.length()>=2 && ques.charAt(0)=='h'&& ques.charAt(1)=='i') {
//		removeHi(ques.substring(2), ans);
		 a1=a1+CountremoveHi(ques.substring(2), ans+"bye");
		

		}
	 else {
		a1=a1+CountremoveHi(ques.substring(1), ans+ques.charAt(0));
	 }
	
	return a1;
 }
 public static void removeHi(String ques,String ans) {
	 if(ques.length()==0){
		System.out.println(ans+" ");
		return ; 
	 }
	
	
	 if(ques.length()>=2 && ques.charAt(0)=='h'&& ques.charAt(1)=='i') {
		removeHi(ques.substring(2), ans);
		removeHi(ques.substring(2), ans+"bye");
		

		}
	 else {
		removeHi(ques.substring(1), ans+ques.charAt(0));
	 }
	
	
 }
}
//import java.util.*;
//public class Main {
//    public static void main(String[] args) {
//    Scanner sc = new Scanner(System.in);
//    String s = sc.next();
//    
//    // Part (a): count the number of times 'hi' appears in the string
//    int count = countHi(s);
//    System.out.println(count);
//    
//    // Part (b): remove all 'hi' from the string
//    String removed = removeHi(s);
//    System.out.println(removed);
//    
//    // Part (c): replace all 'hi' with 'bye' in the string
//    String replaced = replaceHi(s);
//    System.out.println(replaced);
//}
//
//// Recursive function to count the number of times 'hi' appears in a string
//public static int countHi(String s) {
//    if (s.length() < 2) {
//        return 0;
//    }
//    if (s.substring(0, 2).equals("hi")) {
//        return 1 + countHi(s.substring(2));
//    } else {
//        return countHi(s.substring(1));
//    }
//}
//
//// Recursive function to remove all occurrences of 'hi' from a string
//public static String removeHi(String s) {
//    if (s.length() < 2) {
//        return s;
//    }
//    if (s.substring(0, 2).equals("hi")) {
//        return removeHi(s.substring(2));
//    } else {
//        return s.charAt(0) + removeHi(s.substring(1));
//    }
//}
//
//// Recursive function to replace all occurrences of 'hi' with 'bye' in a string
//public static String replaceHi(String s) {
//    if (s.length() < 2) {
//        return s;
//    }
//    if (s.substring(0, 2).equals("hi")) {
//        return "bye" + replaceHi(s.substring(2));
//    } else {
//        return s.charAt(0) + replaceHi(s.substring(1));
//    }
//}
//
//}

