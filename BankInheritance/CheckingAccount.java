package BankInheritance;

public class CheckingAccount extends Bank{
	private double service_charge;
	private double upper_limit = 10000;
	
	
	public double getService_charge() {
		return service_charge;
	}
	public void setService_charge(double service_charge) {
		this.service_charge = service_charge;
	}
	public double getUpper_limit() {
		return upper_limit;
	}
	public void setUpper_limit(double upper_limit) {
		this.upper_limit = upper_limit;
	}
	
	
	
	@Override
	public double withdraw(double ammount) {
		double init = super.getInitialbalance();
		if(ammount <= upper_limit){
			init = init - ammount;
			super.setInitialbalance(init);
		}
		return super.getInitialbalance();
	}
	@Override
	public double deposit(double ammount) {
		double init = super.getInitialbalance();
		double total = init + ammount;
		super.setInitialbalance(total);
		return super.getInitialbalance();
	}
	
	
	

}
