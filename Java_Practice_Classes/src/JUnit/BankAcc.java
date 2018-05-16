package JUnit;

public class BankAcc {
	
	private String firstName;
	private String lastName;
	private double balance;
	private int accType;
	
	public static final int CHECKING = 1;
	public static final int SAVING = 2;
	
	public BankAcc(String firstName, String lastName, double balance, int accType) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.balance = balance;
		this.accType = accType;
	}
	
	public double deposit(double amount, boolean branch){
		this.balance = this.balance + amount;
		return this.balance;
	}
	
	public double withdraw(double amount, boolean branch){
		this.balance = this.balance - amount;
		return this.balance;
	}

	public double getBalance() {
		return balance;
	}
	
	
	public int getAccType() {
		return accType;
	}

	public boolean isChecking(){
		if(this.getAccType() == CHECKING)
		{
			return true;
		}
		return false;
	}


}
