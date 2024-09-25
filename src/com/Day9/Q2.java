package com.Day9;


@SuppressWarnings("serial")
class InsufficientFundException extends Exception {
	InsufficientFundException(int amount){
		super();
		System.out.println("Insufficient amount in the Account");
	}
}
class SavingAccount{
	int accountNumber;
	double balance;
	void deposit(int amount) throws InsufficientFundException{
			 
	}
	double withdraw(int amount) throws InsufficientFundException {
		if (amount>=(int)balance) {	
			throw new InsufficientFundException(amount);
		}
		return amount;
	}
}


public class Q2 {
	public static void main(String[] args) {
		SavingAccount sa = new SavingAccount();
		try {
			sa.withdraw(600);
		} catch (InsufficientFundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			sa.deposit(0);
		} catch (InsufficientFundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		sa.accountNumber=987266902;
		sa.balance=500.0;
		
	}

	
}