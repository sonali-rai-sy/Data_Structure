package salary_encapsulation;

class employee{
	private int salary;
	public void setSalary(int salary) {
		this.salary=salary;
	}
	public int getSalary() {
		return salary;
	}
	
}

public class salaried {
public static void main(String args[]) {
	
	employee e =new employee();
	e.setSalary(15000);
	System.out.println(e.getSalary());
}
}
