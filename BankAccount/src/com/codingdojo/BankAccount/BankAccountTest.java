package com.codingdojo.BankAccount;

public class BankAccountTest {

	public static void main(String[] args) {
		
		BankAccount b1 = new BankAccount();
		BankAccount b2 = new BankAccount();
		BankAccount b3 = new BankAccount();
		
		b1.createAccNumber();
		System.out.println("Your ten digit account number is: " + b1.getAccountNumber());
		
		b2.createAccNumber();
		System.out.println("Your ten digit account number is: " + b2.getAccountNumber());
		
		b3.createAccNumber();
		System.out.println("Your ten digit account number is: " + b3.getAccountNumber());
		
		System.out.println("There are " + BankAccount.accountsCreated + " bank accounts created.");
		
		b1.depositMoney("sssdfsdf", 50.00);
		
		b2.depositMoney("checkings", 100.00);
		System.out.println("Checking balance is: " + b2.getCheckingBalance());
		
		b2.depositMoney("savings", 25.00);
		System.out.println("Savings balance is: " + b2.getSavingsBalance());
		
		b3.depositMoney("savings", 25.00);
		System.out.println("Savings balance is: " + b3.getSavingsBalance());
		
		b1.withdrawMoney("savings", 200.00);
		
		b3.withdrawMoney("savings", 20.0);
		System.out.println("Withdrew from account. Savings balance is now: " + b3.getSavingsBalance());
		
		b2.getBalanceAndTotal();
		
		
		
		
			

	}

}
