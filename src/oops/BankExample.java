package oops;

public abstract class BankExample { // abstract class can have both abstract and no abstract method
	
	public abstract void checkBalance(); // no body required
	
	public abstract void depositMoney();
	
	public abstract void withdrawMoney();
	
	public void bank() {
		System.out.println("Welcome to Bank");
	}

}
