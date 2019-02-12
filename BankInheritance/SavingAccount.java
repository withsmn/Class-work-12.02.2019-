package BankInheritance;

public class SavingAccount extends Bank{
	private double interestRate;

	
	public double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}

	@Override
	public double withdraw(double ammount) {
		double init = super.getInitialbalance();
		if(ammount <= init){
			init = init - ammount;
			super.setInitialbalance(init);
		}else{
			System.out.println("You Do Not Have enough balance");
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
