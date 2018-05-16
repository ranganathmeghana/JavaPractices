package JUnit;

import static org.junit.Assert.*;
import java.awt.*;
import java.util.Arrays;

import org.junit.Test;

public class BankAccTest {

	@Test
	public void testDeposit() {
		BankAcc acc = new BankAcc("Meg", "Ran", 1000, BankAcc.CHECKING);
		double amt = acc.deposit(567, true);
		System.out.println(amt);
		assertEquals(amt, 1567, 0);
	}

	@Test
	public void testWithdraw() {
		BankAcc acc= new BankAcc("M", "R", 1700, BankAcc.CHECKING);
		double amt =acc.withdraw(500, true);
		assertEquals(amt, 1200,0);
		assertEquals(acc.getBalance(), 1200,0);
		//return Arrays.asList(new int[]{1,2,3,4});
		
		//NEVER DO THIS!! Dont have to asserts in one test method. Create a separate test method for test acc.getBalance() after withdrawal
	}

	@Test
	public void testGetBalance_withdraw() {
		BankAcc acc= new BankAcc("M", "R", 1700, BankAcc.CHECKING);
		acc.deposit(300, true);
		assertEquals(2000,acc.getBalance(),0);
		
	}
	
	@Test
	public void testGetBalance_deposit() {
		fail("Not yet implemented");
	}
	
	@Test
	public void isChecking(){
		BankAcc acc = new BankAcc("M", "R", 1700, BankAcc.CHECKING);
		boolean accType = acc.isChecking();
		assertEquals(accType, true);
	}
	
	@Test
	public void dummyTest(){
		fail("Not yet implemented");
		
	}

}
