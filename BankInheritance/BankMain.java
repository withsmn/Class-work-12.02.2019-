package BankInheritance;

public class BankMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SavingAccount sv = new SavingAccount();
		sv.setAc_name("DBBL");
		sv.setAc_number("123652154");
		sv.setInitialbalance(500);
		sv.setBalance(50000);
		sv.setInterestRate(5);
		
		System.out.println(sv.getBalance());
		System.out.println(sv.getInitialbalance());
		// withdraw 200 from 500 >> 500 - 200 = 300
		System.out.println(sv.withdraw(600));
		
		
		CheckingAccount ch = new CheckingAccount();
		ch.setAc_name("Checking");
		ch.setAc_number("125463");
		ch.setInitialbalance(500);
		ch.setUpper_limit(600000);
		ch.setService_charge(100);
		
		System.out.println("==================================");
		System.out.println(ch.getInitialbalance());
		System.out.println(ch.deposit(7000));
		
		System.out.println(ch.withdraw(8000));

	}

}
