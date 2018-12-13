package com.codingdojo.BankAccount;
import java.util.*;

public class BankAccount {
	
	static int accountsCreated = 0;
	static int moneyStored = 0;
	
	private String accountNumber;
	private Double checkingBalance;
	private Double savingsBalance;
	
	
	public BankAccount() {
		accountsCreated ++;
		this.accountNumber = "";
		this.checkingBalance = 0.0;
		this.savingsBalance = 0.0;
		
	}
	
	
	

	private void accNum(){
		Random r = new Random();
		String acctNumber = "";
	
		for (int a = 0; a < 10; a++) {
			acctNumber += r.nextInt(9);
	
		}
		
		setAccountNumber(acctNumber);
		
		
	}
	
	public void createAccNumber(){
		accNum();
	}
	
	
	public void depositMoney(String account, Double amount) {
		if(account.equals("checkings")){
			Double balance = getCheckingBalance() + amount;
			setCheckingBalance(balance);	
			
		}
		
		else if (account.equals("savings")) {
			Double balance = getSavingsBalance() + amount;
			setSavingsBalance(balance);
		}
		
		else{
			System.out.println("Account has to be savings or checkings");
		}
		
	}
	
	
	public void withdrawMoney(String account, Double amount) {
		if(account.equals("checkings")){
			
			if (getCheckingBalance() < amount) {
				System.out.println("Insufficiant Funds for this transaction");
				
			}
			
			else {
				Double balance = getCheckingBalance() - amount;
				setCheckingBalance(balance);
			}
	}
		if(account.equals("savings")){
			
			if (getSavingsBalance() < amount) {
				System.out.println("Insufficiant Funds for this transaction");
				
			}
			
			else {
				Double balance = getSavingsBalance() - amount;
				setSavingsBalance(balance);
			}
	}
			
}
	
	public void getBalanceAndTotal() {
		System.out.println("Checking balance is: " + getCheckingBalance());
		System.out.println("Checking balance is: " + getSavingsBalance());
		System.out.println("Balance from both accounts is : " + (getCheckingBalance() + getSavingsBalance()));
		
	}


	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public Double getCheckingBalance() {
		return checkingBalance;
	}

	public void setCheckingBalance(Double checkingBalance) {
		this.checkingBalance = checkingBalance;
	}

	public Double getSavingsBalance() {
		return savingsBalance;
	}

	public void setSavingsBalance(Double savingsBalance) {
		this.savingsBalance = savingsBalance;
	}	
	
	
	
	

}
