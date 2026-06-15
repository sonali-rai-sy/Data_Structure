package bank;

class BankAccount{
	
	String accountholder;
	int accountnumber;
	double balance;
	
	
	void setdata(String accountholder,int accountnumber,double balance){
		this.accountnumber=accountnumber;
		this.accountholder=accountholder;
		this.balance=balance;
		
		
		
	}
	
	void deposit(double amount) {
		
		System.out.println("Deplositing..............");
		balance=balance+amount;
		
	
	}
	
	void withdraw(double amount) {
		
		if (amount<=balance) {
			System.out.println("Withdrawaing........");
		     balance=balance-amount;}
		     else {
		    	 System.out.println("Insufficient balance");
		     }
			
		
		
} 
	
	void display() {
		
		System.out.println("Name" + accountholder);
		
		System.out.println("Number" + accountnumber);
		System.out.println("Name" + accountholder);
		System.out.println("Name" + balance);
		
	
	
	}
}

public class Bank {
	public static void main(String args[]) {
		
		BankAccount bc1= new BankAccount();
		BankAccount bc2= new BankAccount();
		 bc1.setdata("Sonali", 1011, 5000);
		 bc1.display();
		 bc1.withdraw(500);
		 bc1.deposit(200);
		 bc1.display();
		
	}

}
