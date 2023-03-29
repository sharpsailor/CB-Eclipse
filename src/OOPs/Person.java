package OOPs;

public class Person {
	private int age ;
	private String name ;
	public Person(String name, int age) {
		// TODO Auto-generated constructor stub
		this.name= name;
		this.age= age;
	}
	public Person() {
		// TODO Auto-generated constructor stub
		
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) throws Exception{
		if(age<0) {			
			throw  new Exception("Baklol age is -ve nahi hoti hai");
		}
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void Inroduce() {
		System.out.println("Heyyya this is "+name+" and my age is"+age );    
	}
}
   