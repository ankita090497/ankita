package oops;

public class Encapsulation {
	private double balance; // Data hiding concept 
	private String name;
	
	public double getBalance() { // Abstraction concept
		System.out.println("==========get balance called ");
		return balance;
	}

	public void setBalance(double balance) {  // Abstraction concept
		System.out.println("=========== set balance called =======");
		this.balance = balance;
	}
	
	public static void main(String args[]) {
		Encapsulation encapsulation = new Encapsulation();
		// set  value of balance 
		encapsulation.setBalance(25000.50);
		
		System.out.println("===== Balance ======" + encapsulation.getBalance());
	}
	
}
