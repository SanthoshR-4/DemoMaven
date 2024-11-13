package DemoMaven.Demo1;

public abstract class Payment implements MyCard {
	public void processPayment() {
		System.out.println("payment processed..."+pType);
	}
	public String pType;
	Payment(String pType){
		this.pType=pType;
	}
	
}
