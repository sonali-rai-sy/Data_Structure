package online_payment;

class payment{
	void pay() {
		System.out.println("Genric Payment");
	}
}

class upi {
	void pay() 
	{
		System.out.println("Paying using upi");
	}
	
}

public class Online {
public static void main(String args[]) {
	payment p=new upi();
	p.pay();
}
}