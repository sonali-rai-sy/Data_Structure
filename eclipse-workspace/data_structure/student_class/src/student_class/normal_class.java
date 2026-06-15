package student_class;

class Student{
	String name;
	int rollNo;
	int marks;
	
	void setData(String name,int rollNo, int marks) {
		this.name=name;
		this.rollNo=rollNo;
		this.marks=marks;
	}
	
	String getGrade() {
		if (marks>=80) {
			return "A";
		}
		else if (marks >= 60) {
            return "B";
        } else if (marks >= 40) {
            return "C";
        } else {
            return "Fail";
        }
		
	}
	
	void display() {
		
		System.out.println("Name is" + name);
		System.out.println("Roll no is" + rollNo);
		System.out.println("Marks is "+ marks);
	}
}

public class normal_class {

	public static void main(String args[]) {
		
		Student sh1=new Student();
		Student sh2=new Student();
		sh1.setData("asdu", 23, 45);
		sh2.setData("adee",45,100);
		sh1.display();
		sh2.display();
		
		
	}
}
