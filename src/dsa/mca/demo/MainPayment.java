package dsa.mca.demo;

public class MainPayment extends Payment {

	@Override
	void pay() {
		System.out.println("cash payment");
		
	}

	public static void main (String[]args) {
		MainPayment p=new MainPayment();
		p.pay();
		p.printbill();
	}

	
	}
	

