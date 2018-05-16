package oop.part1;

public class BankAccount_Constructors {
	
	private long acountNumber;
	private int balance;
	private String customerName;
	private String email;
	private long phoneNumber;
	
	
	public BankAccount_Constructors() {
		
		this(123556, 456, "ammu", "gmsil", 434355);	
		//this.acountNumber =896579;
		//this.balance = 4567;
		System.out.println("default const");
	}
	
	public BankAccount_Constructors(long acountNumber,int balance,String customerName,String email, long phoneNumber ) {
		// TODO Auto-generated constructor stub
	
		System.out.println("entering the parameterized const");
		this.acountNumber = acountNumber;
		this.balance = balance;
		this.customerName = customerName;
		this.email = email;
		this.phoneNumber = phoneNumber;
	}
	
	
	public BankAccount_Constructors(String customerName, String email, long phoneNumber) {
		this(9876,120,customerName,email,phoneNumber);
	}

	public long getAcountNumber() {
		return acountNumber;
	}
	public void setAcountNumber(long acountNumber) {
		this.acountNumber = acountNumber;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public long getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	public void deposit(int fund){
		
		this.balance = this.balance + fund;
		System.out.println("the balance after deposit is" + this.balance);
	}
	
	public void withdraw(int fund){
		
		if(this.balance - fund >=0){
			this.balance = this.balance - fund;
			System.out.println("the balance after withdrawal is" + this.balance);
		}
		
		else {
			System.out.println("the balance of" +this.balance + "is too less to withdraw a fund of" + fund); 
		}
	}
	
	public static void main(String[] args) {
		
//		BankAccount account = new BankAccount();
//		account.setAcountNumber(12345);
//		account.setCustomerName("meghana");
//		account.setEmail("gmail");
//		account.setPhoneNumber(1234567890);
//		
//		account.withdraw(100);
//		
//		account.deposit(100);
//		
//		account.withdraw(50);
		
		
		BankAccount_Constructors account = new BankAccount_Constructors("meghana", "gmail", 12345);
		
		System.out.println(account.getAcountNumber());
	}
	
}
