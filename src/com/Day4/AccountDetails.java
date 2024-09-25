package com.Day4;
import java.util.Scanner;

//Question 3: BankAccountDetails

class Account{
	private int accountId;
	private String accountType;
	private int balance;
	
	public boolean withdraw(int n) {
		if(getBalance() > 0 && getBalance() >= n && n > 0) {
			setBalance(getBalance() - n);
			System.out.println("Balance amount after withdraw: " + getBalance());
			return true;
		}
		else {
			System.out.println("Sorry!!! No enough balance");
			return false;
		}
		
	}

	public int getAccountId() {
		return accountId;
	}

	public void setAccountId(int accountId) {
		this.accountId = accountId;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}
	
}


public class AccountDetails {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		AccountDetails a = new AccountDetails();
		Account ac = new Account();
		a.getAccountDetails(sc,ac);
		
	}
	
	public Account getAccountDetails(Scanner sc, Account ac) {
		System.out.println("Enter account id: ");
		ac.setAccountId(sc.nextInt());
		sc.nextLine();
		System.out.println("Enter account type: ");
		ac.setAccountType(sc.nextLine());
		System.out.println("Enter balance: ");
		ac.setBalance(sc.nextInt());
		while(true) {
		if(ac.getBalance() <= 0 ) {
			System.out.println("Balance should be positive");
			System.out.println("Enter balance: ");
			ac.setBalance(sc.nextInt());
		}
		else if(ac.getBalance() > 0) {
				getWithdrawAmount(sc, ac);
				break;
				}
			}
		return null;
		}

		
		
	
	public int getWithdrawAmount(Scanner sc, Account ac) {
		System.out.println("Enter amount to be withdrawn: ");
		int withdraw = sc.nextInt();
		while(true) {
		if(withdraw <= 0 || ac.getBalance() < withdraw) {
			System.out.println("Amount should be positive");
			withdraw = sc.nextInt();
			
		}
		else{
			ac.withdraw(withdraw);
			break;
		}
		}
		return 0;
	}

}
