package OOPs;

public class Student {
	int age;
	String name ;
	public void Intro_yourSelf() {
		System.out.println("My Name is "+this.name+" and age is "+age);
	}
	public void SayHey(String name) {
		System.out.println(name+" Say Hey "+this.name);
	}
	public static void fun() {
		System.out.println("I am having fun");
	}
	static {
		System.out.println("Dil dhadakne do");
	}
}
