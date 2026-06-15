package emplayee;


class employee{
	String name;
	int id;
	double salary;
	
	void setData(String name,int id,double salary){
		this.name=name;
		this.id=id;
		this.salary=salary;
		
	}
	double calculateBonous() {
		if(salary>=50000) {
			return salary * 0.10;
		}
		
		else if(salary>=30000) {
			return salary * 0.05;}
			else {
				return salary * 0.02;
			
		}
	}
	
	void display() {
		System.out.println("Name is " + name);
		System.out.println("Id is" + id);
		System.out.println("Salary is" + salary);
		System.out.println("Bonous is" + calculateBonous());
	}
	
}

public class salary {
	
	public static void main(String args[]) {
		
		employee emp1=new employee();
		employee emp2=new employee();
		emp1.setData("Aditya", 12, 90000);
		emp2.setData("sonali", 13, 22000);
		emp1.display();
		emp2.display();
		
		
	}

}
