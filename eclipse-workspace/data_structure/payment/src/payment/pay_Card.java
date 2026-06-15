package payment;

abstract class Payment{
	abstract void pay();
	
	void message() {
		System.out.println("Payment started");
	}
}
class upi extends Payment{
	
	void pay() {
		System.out.println("PAYING USING UPI");
	}
}
class card extends Payment{
	
	void pay() {
		System.out.println("Paying using card");
	}
}

public class pay_Card {
	
	public static void main(String args[]) {
		
		Payment u=new upi();
		Payment c=new card();
		u.pay();
		c.pay();
		
		
	} 
	

}
