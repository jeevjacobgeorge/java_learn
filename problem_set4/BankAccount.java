package problem_set4;
//Define a custom exception called InsufficientBalanceException and use it in a banking app simulation. 
public class BankAccount {
	private double balance;

	public BankAccount(double initialBalance) {
		if (initialBalance >= 0)	
			this.balance = initialBalance;
		else
			System.out.println("Initial Balance cannnot be negative");
	}
	public void deposit(double amt) {
		if (amt >= 0) {
			balance += amt;
			System.out.println("Deposit successfull.Current Balance:"+balance);
		}
		else
			System.out.println("Amount cannot be negative");
	}
	public void withdraw(double amt) throws InsufficientBalanceException {
		if(amt<=0) {
			System.out.println("Invalid amt");
		}
		else if(amt > balance){
			throw new InsufficientBalanceException("Insufficient Funds");
		}
		else {
			balance -= amt;
			System.out.println("Withdraw successfull.Current balance:"+ balance);
		}
	}
	public double getBalance() {
		return balance;
	}
	public static void main(String args[]) {
		BankAccount account = new BankAccount(343.4);
		account.deposit(44);
		account.deposit(45);
		try {
			account.withdraw(455);
			account.withdraw(33);	
		} catch (InsufficientBalanceException e) {
			System.out.println(e.getMessage());
		}
		account.getBalance();
	}
}
