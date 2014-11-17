package designpatterns.proxy;

public class TestATMMachine {

	public static void main(String[] args) {
		GetATMData realATMMachine = new ATMMachine();
		GetATMData ATMproxy = new ATMProxy();
		
		System.out.println("ATM state: "+ATMproxy.getATMData());
		System.out.println("Cash In Machine: "+ATMproxy.getCashInMachine());
		
	}

}
