package OOPs;

public class Student_Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s = new Student();
		System.out.println(s.age);
		System.out.println(s.name);
		s.age=15;
		s.name = "sharpsailor";
		System.out.println(s.age);
		System.out.println(s.name);
		Student s1 = new Student();
		s1.name ="Raj";
		s1.age=25;
		System.out.println(s1.age);
		System.out.println(s1.name);
		s1.Intro_yourSelf();
		s.Intro_yourSelf();
		s.SayHey("kamlesh");
		Student.fun();
	}

}
