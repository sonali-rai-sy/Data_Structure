package parking_meter;
class vehachils{
	String vehacils_name;
	double balances;
	
	void setData(String vehacils_name,double balances ) {
		this.vehacils_name=vehacils_name;
		this.balances=balances;
		
	}
	
	double park_vehicls(int hour){
		double amount=0;
		amount= 10*hour;
		if (amount<=balances) {
			System.out.println("Balance is sufficient........");
			 System.out.println("Parking for " + hour + " hours...");
			balances=balances-amount;
		}
			else {
				System.out.println("Insufficent balances please recharge");
			}
			
			return balances;
		
		
	}
	
	double add_balances(double amount) {
		
		System.out.println("Adding balances");
		balances=balances+amount;
		return balances;
	}
	
	double getBalance() {
		
		return balances;
	}
	
	void display() {
		System.out.println("Vehacil number" +vehacils_name );
		System.out.println("you hav balances" +balances);
	}
	
	
}

public class Parking {
	
	public static void main(String args[]) {
		vehachils vch1=new vehachils();
		vch1.setData("Apache", 50);
		vch1.display();
		
		vch1.add_balances(100);
		vch1.park_vehicls(20);
		
		vch1.getBalance();
		
		
		
	}

}
