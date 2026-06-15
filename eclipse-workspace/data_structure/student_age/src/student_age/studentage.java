package student_age;

class Student{
	private int age;
	public void setAge(int age) {
	if(age>0) {
		this.age=age;
		System.out.println("Person age is " + age);
	}
	else {
		
		System.out.println("Invalid age");
	}
		
		
	}
	
	public int getAge() {
		return age;
	}
	
	
}

public class studentage {

	public static void main(String args[]) {
		Student s=new Student();
		s.setAge(10);
		
	}
	
	
}
