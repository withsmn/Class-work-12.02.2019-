package BankInheritance;

public abstract class Bank {
	private String ac_name;
	private String ac_number;
	private double initialbalance;
	private double balance;
	
	
	

	
	public String getAc_name() {
		return ac_name;
	}
	public void setAc_name(String ac_name) {
		this.ac_name = ac_name;
	}
	public String getAc_number() {
		return ac_number;
	}
	public void setAc_number(String ac_number) {
		this.ac_number = ac_number;
	}
	public double getInitialbalance() {
		return initialbalance;
	}
	public void setInitialbalance(double initialbalance) {
		this.initialbalance = initialbalance;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	
	// ==============================================
	public abstract double withdraw(double ammount);
	public abstract double deposit(double ammount);
	
	

}
