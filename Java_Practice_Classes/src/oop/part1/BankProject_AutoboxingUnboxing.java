package oop.part1;

import java.util.ArrayList;
import java.util.Iterator;

import javax.swing.text.StyledEditorKit.ForegroundAction;

public class BankProject_AutoboxingUnboxing {

	private String bankName;
	ArrayList<Branch> branch = new ArrayList<Branch>();
	
	public BankProject_AutoboxingUnboxing(String bankName) {
		// TODO Auto-generated constructor stub
		this.bankName = bankName;
		this.branch = new ArrayList<Branch>();
	}
	
	public String getBankName() {
		return bankName;
	}



	public ArrayList<Branch> getBranch() {
		return branch;
	}



	public boolean addNewBranch(String branchName){
		
		if(findBranch(branchName)==null)
		{
		Branch branch= new Branch(branchName);
		this.branch.add(branch);
		return true;
		}
		return false;
	}
	
	public Branch findBranch(String branchname)
	{
		for(int i=0; i<branch.size();i++){
			
			if(branch.get(i).getBranchName().equals(branchname))
		{
				return branch.get(i);
				}
			
		}
		return null;	
	}
	
	public boolean addCustomer(String branchname, String customerName, double amount){
		
		Branch branch= findBranch(branchname);
		if(branch.findCustomer(customerName)==null){
			branch.addNewCustomer(customerName, amount);			
		return true;
		}
		return false;
	}
	
public boolean addCustomerTransaction(String branchname, String customerName, double amount){
		
		Branch branch= findBranch(branchname);
		if(branch.findCustomer(customerName)!=null){
			branch.addTransaction(customerName, amount);			
		return true;
		}
		return false;
	}


public void listCustomers(String branchName, boolean showTransactions){
	
	if(findBranch(branchName)!=null){
		
		Branch branchObj =findBranch(branchName);
		ArrayList<Customer> cusList = branchObj.getCustomer();
		Iterator<Customer> cusListI= cusList.iterator();
		
		while(cusListI.hasNext()){
			if(showTransactions==true){
			System.out.println(cusListI.next());
			ArrayList<Double> trans= cusListI.next().getAccount();
			for(int i=0; i<trans.size();i++){
				System.out.println(trans.get(i).toString());
			}
			}
			
			else{
				System.out.println(cusListI.next());
			}
		}
		
	}
System.out.println("no such branch exists");
}

public static void main(String[] args) {
	
	BankProject_AutoboxingUnboxing bnk = new BankProject_AutoboxingUnboxing("TD");
	bnk.addNewBranch("NMB");
	bnk.addCustomer("NMB", "bHARATH", 436358.35);
	bnk.addCustomer("NMB", "mEGHANA", 438.35);

	bnk.addNewBranch("gnv");
	bnk.addCustomer("gnv", "bHARATH", 358.35);
	bnk.addCustomer("gnv", "mEGHANA", 8.35);
	
	bnk.addCustomerTransaction("gnv", "bHARATH", 50000.8);
	bnk.addCustomerTransaction("gnv", "mEGHANA", 90.8);
	
	bnk.listCustomers("gnv", true);
}

}

class Branch {
	
	private String branchName;
	ArrayList<Customer> customer = new ArrayList<Customer>();
	
	public Branch(String branchname) {
		// TODO Auto-generated constructor stub
		this.branchName=branchname;
		this.customer = new ArrayList<Customer>();
	}

	public String getBranchName() {
		return branchName;
	}
	
	public boolean addNewCustomer(String cusName, double inialAmount)
	{
		if(findCustomer(cusName)==null)
		{
		Customer customerObj= new Customer(cusName, inialAmount);
		this.customer.add(customerObj);
		return true;
		}
		return false;
	}
	
	public boolean addTransaction(String cusName, double inialAmount){
		
		for(int i=0; i<this.customer.size();i++){
			if(findCustomer(cusName)!=null){
				Customer customer= findCustomer(cusName);
				customer.addInitialTransaction(inialAmount);
				return true;
			}
		}
		return false;
		
	}
	
	public Customer findCustomer(String cusName){
		
		for(int i=0; i<this.customer.size();i++){
			
			if(this.customer.get(i).getName().equals(cusName)){
				
				return this.customer.get(i);	
			}
		}
		return null;
	}

	public ArrayList<Customer> getCustomer() {
		return customer;
	}	
}



class Customer{
	
	private String name;
	ArrayList<Double> account = new ArrayList<Double>();
	
	public Customer(String name, double initialTransaction) {
		// TODO Auto-generated constructor stub.
		
		this.name=name;
		this.account =  new ArrayList<Double>();
		addInitialTransaction(initialTransaction);
	}
	
	public void addInitialTransaction(double amount){
		
		this.account.add(amount);
	}

	public String getName() {
		return name;
	}

	public ArrayList<Double> getAccount() {
		return account;
	}
	
	
}