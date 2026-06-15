package mobile_recharge;

class calling {
	String mobile_number;
	double balance;
	
	void setData(String mobile_number,double balance) {
		this.mobile_number=mobile_number;
		this.balance=balance;
	}
	
	double recharge(double amount) {
		
		balance=balance+amount;
		return balance;
	}
	
	double makeCall(double minute) {
		double cost=minute*2;
		if (cost<=balance) {
			
			System.out.println("Call Successful...");
			balance=balance-cost;
			
		}
		else {
			System.out.println("Insufficient balance...");
			
		}
		return balance;
		
	}
	
	double getBalance() {
		return balance;
	}
	
	
	void display() {
		
		System.out.println("Mobile number is" + mobile_number);
		System.out.println("Balance is" + balance);
		
		
		
	}
	
}

public class Mobile_recharge {
	public static void main(String args[]) {
	calling ch1=new calling();
	ch1.setData("9180672101",100 );
	 ch1.display();

	 ch1.recharge(50);
     ch1.makeCall(90);
     ch1.display();
	
	}
}
