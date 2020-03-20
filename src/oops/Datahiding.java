package oops;

public class Datahiding {

	private double balance;
	private String name;
	
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public static void main(String args[]) {
		System.out.println("========= In data hiding ====");
	}
}
